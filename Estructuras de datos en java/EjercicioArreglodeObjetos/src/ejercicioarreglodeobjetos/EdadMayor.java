/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarreglodeobjetos;

/**
 *
 * @author DBustamanteP
 */
public class EdadMayor {
    public static Persona edadMayor(Persona [] persona){
        int mayor=0;
        String nombre="";
        
        for (int i=0;i<persona.length;i++){
            if(persona[0].getEdad()>mayor){
                mayor = persona[0].getEdad();
                nombre=persona[0].getNombre();
            }
        }
        
        Persona pMayor = new Persona(nombre,mayor);
        return pMayor;
    }
}
