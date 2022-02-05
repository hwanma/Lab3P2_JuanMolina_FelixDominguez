/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.util.Date;

/**
 *
 * @author Lenovo I7
 */
public class Personas {
    private String nombre;
    private int identidad;
    private Date nacimiento;

    public Personas() {
    }

    public Personas(String nombre, int identidad, Date nacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.nacimiento = nacimiento;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", identidad=" + identidad + ", nacimiento=" + nacimiento + '}';
    }
    
    
}
