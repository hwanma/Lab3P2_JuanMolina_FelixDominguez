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
public class alumnos {
    private int idEstudiante;
    private String [] clase;
    private int [] idCurso;

    public alumnos() {
    }

    public alumnos(int idEstudiante, String[] clase, int[] idCurso) {
        this.idEstudiante = idEstudiante;
        this.clase = clase;
        this.idCurso = idCurso;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String[] getClase() {
        return clase;
    }

    public void setClase(String[] clase) {
        this.clase = clase;
    }

    public int[] getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int[] idCurso) {
        this.idCurso = idCurso;
    }

    
}
