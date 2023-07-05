/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio_4_arreglos;

import java.util.Scanner;

/**
 * @author Daniel Bustamante P
 */

/*
Ejercicio 4: Leer 10 numeros enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero, el último, 
el segundo, el penultimo, el tercero, etc.
 */
public class Ejercicio_4_arreglos {

    public static void main(String[] args) {
        int numeros []=new int[10];
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("\nIngreso de datos");
        
        for(int i=0;i<10;i++){
            System.out.println("Digite numero "+(i+1)+" :");
            numeros[i]=entrada.nextInt();
        }
        
        System.out.println("\nDatos ingresados");
        
        for(int i=0;i<(numeros.length)/2;i++){
            System.out.println(numeros[i]);
            System.out.println(numeros[(numeros.length-1)-i]);
        }
    }

}
