/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import access.DeMotorDAO;
import access.PropietariosDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DeMotorModel;
import model.DeVelaModel;
import model.PropietariosModel;
import org.json.simple.parser.ParseException;

/**
 *
 * @author lipasofra y camilo
 */
public class InitialData {

  private ArrayList<DeMotorModel> listaDeMotor = null;
  private ArrayList<DeVelaModel> listaDeVela = null;
  private ArrayList<PropietariosModel> listaPropietarios = null;

  public InitialData() throws SQLException, IOException, ParseException, java.text.ParseException {
    DeMotorDAO deMotorDao = new DeMotorDAO();
    this.listaDeMotor = deMotorDao.obtenerDemotor();

    PropietariosDAO propietarios = new PropietariosDAO();
    this.listaPropietarios = propietarios.obtenerPropietarios();
  }

  public static ArrayList<String> CargarPropietarios() throws SQLException, IOException, ParseException, java.text.ParseException {
    PropietariosDAO propi = new PropietariosDAO();
    ArrayList<String> ListaPropietariosNombres = propi.llenarComboPropietarios();
    return ListaPropietariosNombres;
  }

  public static String CargarIdPropietario(String nombre) throws java.text.ParseException {
    PropietariosDAO propi = new PropietariosDAO();
    String PropietarioId = propi.llenarFieldPropietariosId(nombre);
    return PropietarioId;
  }
  
  public static ArrayList<String> CargarRegistrosDeMotor() throws IOException, java.text.ParseException, SQLException{
    DeMotorDAO registros = new DeMotorDAO();
    ArrayList<String> listaRegistros = registros.getRegistrosDeMotor();
    return listaRegistros;
  }
  
  public static DeMotorModel cargarDatosDeMotorSinRegistro(String registroSel) throws IOException, java.text.ParseException, SQLException{
    DeMotorDAO deMotorSinReg = new DeMotorDAO();
    DeMotorModel listaDeMotorSinReg = deMotorSinReg.getDatosDeMotorSinRegistro(registroSel);
    return listaDeMotorSinReg;
  }

  /**
   * @return the listaDeMotor
   */
  public ArrayList<DeMotorModel> getListaDeMotor() {
    return listaDeMotor;
  }

  /**
   * @return the listaDeVela
   */
  public ArrayList<DeVelaModel> getListaDeVela() {
    return listaDeVela;
  }

  /**
   * @return the listaPropietarios
   */
  public ArrayList<PropietariosModel> getListaPropietarios() {
    return listaPropietarios;
  }

}
