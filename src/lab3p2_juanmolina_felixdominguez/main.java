/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static ArrayList<alumnos> alumnos;
    public static ArrayList<clases> clases;
    public static ArrayList<transportes> transportes;
    public static ArrayList<transportista> transportista;
    public static ArrayList<estaciones> estaciones;
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        clases.add(new clases("Ciencias",1234));
        clases.add(new clases("Matematicas",1243));
        alumnos.add(new alumnos(4356,((clases)clases.get(0))));
        alumnos.add(new alumnos(7834,((clases)clases.get(1))));
        transportes.add(new buses(50,20,alumnos));
        transportes.add(new buses(70,25,alumnos));
        transportista.add(new transportista(10,"Maria"));
        transportista.add(new transportista(15,"Jorge"));
        estaciones.add(new estaciones("San Juan",4,3));
        estaciones.add(new estaciones("San Martin",1,2));
    }
    
    public static int menu(){
        System.out.println("");
        System.out.println("*****SISTEMA DE TRANSPORTES*****");
        System.out.println("************DISCOVERY***********");
        System.out.println("0. Salir");
        System.out.println("1. Crear Clase\n" +
                            "2. Crear Ruta\n" +
                            "3. Crear Alumno\n" +
                            "4. Agregar Clase a Alumno\n" +
                            "5. Crear Transportiste\n" +
                            "6. Crear Transporte\n" +
                            "7. Simulacion\n" +
                            "8. Listar Clases\n" +
                            "9. Listar Rutas\n" +
                            "10. Listar Alumnos\n" +
                            "11. Listar Transportistas\n" +
                            "12. Listar Transportes\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
    }
    
    public static int menuSimulacion(){
        System.out.println("");
        System.out.println("************SIMULACION**********");
        System.out.println("0. Salir");
        System.out.println("1. Subir alumno al transporte\n" +
                            "2. Bajar alumno del transporte\n" +
                            "3. Listar alumnos del transporte\n" +
                            "4. Escoger transportista\n" +
                            "5. Quitar transportista\n" +
                            "6. Anadir ruta\n" +
                            "7. Quitar ruta\n" +
                            "8. Imprimir transporte\n" +
                            "9. Comenzar\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
    }
}
