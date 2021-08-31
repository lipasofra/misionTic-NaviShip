/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lipas
 */
public class de_motorModel extends barcoModel{
    
    private String marca;
    private int cantidadMotores;
    private int autonomiaHoras;
    
    private String propietarioNombre;
    
    //constructor para el manejo interno de la tabla
    public de_motorModel(String registro, Integer propietario, String marca, int cantidadMotores, int autonomiaHoras){
        super(registro, propietario);
        this.marca=marca;
        this.cantidadMotores=cantidadMotores;
        this.autonomiaHoras=autonomiaHoras;
    }
    
    //POLIMORFISMO Y SOBRECARGA DE METODOS
    //constructor con el fin de mostrar la DB - ya que si manejamos todo con JOIN en los queries puede comer mucha memoria si las tablas unidas tienen muchos datos.
    //ejemplo: crear un constructor con llave foranea para manejo interno, y otro con los datos que queremos mostrar de la tabla que tiene la llave foranea
    public de_motorModel(String registro, Integer propietario, String marca, int cantidadMotores, int autonomiaHoras, String propietarioNombre){
        super(registro, propietario);
        this.marca=marca;
        this.cantidadMotores=cantidadMotores;
        this.autonomiaHoras=autonomiaHoras;
        this.propietarioNombre=propietarioNombre;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cantidadMotores
     */
    public int getCantidadMotores() {
        return cantidadMotores;
    }

    /**
     * @param cantidadMotores the cantidadMotores to set
     */
    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }

    /**
     * @return the autonomiaHoras
     */
    public int getAutonomiaHoras() {
        return autonomiaHoras;
    }

    /**
     * @param autonomiaHoras the autonomiaHoras to set
     */
    public void setAutonomiaHoras(int autonomiaHoras) {
        this.autonomiaHoras = autonomiaHoras;
    }

    /**
     * @return the propietarioNombre
     */
    public String getPropietarioNombre() {
        return propietarioNombre;
    }
    
}
