/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author DBustamanteP
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arreglo[] = new int [5];
        Scanner entrada = new Scanner(System.in);
        int n,bandera=0;
        
        System.out.println("Digite los numeros para el arreglo");
        for(int i=0;i<(arreglo.length);i++){
            System.out.println("Dato "+(i+1)+":");
            arreglo[i]=entrada.nextInt();
        }
        
        System.out.println("Datos del arreglo");
        
        for(int i=0;i<(arreglo.length);i++){
            System.out.println("Dato :"+(i+1)+":"+arreglo[i]);
        }
        
        System.out.println("Busqueda de un numero");
        
        System.out.println("Ingrese un numero a buscar ");
        n=entrada.nextInt();
        
        for(int i = 0;i < (arreglo.length-1);i++){
            if(arreglo[i] == n){
                bandera=1;
            }
        }
         
        if(bandera==0){
            System.out.println("No se encontro el numero");
        }
        else{
            System.out.println("El numero se encontro en el arreglo");
        }
    }
    
}
