/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package POOSobrecargaDeMetodos;

/**
 * @author Daniel Bustamante P
 */
public class POOSobrecargaDeMetodos {

    public static void main(String[] args) {
        
        //creamos un objeto de tipo persona usando el primer constructor
        Persona p1=new Persona("Daniel",19);
        //usamos el objeto persona p1 y el metodo correr que no tiene parametros
        p1.correr();
        
        //creamos un objeto de tipo persona usando el segundo constructor
        Persona p2=new Persona("1556468");
        //usamos el objeto persona p2 y el metodo correr que tiene parametros
        p2.correr(50);
    }

}
