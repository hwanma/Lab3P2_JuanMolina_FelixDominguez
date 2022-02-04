/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmolina_felixdominguez;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int menu(){
        System.out.println("");
        System.out.println("*****REGISTRO DE ANIMALES*****");
        System.out.println("0. Salir");
        System.out.println("1. Agregar Animal\n" +
                            "2. Editar Animal\n" +
                            "3. Imprimir Animal\n" +
                            "4. Alimentacion\n" +
                            "5. Eliminar Animal\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
    }
}
