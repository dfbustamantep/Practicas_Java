/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memoriaestatica;
import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class MemoriaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[]=new int[10];
        
        Scanner entrada = new Scanner(System.in);
        int num;
        int i=0;
        
        do{
            System.out.println("Ingrese un numero: ");
            num=entrada.nextInt();
            numeros[i]=num;
            i++;
        }while(i<10);
        
        System.out.println("\nDatos ingresados");
        for(int n:numeros){
            System.out.println(n);
        }
    }
    
}
