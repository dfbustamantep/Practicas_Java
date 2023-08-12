/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarreglos;

import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class EjercicioArreglos {

    /* Se nos pedira ingresar 6 calificaciones de un alumno en un arreglo.
    Despues mostraremos las calificaciones aprobadas 
    y tambien mostraremos cuantas calificaciones aprobo
     */
    public static void main(String[] args) {
        double notas[]=new double [6];
        Scanner entrada = new Scanner(System.in);
        int cont=0;
        System.out.println("Ingreso de datos del estudiante");
        for(int i =0 ;i<notas.length;i++){
            System.out.println("Digite la nota "+(i+1)+": ");
            
                notas[i]=entrada.nextDouble();
            
        }
        
        System.out.println("\nCalificaciones aprobadas");
        for(double nota:notas){
            if(nota>=3){
                System.out.println("Nota aprobada "+nota);
                cont++;
            }
        }
        
        System.out.println("El estudiante aprobo "+cont+" notas" );
    }
    
}
