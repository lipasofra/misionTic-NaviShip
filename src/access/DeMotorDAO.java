/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DeMotorModel;
import org.json.simple.parser.ParseException;
import utils.connection;

/**
 *
 * @author lipasofra y camilo
 */
public class DeMotorDAO extends BarcoDAO {

  //imprimir la tabla
  public ArrayList<DeMotorModel> obtenerDemotor() throws SQLException, IOException, ParseException, java.text.ParseException {
    ArrayList<DeMotorModel> demotor = new ArrayList();
    if (conn == null) {
      conn = connection.getConnection();
    }

    String sql = "SELECT de_motor.registro, de_motor.marca, de_motor.cantidadMotores, de_motor.autonomia_horas, "
            + "propietario.pro_razonsocial FROM de_motor JOIN barco ON de_motor.registro=barco.registro JOIN propietario "
            + "ON barco.propietario=propietario.pro_identificacion;";

    Statement statement = conn.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()) {
      DeMotorModel barcoMotor = new DeMotorModel(result.getString(1), result.getString(2), result.getInt(3), result.getInt(4), result.getString(5));
      demotor.add(barcoMotor);
    }
    return demotor;
  }

  //insertar datos en la BD
  @Override
  public void agregarBarco(DeMotorModel barco) throws java.text.ParseException {

    try {
      if (conn == null) {
        conn = connection.getConnection();

        String registro = barco.getRegistro();
        String marca = barco.getMarca();
        int cantidadMotores = barco.getCantidadMotores();
        int autonomiaHoras = barco.getAutonomiaHoras();

        PreparedStatement statement;
        String sqlMotor = "INSERT INTO de_motor VALUES (?, ?, ?, ?);";
        statement = conn.prepareStatement(sqlMotor);
        statement.setString(1, registro);
        statement.setString(2, marca);
        statement.setInt(3, cantidadMotores);
        statement.setInt(4, autonomiaHoras);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
          System.out.println("insertado correctamente");
        } else {
          System.out.println("no se insertó");
        }
        //los atributos se sacan de la interfaz, en el paquete controlador con un "catch" de la info del campo (?)
      }

    } catch (SQLException ex) {
      System.out.println(ex);
    }

  }

  //update BD
  public void editarBarcoDeMotor(DeMotorModel barco) throws java.text.ParseException {

    try {
      if (conn == null) {
        conn = connection.getConnection();
      }

      PreparedStatement statement;
      String registro = barco.getRegistro();
      String marca = barco.getMarca();
      Integer cantidadMotores = barco.getCantidadMotores();
      Integer autonomia = barco.getAutonomiaHoras();

      String sql1 = "UPDATE de_motor SET Marca=?, cantidadMotores=?, autonomia_horas=? WHERE registro=?;";
      statement = conn.prepareStatement(sql1);
      statement.setString(1, marca);
      statement.setInt(2, cantidadMotores);
      statement.setInt(3, autonomia);
      statement.setString(4, registro);

      
      int rowsUpdate = statement.executeUpdate();
      if (rowsUpdate > 0) {
        System.out.println("actualizacion exitosa");
      }
    } catch (SQLException ex) {
      System.out.println("actualizacion fallida" + ex);
   }

  }

  public void editarPropietarioBarcoMotor(DeMotorModel barco) throws IOException, java.text.ParseException, SQLException {

    if (conn == null) {
      conn = connection.getConnection();
    }

    PreparedStatement statement;
    String registro = barco.getRegistro();
    Long propietario = barco.getPropietario();

    String sql = "UPDATE barco SET propietario=? WHERE registro=?;";
    statement = conn.prepareStatement(sql);
    statement.setLong(1, propietario);
    statement.setString(2, registro);
  }

  public ArrayList<String> getRegistrosDeMotor() throws IOException, java.text.ParseException, SQLException {
    ArrayList<String> registrosDeMotor = new ArrayList<>();

    if (conn == null) {
      conn = connection.getConnection();
    }

    String sql = "SELECT registro FROM de_motor ORDER BY registro;";

    Statement statement = conn.createStatement();
    ResultSet result = statement.executeQuery(sql);

    while (result.next()) {
      registrosDeMotor.add(result.getString(1));
    }
    return registrosDeMotor;
  }

  public DeMotorModel getDatosDeMotorSinRegistro(String registroSel) throws IOException, java.text.ParseException, SQLException {

    if (conn == null) {
      conn = connection.getConnection();
    }

    String sql = "SELECT de_motor.Marca, de_motor.cantidadMotores, de_motor.autonomia_horas, propietario.pro_razonsocial FROM de_motor JOIN barco ON de_motor.registro=barco.registro JOIN propietario ON barco.propietario=propietario.pro_identificacion WHERE de_motor.registro='" + registroSel + "';";


    Statement statement = conn.createStatement();
    ResultSet result = statement.executeQuery(sql);

    DeMotorModel deMotorSinReg = null;

    while (result.next()) {
      deMotorSinReg = new DeMotorModel(null, result.getString(1), result.getInt(2), result.getInt(3), result.getString(4));
    }

    return deMotorSinReg;
  }

  
  public void eliminarBarco(String registro) throws IOException, ParseException, java.text.ParseException {

    try {
      if (conn == null) {
        conn = connection.getConnection();
      }

      String sql = "DELETE FROM de_motor WHERE registro=?";
      PreparedStatement statement = conn.prepareStatement(sql);
      statement.setString(1, registro);

      int rowsDeleted = statement.executeUpdate();
      if (rowsDeleted > 0) {
        System.out.println("Borrado exitoso");
      } else {
        System.out.println("no se borró");
      }

    } catch (SQLException ex) {
      System.out.println("error" + ex);
    }
  }
  
  
}
