/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 * @author Daniel Bustamante P
 */
public class BusquedaSecuencial {

    public static void main(String[] args) {
        //creamos y definimos un arreglo
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;//variable para el dato a buscar
        boolean band = false;//bandera
        //pedimos el dato por medio de JOptionPane
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));

        //Busqueda Secuencial
        int i = 0;//creamos un iterador
        //con un ciclo while mientras la bandera sea menor que 5 porque es el tamño del arreglo
        //y mientras la bandera sea falsa recorremos el arreglo hasta el final para encontrar el dato
        while (i < 5 && band == false) {
            if(arreglo[i]==dato){
                band=true;
            }
            i++;
        }
        
        if(band==false){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el numero en el arreglo");          
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion "+(i-1));
        }
        
    }

}
