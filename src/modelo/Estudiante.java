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
public class Estudiante extends Persona{

    public Estudiante() {
    }

    public Estudiante(String CarreraE, String codigoE, String DireccionPersona, String CorreoPersona, String nombrePersona) {
        super(DireccionPersona, CorreoPersona, nombrePersona);
        this.CarreraE = CarreraE;
        this.codigoE = codigoE;
    }
    
    
    private String CarreraE;

    /**
     * Get the value of Carrera
     *
     * @return the value of Carrera
     */
    public String getCarrera() {
        return CarreraE;
    }

    /**
     * Set the value of Carrera
     *
     * @param Carrera new value of Carrera
     */
    public void setCarrera(String Carrera) {
        this.CarreraE = Carrera;
    }
    
    private String codigoE;

    /**
     * Get the value of codigoE
     *
     * @return the value of codigoE
     */
    public String getCodigoE() {
        return codigoE;
    }

    /**
     * Set the value of codigoE
     *
     * @param codigoE new value of codigoE
     */
    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "CarreraE=" + CarreraE + ", codigoE=" + codigoE + '}';
    }

}
