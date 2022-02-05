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
                    System.out.println(acum);
                    System.out.println("Ingrese el numero del transportista que desea: ");
                    int index=sc.nextInt();
                    int opcion = m.menuTransporte();
                    if(opcion==1){
                        System.out.println("Ingrese los asientos");
                        int asientos=sc.nextInt();
                        System.out.println("Ingrese los lugares donde pararse");
                        int parar=sc.nextInt();
                        transporte.add(new buses(asientos,parar,placa,color,(persona.get(index))));
                    } else if (opcion==2){
                        int asientos=4;
                        System.out.println("Ingrese el numero del taxi");
                        int numero=sc.nextInt();
                        transporte.add(new taxis(asientos,numero,placa,color,(persona.get(index))));
                    } else if (opcion==3){
                        int asientos=2;
                        transporte.add(new mototaxis(asientos,placa,color,(persona.get(index))));
                    } else {
                        System.out.println("Ingrese los asientos");
                        int asientos=sc.nextInt();
                        transporte.add(new rapiditos(asientos,placa,color,(persona.get(index))));
                    }
                    break;
                        
                }
                
                case 7:{
                    
                    System.out.println("Transportes disponibles: ");
                    String acum = "";
                    for(Object temp : transporte){
                        if(temp instanceof transportes){
                            acum += ""+transporte.indexOf(temp)+" - "+temp+"\n";
                        }
                    }

                    System.out.println(acum);

                    System.out.println("Seleccione el transporte: ");
                    int opcionTransporte = sc.nextInt();

                    char resp2 = 'z';
                    while (resp == 'z') {
                        switch (m.menuSimulacion()) {
                            case 0: {
                                System.out.println("Gracias por utilizar este programa!");
                                resp = 'x';
                                break;
                            }
                            case 1: {
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
                                
                                ArrayList<alumnos> temp =new ArrayList<>();
                                temp.add((alumnos)persona.get(opcionAlumno));
                                ((transportes)transporte.get(opcionTransporte)).setAlumnos(temp);
                                break;
                                
                            }
                            case 2: {
                                System.out.println("Estudiantes: ");
                                acum = "";
                                for(Object temp : transporte){
                                    if(temp instanceof alumnos){
                                        acum += ""+transporte.indexOf(temp)+" - "+temp+"\n";
                                    }
                                }
                                System.out.println(acum);

                                System.out.println("Seleccione al Alumno: ");
                                int opcionAlumno = sc.nextInt();
                                
                                ((transportes)transporte.get(opcionTransporte)).getAlumnos().remove(opcionAlumno);
                                break;
                            }
                            case 3: {
                                System.out.println("Estudiantes: ");
                                acum = "";
                                for(Object temp : transporte){
                                    if(temp instanceof alumnos){
                                        acum += ""+transporte.indexOf(temp)+" - "+temp+"\n";
                                    }
                                }
                                System.out.println(acum);
                                break;
                            }
                            case 4: {
                                System.out.println("Transportista: ");
                                acum = "";
                                for(Object temp : persona){
                                    if(temp instanceof transportista){
                                        acum += ""+persona.indexOf(temp)+" - "+temp+"\n";
                                    }
                                }
                                System.out.println(acum);
                                
                                System.out.println("Seleccione al Transportista: ");
                                int opcionTranspor = sc.nextInt();
                                
                                transportista temp = ((transportista)persona.get(opcionTranspor));
                                ((transportes)transporte.get(opcionTransporte)).setTransportista(temp);
                                break;
                            }
                            case 5: {
                                System.out.println("Transportista: ");
                                acum = "";
                                for(Object temp : transporte){
                                    if(temp instanceof transportista){
                                        acum += ""+transporte.indexOf(temp)+" - "+temp+"\n";
                                    }
                                }
                                System.out.println(acum);
                                
                                System.out.println("Seleccione al Transportista: ");
                                int opcionTranspor = sc.nextInt();
                                
                                ((transportes)transporte.get(opcionTransporte)).setTransportista(null);
                                break;
                            }
                            case 6: {
                                System.out.println("Estacion: ");
                                acum = "";
                                for(Object temp : estacione){
                                    if(temp instanceof estaciones){
                                        acum += ""+estacione.indexOf(temp)+" - "+temp+"\n";
                                    }
                                }
                                System.out.println(acum);
                                
                                System.out.println("Seleccione la Estacion: ");
                                int opcionEstacion = sc.nextInt();
                                
                                ArrayList<estaciones> temp =new ArrayList<>();
                                temp.add((estaciones)estacione.get(opcionEstacion));
                                ((transportes)transporte.get(opcionTransporte)).setEstaciones(temp);
                                break;
                            }
                            case 7: {
                                System.out.println("Estacion: ");
                                acum = "";
                                for(Object temp : transporte){
                                    if(temp instanceof estaciones){
                                        acum += ""+transporte.indexOf(temp)+" - "+temp+"\n";
                                    }
                                }
                                System.out.println(acum);
                                
                                System.out.println("Seleccione la Estacion: ");
                                int opcionEstacion = sc.nextInt();
                                
                                ArrayList<estaciones> temp =new ArrayList<>();
                                temp.add((estaciones)estacione.get(opcionEstacion));
                                ((transportes)transporte.get(opcionTransporte)).setEstaciones(temp);
                                break;
                            }
                            case 8: {

                            }
                            case 9: {

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
                    break;
                }
                case 8:{
                    String acum = "";
                    for(Object temp : clase){
                        if(temp instanceof clases){
                            acum += ""+clase.indexOf(temp)+" - "+temp+"\n";
                        }
                        
                    }
                    System.out.println(acum);
                    break;
                }
                case 9:{
                    String acum = "";
                    for(Object temp : estacione){
                        if(temp instanceof estaciones){
                            acum += ""+estacione.indexOf(temp)+" - "+temp+"\n";
                        }
                        
                    }
                    System.out.println(acum);
                    break;
                }
                case 10:{
                    String acum = "";
                    for(Object temp : persona){
                        if(temp instanceof alumnos){
                            acum += ""+persona.indexOf(temp)+" - "+temp+"\n";
                        }
                        
                    }
                    System.out.println(acum);
                    break;
                }
                case 11:{
                    String acum = "";
                    for(Object temp : persona){
                        if(temp instanceof transportista){
                            acum += ""+persona.indexOf(temp)+" - "+temp+"\n";
                        }
                        
                    }
                    System.out.println(acum);
                    break;
                }
                case 12:{
                    String acum = "";
                    for(Object temp : transporte){
                        if(temp instanceof transportes){
                            acum += ""+transporte.indexOf(temp)+" - "+temp+"\n";
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

