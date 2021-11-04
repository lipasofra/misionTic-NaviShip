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
public class DeVelaModel extends BarcoModel{
    
    private String modelo;
    private int cantidadVelas;
    private int capacidad;
    private String tipo;
    private String propietarioNombre;

    
    //constructor para el manejo interno de la tabla
    public DeVelaModel(String registro, Long propietario, String modelo, int cantidadVelas, String tipo, int capacidad){
        super(registro, propietario);
        this.modelo=modelo;
        this.cantidadVelas=cantidadVelas;
        this.tipo=tipo;
        this.capacidad=capacidad;
    }
    
    //POLIMORFISMO Y SOBRECARGA DE METODOS
    //constructor con el fin de mostrar la DB - ya que si manejamos todo con JOIN en los queries puede comer mucha memoria si las tablas unidas tienen muchos datos.
    //ejemplo: crear un constructor con llave foranea para manejo interno, y otro con los datos que queremos mostrar de la tabla que tiene la llave foranea
    public DeVelaModel(String registro, String modelo, int cantidadVelas, String tipo, int capacidad, String propietarioNombre){
        super(registro);
        this.modelo=modelo;
        this.cantidadVelas=cantidadVelas;
        this.tipo=tipo;
        this.capacidad=capacidad;
        this.propietarioNombre=propietarioNombre;
    }
    
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cantidadVelas
     */
    public int getCantidadVelas() {
        return cantidadVelas;
    }

    /**
     * @param cantidadVelas the cantidadVelas to set
     */
    public void setCantidadVelas(int cantidadVelas) {
        this.cantidadVelas = cantidadVelas;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the propietarioNombre
     */
    public String getPropietarioNombre() {
        return propietarioNombre;
    }

    /**
     * @param propietarioNombre the propietarioNombre to set
     */
    public void setPropietarioNombre(String propietarioNombre) {
        this.propietarioNombre = propietarioNombre;
    }

  public Object[] toArray() {
    Object[] data = {registro, modelo, cantidadVelas, capacidad, tipo, propietarioNombre};
    return data;
  }

   
    
}
