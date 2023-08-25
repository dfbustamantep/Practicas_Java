
package Ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        //ancho,largo
        this.setSize(500,500);//establecemos el tamaño de la ventana
        setTitle("El mejor titulo");//establecemos el titulo de la ventana
        //setLocation(100,200);//Coordenada X Coordenada Y Establecemos la posicion inicla de la vantana
        //setBounds(100, 200, 500, 500);//setLocation y setSize en un mismo metodo, primeros parametros las cooredenas  X y Y,los otors dos son el tamaño de la ventana
        setLocationRelativeTo(null);//null establecemos en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cuando cerremos la ventana el programa tambien finaliza
    }
}
