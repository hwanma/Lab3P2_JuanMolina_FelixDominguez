/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Hwan
 */
public class buses extends transportes{
    
    private int asientos;
    private int parados;
    private ArrayList<alumnos> alumnos;

    public buses() {
    }

    public buses(int asientos, int parados, ArrayList<alumnos> alumnos) {
        this.asientos = asientos;
        this.parados = parados;
        this.alumnos = alumnos;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getParados() {
        return parados;
    }

    public void setParados(int parados) {
        this.parados = parados;
    }

    public ArrayList<alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "buses{" + "asientos=" + asientos + ", parados=" + parados + ", alumnos=" + alumnos + '}';
    }

    
    
}
