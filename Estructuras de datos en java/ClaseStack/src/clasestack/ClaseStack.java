/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestack;

import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class ClaseStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<String>pila = new Stack<String> ();
        String elemento;
        
        System.out.println("Digite 5 palabras");
        
        for(int i=0;i<5;i++){
            System.out.println((i+1));
            elemento=entrada.nextLine();
            pila.push(elemento);
        }
        
        System.out.println("Elementos de la pila");
        /*for(String elem:pila){
            System.out.println(elem);
        }*/
        
        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
    
}
