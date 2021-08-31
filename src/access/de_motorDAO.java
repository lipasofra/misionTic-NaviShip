/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.de_motorModel;
import utils.connection;

/**
 *
 * @author lipas
 */
public class de_motorDAO extends barcoDAO {
    
    @Override
    public void agregarBarcoMotor(de_motorModel barco){
        
        try{
            if(conn==null){
                conn= connection.getConnection();
                
                String registro=barco.getRegistro();
                Integer propietarioId=barco.getPropietario();
                                
                PreparedStatement statement;
                String sqlBarco="INSERT INTO barco VALUES (?, ?)";
                statement=conn.prepareStatement(sqlBarco);
                statement.setString(1, registro);
                statement.setInt(2,propietarioId);
                
                String marca=barco.getMarca();
                int cantidadMotores=barco.getCantidadMotores();
                int autonomiaHoras=barco.getAutonomiaHoras();
                
                String sqlMotor="INSERT INTO de_motor VALUES (?, ?, ?, ?)";
                statement=conn.prepareStatement(sqlMotor);
                statement.setString(1,registro);
                statement.setString(2, marca);
                statement.setInt(3, cantidadMotores);
                statement.setInt(4, autonomiaHoras);
                
                //los atributos se sacan de la interfaz, en el paquete controlador con un "catch" de la info del campo (?)
            }
        
        }catch(SQLException ex){
        
        }
            
    }
    
  
        
}
