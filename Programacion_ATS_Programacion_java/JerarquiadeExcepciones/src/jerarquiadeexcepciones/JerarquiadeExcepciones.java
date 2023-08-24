/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jerarquiadeexcepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DBustamanteP
 */
public class JerarquiadeExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        //Excepciones verificadas 
        //lectura de un archivo de texto
       /* BufferedReader bf = new BufferedReader (new FileReader("d:\\prueba\\texto.txt"));
        String linea;
        
        while((linea=bf.readLine())!=null){
            System.out.println(linea);
        }*/
       //Excepciones NO verificadas RunTimeException
       
       int num1=5,num2=0,resultado;
       resultado=num1/num2;
        System.out.println(resultado);
    }
    
}
