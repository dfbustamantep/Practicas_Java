/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOSobrecargaDeMetodos;

/**
 *
 * @author Daniel Bustamante P
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    String DNI;
    //Métodos
    
    //Metodo Constructor
    //no debe tener valor de retorno
    //permite inicializar los atributos de la clase

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //sobrecarga de constructores
    //cuando hay mas de un constructor que tienen diferentes parametros
    public Persona(String DNI) {
        this.DNI = DNI;
    }
    
    //tenemos mas de un metodo correr y lo diferenciamos por la cantidad de parametros o el tipo de parametros
    public void correr(){
        System.out.println("Soy "+nombre+" ,tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corriedo "+km+" km");
    }
}
