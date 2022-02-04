/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.awt.Color;
import java.util.ArrayList;

public class transportes {
    private int placa;
    private Color color;
    private transportista transportista;
    private ArrayList<estaciones> estaciones;

    public transportes() {
    }

    public transportes(int placa, Color color, transportista transportista, ArrayList<estaciones> estaciones) {
        this.placa = placa;
        this.color = color;
        this.transportista = transportista;
        this.estaciones = estaciones;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(transportista transportista) {
        this.transportista = transportista;
    }

    public ArrayList<estaciones> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<estaciones> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "transportes{" + "placa=" + placa + ", color=" + color + ", transportista=" + transportista + ", estaciones=" + estaciones + '}';
    }
    
    
}
