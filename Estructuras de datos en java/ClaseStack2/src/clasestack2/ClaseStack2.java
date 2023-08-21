/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestack2;

import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class ClaseStack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> enteros=new Stack<Integer>();
        Scanner entrada =new Scanner (System.in);
        int elementos;
        
        System.out.println("Ingrese el numero de elementos a agregar");
        elementos = entrada.nextInt();
        
        System.out.println("Agrega los numeros a la pila");
        
        for(int i=0;i<elementos;i++){
            System.out.println((i+1));
            enteros.add(entrada.nextInt());
        }
        
        System.out.println("Elementos de la pila");
        /*
        for(int ele:enteros){
            System.out.println(ele);
        }*/
        while(!enteros.empty()){
            System.out.println(enteros.pop());
        }
    }
    
}
