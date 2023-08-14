/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarreglodeobjetos;
import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class EjercicioArreglodeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona personas[]=new Persona [5];
        Persona mayor;
        String nombre;
        int edad;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingreso de datos de las personas");
        
        for(int i = 0;i<personas.length;i++){
            System.out.println("Ingrese el nombre de la persona");
            nombre=entrada.nextLine();
            System.out.println("Ingrese la edad de la persona");
            edad=entrada.nextInt();
            
            Persona persona=new Persona(nombre,edad);
            personas[i]=persona;
        }
        
        mayor=EdadMayor.edadMayor(personas);
        
        System.out.println("La persona mayor es "+mayor.getNombre()+" con "+mayor.getEdad());
        
    }
    
}
