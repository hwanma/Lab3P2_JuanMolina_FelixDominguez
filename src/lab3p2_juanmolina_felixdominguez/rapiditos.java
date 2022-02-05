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
public class rapiditos extends transportes{
    private int asientos;
    private ArrayList<alumnos> alumnos;

    public rapiditos() {
    }
    
    public rapiditos(int asientos, int placa, Color color, transportista transportista) {
        super(placa,color,transportista);
        this.asientos = asientos;
    }
    
    public rapiditos(int asientos, ArrayList<alumnos> alumnos, int placa, Color color, transportista transportista) {
        super(placa,color,transportista);
        this.asientos = asientos;
        this.alumnos = alumnos;
    }

    public rapiditos(int asientos, ArrayList<alumnos> alumnos, int placa, Color color, transportista transportista, ArrayList<estaciones> estaciones) {
        super(placa,color,transportista,estaciones);
        this.asientos = asientos;
        this.alumnos = alumnos;
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
        return "rapiditos{" + "asientos=" + asientos + ", alumnos=" + alumnos +'}';
    }
    
    
}
