/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.awt.Color;

/**
 *
 * @author Hwan
 */
public class mototaxis {
    private int placa;
    private Color color;
    private int asientos = 2;
    private transportista transportista;
    private estaciones estaciones;

    public mototaxis() {
    }

    public mototaxis(int placa, Color color, transportista transportisa, estaciones estaciones) {
        this.placa = placa;
        this.color = color;
        this.transportista = transportisa;
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

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public transportista getTransportisa() {
        return transportista;
    }

    public void setTransportisa(transportista transportisa) {
        this.transportista = transportisa;
    }

    public estaciones getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(estaciones estaciones) {
        this.estaciones = estaciones;
    }
    
    
}
