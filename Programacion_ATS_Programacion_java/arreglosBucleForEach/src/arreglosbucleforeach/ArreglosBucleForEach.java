/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbucleforeach;

/**
 *
 * @author Daniel Bustamante P
 */
public class ArreglosBucleForEach {

    public static void main(String[] args) {
        String[] nombres={"Alejandro","Maria","Luisa","Juan","Gabreila","Luis","Roberto","Flor"};
        
        //con el bucle for
        System.out.println("Bucle for");
        System.out.println("");
        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        
        //con el bucle for each
        //tipo de dato del arreglo nombre:nombre del arreglo
        System.out.println("Bucle for each");
        System.out.println("");
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }
    
}
