/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio.pkg3.arreglos;

import java.util.Scanner;

/**
 * @author Daniel Bustamante P
 */

/*Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar 
la media de los números positivos, la media de los negativos y conteo el número de ceros.
*/
public class Ejercicio3Arreglos {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float numeros[]=new float[5];
        float sumaPositivos=0,sumaNegativos=0,mediaPositivos,mediaNegativos;
        int contPositivos=0,contNegativos=0,contCeros=0;
        
        System.out.println("Ingreso de datos");
        for(int i=0;i<5;i++){
            System.out.print("Digite numero "+(i+1)+": ");
            numeros[i]=entrada.nextFloat();
            
            if(numeros[i]==0)
                contCeros++;
            else if(numeros[i]>0){
                sumaPositivos+=numeros[i];
                contPositivos++;
            }
            else{
                sumaNegativos+=numeros[i];
                contNegativos++;
            }
        }
        
        //Calcular las medias
        if(contPositivos==0){
            System.out.println("No hay numeros positivos");
        }
        else{
            mediaPositivos=sumaPositivos/contPositivos;
            System.out.println("La media de los numeros positivos es: "+mediaPositivos);
        }    
        
        if(contNegativos==0){
            System.out.println("No hay numeros negativos");
        }
        else{
            mediaNegativos=sumaNegativos/contNegativos;
            System.out.println("La media de los numeros negativos es: "+mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es : "+contCeros);
    }

}
