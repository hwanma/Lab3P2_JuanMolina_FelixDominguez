/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
    
    public static ArrayList<Personas> persona = new ArrayList<>();
    public static ArrayList<clases> clase = new ArrayList<>();
    public static ArrayList<transportes> transporte = new ArrayList<>();
    public static ArrayList<estaciones> estacione = new ArrayList<>();
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws ParseException {
        metodos m = new metodos();
        clase.add(new clases("Ciencias",1234));
        clase.add(new clases("Matematicas",1243));
        persona.add(new alumnos(4356));
        persona.add(new alumnos(7834));
        persona.add(new transportista(10,"Maria"));
        persona.add(new transportista(15,"Jorge"));
        estacione.add(new estaciones("San Juan",4,3));
        estacione.add(new estaciones("San Martin",1,2));
    
        
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
                    String nombre = sc.next();
                    System.out.println("Codigo de clase: ");
                    int codigo = sc.nextInt();
                    while(m.valid2(codigo, clase)){
                        System.out.println("Id de la clase (4 digitos): ");
                        codigo = sc.nextInt();
                    }
                    
                    clase.add(new clases(nombre,codigo));
                    
                    break;
                }
                
                case 2:{
                    System.out.println("Nombre de la Estacion: ");
                    String nombre = sc.next();
                    System.out.println("Coordenada X: ");
                    int x = sc.nextInt();
                    System.out.println("Coordenada Y: ");
                    int y = sc.nextInt();
                    
                    estacione.add(new estaciones(nombre,x,y));
                    break;
                }
                
                case 3:{
                    System.out.println("Id del estudiante (4 digitos): ");
                    int codigo = sc.nextInt();
                    
                    while(m.valid(codigo, persona)){
                        System.out.println("Id del estudiante (4 digitos): ");
                        codigo = sc.nextInt();
                    }
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Identidad: ");
                    int identidad = sc.nextInt();
                    while(m.valid3(identidad, persona)){
                        System.out.println("Identidad ya existe: ");
                        identidad = sc.nextInt();
                    }
                    
                    
                    System.out.println("Fecha de nacimiento (yyyy/MM/dd): ");
                    Date fecha;
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    fecha = df.parse(sc.next());
                    
                    persona.add(new alumnos(codigo,nombre,identidad,fecha));
                    break;
                }
                
                case 4:{
                    System.out.println("Clases Disponibles: ");
                    String acum = "";
                    
                    for(Object temp : clase){
                        if(temp instanceof clases){
                            acum += ""+clase.indexOf(temp)+" - "+temp+"\n";
                        }
                    }
                    System.out.println(acum);
                    
                    System.out.println("Seleccione la clase: ");
                    int opcionClase = sc.nextInt();
                    
                    System.out.println("Estudiantes: ");
                    acum = "";
                    for(Object temp : persona){
                        if(temp instanceof alumnos){
                            acum += ""+persona.indexOf(temp)+" - "+temp+"\n";
                        }
                    }
                    System.out.println(acum);
                    
                    System.out.println("Seleccione al Alumno: ");
                    int opcionAlumno = sc.nextInt();
                    
                    ArrayList<clases> temp =new ArrayList<>();
                    temp.add(clase.get(opcionClase));
                    ((alumnos)persona.get(opcionAlumno)).setClases(temp);
                    
                    break;
                }
                
                case 5:{
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Identidad: ");
                    int identidad = sc.nextInt();
                    while(m.valid3(identidad, persona)){
                        System.out.println("Identidad ya existe: ");
                        identidad = sc.nextInt();
                    }
                    
                    System.out.println("Fecha de nacimiento (yyyy/MM/dd): ");
                    Date fecha;
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    fecha = df.parse(sc.next());
                    
                    System.out.println("Apodo: ");
                    String apodo = sc.nextLine();
                    
                    System.out.println("Tiempo de Experiencia: ");
                    int exp = sc.nextInt();
                    
                    persona.add(new transportista(exp,apodo,nombre,identidad,fecha));
                    break;
                }
                
                case 6:{
                    System.out.println("TRANSPORTES");
                    System.out.println("Placa: ");
                    int placa = sc.nextInt();
                    System.out.println("Color: ");
                    Color color = Color.BLACK;
                    System.out.println("Transportistas disponibles: ");
                    
                    String acum = "";
                    for(Object temp : persona){
                        if(temp instanceof transportista){
                            acum += ""+persona.indexOf(temp)+" - "+temp+"\n";
                        }
                        
                    }
                    
                    if(m.menuTransporte()==1){
                        
                    } else if (m.menuTransporte()==2){
                        
                    } else if (m.menuTransporte()==3){
                        
                    } else {
                        
                    }
                        
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
