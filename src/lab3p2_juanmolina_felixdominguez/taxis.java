/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

/**
 *
 * @author Hwan
 */
public class taxis {
    private int capacidad;
    private int numero;

    public taxis(int capacidad, int numero) {
        this.capacidad = capacidad;
        this.numero = numero;
    }

    public taxis() {
        
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "taxis{" + "capacidad=" + capacidad + ", numero=" + numero + '}';
    }
    
    
    
    
}
