/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.util.ArrayList;
import java.util.Date;

public class alumnos extends Personas{
    private int idEstudiante;
    private ArrayList<clases> clases;

    public alumnos() {
    }

    public alumnos(int idEstudiante, ArrayList<clases> clases) {
        this.idEstudiante = idEstudiante;
        this.clases = clases;
    }
    
    public alumnos(int idEstudiante, String nombre, int identidad, Date nacimiento) {
        super(nombre,identidad,nacimiento);
        this.idEstudiante = idEstudiante;
    }
    
    public alumnos(ArrayList<clases> clases) {
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
    
    public void setClase(clases clase){
        this.clases.add(clase);
    }

    @Override
    public String toString() {
        return super.toString() + "idEstudiante=" + idEstudiante + ", clases=" + clases;
    }
    
}
