/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasearrays;

//mport static clasearrays.usodeArrays.llenarArreglo;

/**
 *
 * @author DBustamanteP
 */
public class ClaseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[]=new int [10];
        
        usodeArrays.llenarArreglo(numeros);
        System.out.println("\nDatos del arreglo");
        usodeArrays.mostrarArreglo(numeros);
        System.out.println("\nDatos del arreglo ordenados");
        usodeArrays.ordenarArreglo(numeros);
        
    }
    
}
