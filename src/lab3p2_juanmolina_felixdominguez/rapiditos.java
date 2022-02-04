/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.util.ArrayList;

/**
 *
 * @author Hwan
 */
public class rapiditos {
    private int sillas;
    private ArrayList<alumnos> alumnos;
    private int capacidad;

    public rapiditos() {
    }

    public rapiditos(int sillas, ArrayList<alumnos> alumnos, int capacidad) {
        this.sillas = sillas;
        this.alumnos = alumnos;
        this.capacidad = capacidad;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public ArrayList<alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "rapiditos{" + "sillas=" + sillas + ", alumnos=" + alumnos + ", capacidad=" + capacidad + '}';
    }
    
    
}
