/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordanamientoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Daniel Bustamante P
 */
public class OrdanamientoInsercion {

    public static void main(String[] args) {
        //creacion Scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);

        //variables 
        int arreglo[], nElementos, pos, aux;

        //JOptionPane para pedir el numero de elementos del arreglo
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        //definimos el tamaño del arreglo
        arreglo = new int[nElementos];

        //ingrso de datos al arreglo con un for 
        System.out.println("Ingreso de datos del arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Digite el elemento " + (i + 1) + ":");
            arreglo[i] = entrada.nextInt();
        }

        //Ordenamiento por insercion
        for (int i = 0; i < nElementos; i++) {
            //posicion del arreglo en el que vamos
            pos = i;
            //aux va valer el elemento del arreglo el cual estamos comprobando
            aux = arreglo[i];

            //bucle while
            //mientras la posicion sea mayor a 0 y el numero a la izquierda sea mayor que el numero actual
            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                //numero actual es igual al numero a la izquierda
                arreglo[pos]=arreglo[pos-1];
                //para que compruebe con los numeros que estan a la izquierda
                pos--;
            }
            //actualizamos el numero actual
            arreglo[pos]=aux;
        }
        
        System.out.println("\nOrden ascendente");
        for(int i:arreglo){
            System.out.print(i+" ");
        }
        
        System.out.println("\nOrden descendente");
        for(int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
    }

}
