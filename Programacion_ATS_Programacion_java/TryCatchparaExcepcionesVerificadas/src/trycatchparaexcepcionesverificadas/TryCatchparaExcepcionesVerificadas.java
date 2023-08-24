/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatchparaexcepcionesverificadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author DBustamanteP
 */
public class TryCatchparaExcepcionesVerificadas {
    
    public void leerArchivo() throws FileNotFoundException,IOException{
        File archivo = new File ("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader (archivo);
    }
    
    public void leerArchivo2(){
        try{
            //todo aquello que pueda tenr una excepcion
            leerArchivo();
        }
        catch(FileNotFoundException ex){
            //capturar la excepcion
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado,por favor veriique la ruta");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        }
        finally{
            System.out.println("El finally se ejecuta siempre");
        }
        
        System.out.println("Progrma terminado");
    }
    
    public static void main(String[] args) {
        TryCatchparaExcepcionesVerificadas prueba= new TryCatchparaExcepcionesVerificadas();
        
        prueba.leerArchivo2();
    }
    
}
