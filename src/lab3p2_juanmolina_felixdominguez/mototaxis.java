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
public class mototaxis extends transportes{
    
    private int asientos = 2;
    private ArrayList<alumnos> alumnos;

    public mototaxis() {
    }
    
    public mototaxis(int asientos, int placa, Color color, transportista transportista){
        super(placa,color,transportista);
        this.asientos=asientos;
    }
    
    public mototaxis(ArrayList<alumnos> alumnos,int asientos, int placa, Color color, transportista transportista){
        super(placa,color,transportista);
        this.alumnos = alumnos;
        this.asientos=asientos;
    }

    public mototaxis(ArrayList<alumnos> alumnos,int asientos, int placa, Color color, transportista transportista, ArrayList<estaciones> estaciones){
        super(placa,color,transportista,estaciones);
        this.alumnos = alumnos;
        this.asientos=asientos;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public ArrayList<alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "mototaxis{" + "asientos=" + asientos + ", alumnos=" + alumnos + '}';
    }
    

}
