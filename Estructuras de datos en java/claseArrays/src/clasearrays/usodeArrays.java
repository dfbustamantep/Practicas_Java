/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasearrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class usodeArrays {
    public static void llenarArreglo(int arreglo[]){
        int n,i=0;
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("\nIngreso de datos");
        do{
            System.out.print("Digite el dato "+(i+1)+": ");
            n=entrada.nextInt();
            
            if(n>=0 && n<=10){
                arreglo[i]=n;
                i++;
            }
            
        }while(i<10);
    }
    
    //metodo para mostrar el arreglo
    public static void mostrarArreglo(int arreglo[]){
        //System.out.println("\nDatos del arreglo");
        
        for(int num:arreglo){
            System.out.println(num);
        }
    }
    
    public static void ordenarArreglo(int arreglo[]){
        Arrays.sort(arreglo);
        usodeArrays.mostrarArreglo(arreglo);
        
    }
}
