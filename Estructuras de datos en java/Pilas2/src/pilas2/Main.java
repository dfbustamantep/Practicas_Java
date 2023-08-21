/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas2;
import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class Main {
    public static void main(String[] args) {
        int tam,opc=0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite el tamaño de la pila");
        tam=entrada.nextInt();
        Pila pila = new Pila (tam);
        String comida;
        do{
            System.out.println("\tMenu\n");
            System.out.println("1-Agregar comida");
            System.out.println("2-Eliminar comida");
            System.out.println("3-Mostrar las comidas");
            System.out.println("4-Buscar comida");
            System.out.println("5-Salir");
            
            System.out.println("Digite la opcion deseada");
            opc = entrada.nextInt();
            entrada.nextLine(); //limpair el buffer
            
            switch(opc){
                case 1:
                    System.out.println("Digite la comida a agregar");
                    comida=entrada.nextLine();
                    
                   // entrada.nextLine(); //limpair el buffer
                    pila.agragarComidas(comida);
                    break;
                case 2:
                    pila.eliminarComidas();
                    break;
                case 3:   
                    pila.mostrar();
                    break;
                case 4:
                    System.out.println("Digite la comida a busar");
                    comida=entrada.nextLine();
                 
                   // entrada.nextLine(); //limpair el buffer
                    if(pila.buscar(comida)==true){
                        System.out.println("Comida encontrada");
                    }
                    else{
                        System.out.println("comida no encontrada");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Digite una opcion valida \n");
                    break;    
            }
        }while(opc!=5);
        
    }
            
}
