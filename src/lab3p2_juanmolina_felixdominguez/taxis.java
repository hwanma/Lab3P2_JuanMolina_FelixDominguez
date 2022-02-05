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
public class taxis extends transportes{
    private int asientos;
    private int numero;
    private ArrayList<alumnos> alumnos;

    public taxis() {
    }
    
    public taxis(int asientos, int numero, ArrayList<alumnos> alumnos, int placa, Color color, transportista transportista) {
        super(placa,color,transportista);
        this.asientos = asientos;
        this.numero = numero;
        this.alumnos = alumnos;
    }
    
    public taxis(int asientos, int numero, int placa, Color color, transportista transportista) {
        super(placa,color,transportista);
        this.asientos = asientos;
        this.numero = numero;
    }

    public taxis(int asientos, int numero, ArrayList<alumnos> alumnos, int placa, Color color, transportista transportista, ArrayList<estaciones> estaciones) {
        super(placa,color,transportista,estaciones);
        this.asientos = asientos;
        this.numero = numero;
        this.alumnos = alumnos;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "taxis{" + "asientos=" + asientos + ", numero=" + numero + ", alumnos=" + alumnos + '}';
    }

     
    
}
