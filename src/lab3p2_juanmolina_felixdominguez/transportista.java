/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.util.Date;

/**
 *
 * @author Hwan
 */
public class transportista extends Personas{
    private int experiencia;
    private String apodo;

    public transportista() {
    }

    public transportista(int experiencia, String apodo) {
        this.experiencia = experiencia;
        this.apodo = apodo;
    }
    
    public transportista(int experiencia, String apodo, String nombre, int identidad, Date nacimiento) {
        super(nombre,identidad,nacimiento);
        this.experiencia = experiencia;
        this.apodo = apodo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return super.toString() + "experiencia=" + experiencia + ", apodo=" + apodo;
    }
    
    
}
