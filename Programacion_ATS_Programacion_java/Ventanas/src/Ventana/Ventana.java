
package Ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        //ancho,largo
        this.setSize(500,500);//establecemos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cuando cerremos la ventana el programa tambien finaliza
        setTitle("El mejor titulo");//establecemos el titulo de la ventana
    }
}
