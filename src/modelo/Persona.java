/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author elian.medina
 */
public class Persona {

    

    public Persona() {
    }
    public Persona(String DireccionPersona, String CorreoPersona, String nombrePersona) {
        this.DireccionPersona = DireccionPersona;
        this.CorreoPersona = CorreoPersona;
        this.nombrePersona = nombrePersona;
    }
    private String DireccionPersona;

    /**
     * Get the value of DireccionPersona
     *
     * @return the value of DireccionPersona
     */
    public String getDireccionPersona() {
        return DireccionPersona;
    }

    /**
     * Set the value of DireccionPersona
     *
     * @param DireccionPersona new value of DireccionPersona
     */
    public void setDireccionPersona(String DireccionPersona) {
        this.DireccionPersona = DireccionPersona;
    }


    private String CorreoPersona;

    /**
     * Get the value of CorreoPersona
     *
     * @return the value of CorreoPersona
     */
    public String getCorreoPersona() {
        return CorreoPersona;
    }

    /**
     * Set the value of CorreoPersona
     *
     * @param CorreoPersona new value of CorreoPersona
     */
    public void setCorreoPersona(String CorreoPersona) {
        this.CorreoPersona = CorreoPersona;
    }

    
    private String nombrePersona;

    
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "DireccionPersona=" + DireccionPersona + ", CorreoPersona=" + CorreoPersona + ", nombrePersona=" + nombrePersona + '}';
    }

    
}
