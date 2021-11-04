/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import access.DeVelaDAO;
import access.PropietariosDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DeMotorModel;
import model.DeVelaModel;
import model.PropietariosModel;
import org.json.simple.parser.ParseException;
import view.MainWindow;

/**
 *
 * @author User
 */
public class ClickEvent {

  public ClickEvent() {
  }

  public void setTablaInfo(String listaSelect, javax.swing.JTable tablaInfo) throws SQLException, IOException, ParseException, java.text.ParseException {

    InitialData initialData = new InitialData();

    DefaultTableModel tableModel = new DefaultTableModel();

    switch (listaSelect) {
      case "Barcos de motor": {
        ArrayList<DeMotorModel> listaTablaDeMotor = initialData.getListaDeMotor();
        String[] headers = {"Registro", "Marca", "Cantidad de motores", "Autonomia (Horas)", "Propietario"};
        tablaInfo.removeAll();
        tableModel.setColumnIdentifiers(headers);
        tablaInfo.setModel(tableModel);
        for (int i = 0; i < listaTablaDeMotor.size(); i++) {
          tableModel.addRow(listaTablaDeMotor.get(i).toArray());
        }
        break;
      }
      case "Barcos de vela": {
        DeVelaDAO deVelaDAO = new DeVelaDAO();
        ArrayList<DeVelaModel> listaTablaDeVela = deVelaDAO.obtenerDevela();
        String[] headers = {"Registro", "Modelo", "Cantidad de velas", "Tipo", "Capacidad", "Propietario"};
        tablaInfo.removeAll();
        tableModel.setColumnIdentifiers(headers);
        tablaInfo.setModel(tableModel);
        for (int i = 0; i < listaTablaDeVela.size(); i++) {
          tableModel.addRow(listaTablaDeVela.get(i).toArray());
        }
        break;
      }
      case "Propietarios": {
        PropietariosDAO propietariosDAO = new PropietariosDAO();
        ArrayList<PropietariosModel> listaTablaPropietarios = propietariosDAO.obtenerPropietarios();
        String[] headers = {"ID", "Razón social", "Tipo", "País"};
        tablaInfo.removeAll();
        tableModel.setColumnIdentifiers(headers);
        tablaInfo.setModel(tableModel);
        for (int i = 0; i < listaTablaPropietarios.size(); i++) {
          tableModel.addRow(listaTablaPropietarios.get(i).toArray());
        }
        break;
      }
      default:
        break;
    }

  }

  public void actualizarTablaInfo() {

    MainWindow mainW = new MainWindow();
    javax.swing.JTable tabla = mainW.getTablaInfo();
//    javax.swing.JComboBox<String> listaTablas = mainW.getListaDeTablas();
    
    tabla.removeAll();

//    try {
//
//      String tablaSelected = (String) listaTablas.getSelectedItem();
//      setTablaInfo(tablaSelected, tabla);
//    } catch (SQLException ex) {
//      Logger.getLogger(ClickEvent.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (IOException ex) {
//      Logger.getLogger(ClickEvent.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (ParseException ex) {
//      Logger.getLogger(ClickEvent.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (java.text.ParseException ex) {
//      Logger.getLogger(ClickEvent.class.getName()).log(Level.SEVERE, null, ex);
//    }
  }

}
