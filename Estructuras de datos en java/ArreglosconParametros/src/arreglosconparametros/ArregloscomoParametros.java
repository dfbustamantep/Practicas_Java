/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosconparametros;

import java.util.Scanner;

/**
 *
 * @author DBustamanteP
 */
public class ArregloscomoParametros {
    static Scanner entrada=new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam;
        int numeros[];
        
        System.out.print("Digite el tamanio del arreglo :");
        tam=entrada.nextInt();
        
        numeros=new int [tam];
        
        llenarArreglo(numeros);
        mostrarArreglo(numeros);
    }
    
    //Crear un metodo para llenar el arreglo
    public static void llenarArreglo(int numeros[]){
        System.out.println("\nDigite los datos para el arreglo");
        for(int i=0;i<numeros.length;i++){
            System.out.print("Digite el numero "+(i+1)+":");
            numeros[i]=entrada.nextInt();
        }
    }
    
    //Crear metodo para mostrar datos del arreglo
    public static void mostrarArreglo(int numeros[]){
        System.out.println("\nDatos del arreglo");
        for(int i=0;i<numeros.length;i++){
            System.out.println("Numero "+(i+1)+":"+numeros[i]);
        }
        /*for(int num:numeros){
            System.out.println(num);
        }*/
    }
    
}
