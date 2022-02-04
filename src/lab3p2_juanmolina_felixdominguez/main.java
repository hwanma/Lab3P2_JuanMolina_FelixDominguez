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
        metodos m = new metodos();
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
    
        
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            switch(m.menu()){
                case 0:{
                    System.out.println("Gracias por utilizar este programa!");
                    resp = 'n';
                    break;
                }
                
                case 1:{
                    System.out.println("Nombre de la Clase: ");
                    sc.nextLine();
                    String nombre = sc.next();
                    System.out.println("Codigo de clase: ");
                    sc.nextLine();
                    int codigo = sc.nextInt();
                    while(clases.contains(codigo)){
                        System.out.println("Codigo de clase debe ser unico: ");
                        sc.nextLine();
                        codigo = sc.nextInt();
                    }
                    clases.add(new clases(nombre,codigo));
                    
                    break;
                }
                
                case 2:{
                    System.out.println("Nombre de la Estacion: ");
                    sc.nextLine();
                    String nombre = sc.next();
                    System.out.println("Coordenada X: ");
                    sc.nextLine();
                    int x = sc.nextInt();
                    System.out.println("Coordenada Y: ");
                    sc.nextLine();
                    int y = sc.nextInt();
                    while(estaciones.contains(x) && estaciones.contains(y)){
                        System.out.println("Coordenada X: ");
                        sc.nextLine();
                        x = sc.nextInt();
                        System.out.println("Coordenada Y: ");
                        sc.nextLine();
                        y = sc.nextInt();
                    }
                    estaciones.add(new estaciones(nombre,x,y));
                    break;
                }
                
                case 3:{
                    System.out.println("Id del estudiante (4 digitos): ");
                    sc.nextLine();
                    int idEstudiante = sc.nextInt();
                    while(alumnos.contains(idEstudiante) || String.valueOf(idEstudiante).length()!=4){
                        System.out.println("Id del estudiante (4 digitos): ");
                        sc.nextLine();
                        idEstudiante = sc.nextInt();
                    }
                    
                    alumnos.add(new alumnos(idEstudiante));
                    break;
                }
                
                case 4:{
                    System.out.println("Clases Disponibles: ");
                    String acum = "";
                    
                    for(Object temp : clases){
                        if(temp instanceof clases){
                            acum += ""+clases.indexOf(temp)+" - "+temp+"\n";
                        }
                    }
                    System.out.println(acum);
                    
                    break;
                }
                
                default:{
                    System.out.println("!!");
                    System.out.println("Error, por favor introduzca un valor del menu.");
                    System.out.println("!!");
                    System.out.println(" ");
                    break;
                }
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
