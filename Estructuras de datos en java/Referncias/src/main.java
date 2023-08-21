/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DBustamanteP
 */
public class main {
    public static void main(String[] args) {
        
        Persona p1;//esta apuntando a null
        p1=new Persona("Jose",40);//ya hemos reservado espacio de memeoria de los atributos 
        Persona p2=new Persona("Ana",12);
        System.out.println("P1: \n"+p1);
        System.out.println("P2: \n"+p2);
        
        p2=p1;//p2 apunta al mismo espacio de memoria de p1
        
        System.out.println("Despues de p2=p1");
        System.out.println("P1: \n"+p1);
        System.out.println("P2: \n"+p2);
    }
            
}
