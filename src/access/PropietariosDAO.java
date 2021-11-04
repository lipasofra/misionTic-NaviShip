/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.PropietariosModel;
import org.json.simple.parser.ParseException;
import utils.connection;

/**
 *
 * @author lipasofra y camilo
 */
public class PropietariosDAO {

  protected Connection conn = null;

  //propietarios solo se puede ver (no modificar)
  public ArrayList<PropietariosModel> obtenerPropietarios() throws SQLException, IOException, ParseException, java.text.ParseException {
    ArrayList<PropietariosModel> propietario = new ArrayList();
    if (conn == null) {
      conn = connection.getConnection();
    }

    String sql = "SELECT propietario.pro_identificacion, propietario.pro_razonsocial, propietario.pro_tipo, propietario.pro_pais "
            + "FROM propietario ORDER BY pro_razonsocial ASC;";

    Statement statement = conn.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()) {
      PropietariosModel propietariounidad = new PropietariosModel(result.getLong(1), result.getString(2), result.getString(3), result.getString(4));
      propietario.add(propietariounidad);
    }
    return propietario;
  }

  public ArrayList<String> llenarComboPropietarios() throws SQLException, IOException, ParseException, java.text.ParseException {
    ArrayList<String> propietariosNombres = new ArrayList();
    if (conn == null) {
      conn = connection.getConnection();
    }

    String sql = "SELECT pro_razonsocial FROM propietario ORDER BY pro_razonsocial ASC; ";

    Statement statement = conn.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()) {
      propietariosNombres.add(result.getString(1));
    }
    return propietariosNombres;
  }

  public String llenarFieldPropietariosId(String nombre) throws java.text.ParseException {
    String idpro = null;
   
    try {
      if (conn == null) {
        conn = connection.getConnection();
      }

      String sql = "SELECT pro_identificacion FROM propietario WHERE pro_razonsocial='" + nombre + "';";

      Statement statement = conn.createStatement();
      ResultSet result = statement.executeQuery(sql);
      while (result.next()) {
        idpro = result.getLong(1) + "";
        
      }
    } catch (SQLException ex) {
      System.out.println("Error" + ex);
    }

    return idpro;
  }

}
