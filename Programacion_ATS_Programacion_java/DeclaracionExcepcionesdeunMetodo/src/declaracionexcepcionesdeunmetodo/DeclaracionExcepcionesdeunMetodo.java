/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package declaracionexcepcionesdeunmetodo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DBustamanteP
 */
public class DeclaracionExcepcionesdeunMetodo {
    
    public void leerArchivo() throws FileNotFoundException{
        File archivo = new File ("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader (archivo);
    }
    
    public void leerArchico2()throws IOException{
        leerArchivo();
    }
    
    public static void main(String[] args) {

    }
    
}
