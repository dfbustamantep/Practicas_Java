/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Daniel Bustamante P
 */
public class MetodoBurbuja {

    public static void main(String[] args) {

        //creacion scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        
        //variables locales
        int arreglo[], nElementos, aux;
        
        //pedimos el tamaño del arreglo con el JOptionPane
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        
        //le asiganmos al arreglo el numero de elementos que va a tener
        arreglo = new int[nElementos];

        //entrada de datos para el arrreglo
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Digite elemento " + (i+1) + ":");
            arreglo[i] = entrada.nextInt();
        }

        //metodo burbuja
        //for para saber cuantas vueltas va a dar para organizar
        for (int i = 0; i < (nElementos - 1); i++) {
            //para ordenar el arreglo
            for (int j = 0; j < (nElementos - 1); j++) {
                //si numeroActual>numeroSiguiente 
                //realizamos cambio
                if (arreglo[j] > arreglo[j + 1]) {
                    //con ayuda de la variable auxiliar intercambiamos los valores
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        
        //imprimimos el arreglo ordenado de manera creciente
        System.out.println("\nArreglo ordenado de forma creciente\n");
        for(int i:arreglo){
            System.out.print(i+"");
        }
        
        /*for(int i=0;i<nElementos;i++){
            System.out.println(arreglo[i]);
        }*/
        
        System.out.println("\nArreglo ordanado de forma decreciente\n");
        for(int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" ");
        }
        
    }

}
