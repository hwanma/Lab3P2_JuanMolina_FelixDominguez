/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.util.ArrayList;

public class alumnos {
    private int idEstudiante;
    private ArrayList<clases> clases;

    public alumnos() {
    }

    public alumnos(int idEstudiante, ArrayList<clases> clases) {
        this.idEstudiante = idEstudiante;
        this.clases = clases;
    }
    
    public alumnos(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public ArrayList<clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "alumnos{" + "idEstudiante=" + idEstudiante + ", clases=" + clases + '}';
    }
    
}
