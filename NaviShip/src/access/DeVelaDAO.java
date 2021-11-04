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
import model.DeVelaModel;
import org.json.simple.parser.ParseException;
import utils.connection;

/**
 *
 * @author lipas
 */
public class DeVelaDAO extends BarcoDAO {
    
    protected Connection conn=null;
    
    //imprimir la tabla
    public ArrayList<DeVelaModel> obtenerDevela() throws SQLException, IOException, ParseException, java.text.ParseException{
        ArrayList<DeVelaModel> devela= new ArrayList();
        if(conn==null){
                conn= connection.getConnection();}
    
         String sql="SELECT de_vela.registro, de_vela.modelo, de_vela.cantidadVelas, de_vela.tipo, de_vela.capacidad, "
                 +"propietario.pro_razonsocial FROM de_vela JOIN barco ON de_vela.registro=barco.registro "
                 +"JOIN propietario ON barco.propietario=propietario.pro_identificacion;";
         
         Statement statement=conn.createStatement();
         ResultSet result=statement.executeQuery(sql);
         while(result.next()){
             DeVelaModel barcoVela= new DeVelaModel(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getInt(5), result.getString(6));
             devela.add(barcoVela);
         }
         return devela;
    }
    
    
}
