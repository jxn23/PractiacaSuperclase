/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.java;

/**
 *
 * @author jones
 */
class Cliente extends Persona {
    private String numeroCliente;

    public Cliente(String nombre, String direccion, String telefono, String numeroCliente) {
        super(nombre, direccion, telefono);
        this.numeroCliente = numeroCliente;
    }
    
    public String contactarRepresentante() {
        return "El cliente " + nombre + " ha contactado a un representante.";
    }

    public String solicitarInformacion() {
        return "El cliente " + nombre + " ha solicitado información.";
    }
}







