/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden que ingresaron.
package arreglosimprimirenordenunarreglo;

import java.util.Scanner;

/**
 *
 * @author Daniel Bustamante P
 */
public class ArreglosImprimirEnOrdenUnArreglo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float numeros[]=new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print("Digite numero "+(i+1)+" :");
            numeros[i]=entrada.nextFloat();
        }
        
        System.out.println("\nMostrando datos");
        for(int i=4;i>=0;i--){
            System.out.println("El numero en la posicion "+i+" es "+numeros[i]);
        }
    }
    
}
