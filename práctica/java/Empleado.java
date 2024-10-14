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
class Empleado extends Persona {
    private String puesto;
    private double horasExtra;

    public Empleado(String nombre, String direccion, String telefono, String puesto) {
        super(nombre, direccion, telefono);
        this.puesto = puesto;
        this.horasExtra = 0;
    }

    public String solicitudPermiso() {
        return "Permiso solicitado por el empleado " + nombre;
    }

    public String reporteHorasExtra(double horas) {
        this.horasExtra += horas;
        return "El empleado " + nombre + " ha reportado " + horas + " horas extra.";
    }
}

















