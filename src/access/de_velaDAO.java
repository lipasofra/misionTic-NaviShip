/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.de_velaModel;
import org.json.simple.parser.ParseException;
import utils.connection;

/**
 *
 * @author lipas
 */
public class de_velaDAO extends barcoDAO {
    
    protected Connection conn=null;
    
    @Override
    public void agregarBarcoVela(de_velaModel barco){
        
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
                
                String modelo=barco.getModelo();
                int cantidadVelas=barco.getCantidadVelas();
                String tipo= barco.getTipo();
                int capacidad=barco.getCapacidad();
                
                String sqlMotor="INSERT INTO de_motor VALUES (?, ?, ?, ?)";
                statement=conn.prepareStatement(sqlMotor);
                statement.setString(1,registro);
                statement.setString(2, modelo);
                statement.setInt(3, cantidadVelas);
                statement.setString(4, tipo);
                statement.setInt(5, capacidad);
                
                //los atributos se sacan de la interfaz, en el paquete controlador con un "catch" de la info del campo (?)
            }
        
        }catch(SQLException ex){
        
        } catch (IOException ex) {
            Logger.getLogger(de_velaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(de_velaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
