/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poometodoconstructor;

/**
 *
 * @author Daniel Bustamante P
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Métodos
    
    //Metodo Constructor
    //no debe tener valor de retorno
    //permite inicializar los atributos de la clase
    public Persona(String nombre/*nomb*/,int edad/*ed*/){
        this.nombre = nombre/*nomb*/;
        this.edad = edad/*ed*/;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es "+edad);
    }
}
