package pilas;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DBustamanteP
 */
public class Pila {
    Scanner entrada = new Scanner (System.in);
    int pilaNumerica[]=new int[5];
    int tope=-1;
    
    //Metodo para ingresar elementos a la pila
    public void push(){
        
        if(tope>=pilaNumerica.length-1){
            System.out.println("La pila esta llena");
        }
        else{
            tope+=1;
            System.out.println("Ingrese dato: ");
            pilaNumerica[tope] = entrada.nextInt();
        }
    }
    
    //
    public void pop(){
        if(tope==-1){
            System.out.println("La pila esta vacia");
        }
        else{
            System.out.println("Se ha eliminado un elemento de la pila");
            pilaNumerica[tope]=0;
            tope-=1;
            
        }
    }
    
    public void mostrar(){
        for(int i=4;i>=0;i--){
            System.out.println("Elemento de la pila "+i+" : "+pilaNumerica[i]);
        }
    }
}
