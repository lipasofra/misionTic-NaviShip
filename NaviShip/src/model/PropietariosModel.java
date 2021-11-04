/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lipasofra y camilo
 */
public class PropietariosModel {

    private long identificacion;
    private String razonSocial;
    private String tipo;
    private String pais;
    
    
    public PropietariosModel(long identificacion, String razonSocial, String tipo, String pais) {
        this.identificacion = identificacion;
        this.razonSocial = razonSocial;
        this.tipo = tipo;
        this.pais = pais;
    }

    /**
     * @return the identificacion
     */
    public long getIdentificacion() {
        return identificacion;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

  public Object[] toArray() {
    Object[] data = {identificacion, razonSocial, tipo, pais};
    return data;
  }
    
    
    
    
}
