/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package arreglosimprimirenordeninversounarreglo;

import java.util.Scanner;

/**
 *
 * @author Daniel Bustamante P
 */
public class ArreglosImprimirEnOrdenInversoUnArreglo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float numeros[]=new float[5];
        
        System.out.println("Entrada de datos\n");
        for(int i=0;i<numeros.length;i++){
            System.out.println("Digite numero "+(i+1)+": ");
            numeros[i]=entrada.nextFloat();
        }
        
        System.out.println("Datos ingresados\n");
        for(float datos:numeros){
        
        }
    }

}
