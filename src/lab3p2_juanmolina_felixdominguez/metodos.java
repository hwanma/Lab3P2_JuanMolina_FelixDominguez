/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;
import java.util.ArrayList;
import java.util.Scanner;

public class metodos {
    
    public static Scanner sc = new Scanner(System.in);
    
    public int menu(){
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
    
    public int menuSimulacion(){
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
    
    public void simulacion(){
        
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
        
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            switch (menuSimulacion()) {
                case 0: {
                    System.out.println("Gracias por utilizar este programa!");
                    resp = 'n';
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
                    
                    if(transportes)
                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
                case 6: {

                }
                case 7: {

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
    }
    
    public int menuTransporte(){
        System.out.println("1. Bus\n" +
                            "2. Taxi\n" +
                            "3. MotoTaxi\n" +
                            "4. Rapidito\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
    }
        
    
    public boolean valid(int x, ArrayList<Personas> y){
        boolean estado = false;
        
        for(int i=0;i<y.size();i++){
            if(x==((alumnos)y.get(i)).getIdEstudiante()){
                System.out.println("Este id ya existe!");
                estado = true;
                break;
            }
        }
        
        return estado;
    }
    
    public boolean valid2(int x, ArrayList<clases> y){
        boolean estado = false;
        
        for(int i=0;i<y.size();i++){
            if(x==((clases)y.get(i)).getCodigo()){
                System.out.println("Este id ya existe!");
                estado = true;
                break;
            }
        }
        
        return estado;
    }
    
    public boolean valid3(int x, ArrayList<Personas> y){
        boolean estado = false;
        
        for(int i=0;i<y.size();i++){
            if(x==((Personas)y.get(i)).getIdentidad()){
                System.out.println("Este id ya existe!");
                estado = true;
                break;
            }
        }
        
        return estado;
    }
    
    public boolean valid4(int x, int z, ArrayList<transportes> y){
        boolean estado = false;
        
        for(int i=0;i<y.size();i++){
            if(x==((transportes)y.get(i)).getIdEstudiantes()){
                System.out.println("Este id ya existe!");
                estado = true;
                break;
            }
        }
        return estado;
    }
}
