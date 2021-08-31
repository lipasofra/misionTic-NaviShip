/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.barcoModel;
import model.de_motorModel;
import model.de_velaModel;
import utils.connection;

/**
 *
 * @author lipas
 */
public class barcoDAO {
    
    protected Connection conn=null;
    
     public ArrayList<de_motorModel> obtenerBarco(String registro){
        return null;
    }
    
    public void agregarBarcoMotor(de_motorModel barco){
         }
        
    public void agregarBarcoVela(de_velaModel barco){
         }    
    
    public void eliminarBarco(String registro){
    
    }
    
    public void editarBarco(){
    
    }  
    
}
