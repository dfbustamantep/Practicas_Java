
package pilas;

import java.util.Scanner;

/**
 *
 * @author DBustamanteP
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        Pila pila = new Pila();
        Scanner entrada = new Scanner (System.in);
        int opc=0;
        
        do{
            System.out.println("\n\tMenu");
            lineas();
            System.out.println("1.Ingresar elementos");
            System.out.println("2.Eliminar elementos");
            System.out.println("3.Mostrar la pila completa");
            System.out.println("4.Salir");
            lineas();
            System.out.println("Ingrese una opcion: ");
            opc=entrada.nextInt();
            lineas();
            switch(opc){
                case 1:
                    System.out.println("1.Ingreso elementos");
                    pila.push();
                    break;
                case 2:
                    System.out.println("2.Eliminacion elementos");
                    pila.pop();
                    break;
                case 3:
                    System.out.println("3.Mostrar la pila completa");
                    pila.mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
                      
            }
        }while(opc!=4);
    }
    
    public static void lineas(){
        System.out.println("----------------------------------------");
    }
}
