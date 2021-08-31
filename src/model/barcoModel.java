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
public class barcoModel {
        private String registro;
        private Integer propietario;
        
    public barcoModel(String registro, Integer propietario){
        this.registro=registro;
        this.propietario=propietario;
    }

    /**
     * @return the registro
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    /**
     * @return the propietario
     */
    public Integer getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Integer propietario) {
        this.propietario = propietario;
    }
    
}
