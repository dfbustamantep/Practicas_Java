
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    public Ventana(){
        //ancho,largo
        this.setSize(500,500);//establecemos el tamaño de la ventana
        setTitle("El mejor titulo");//establecemos el titulo de la ventana
        //setLocation(100,200);//Coordenada X Coordenada Y Establecemos la posicion inicla de la vantana
        //setBounds(100, 200, 500, 500);//setLocation y setSize en un mismo metodo, primeros parametros las cooredenas  X y Y,los otors dos son el tamaño de la ventana
        setLocationRelativeTo(null);//null establecemos en el centro de la pantalla
        
        
        //setResizable(false);//Establecemos si la ventana se puede cmabiar de tamaño o no
        setMinimumSize(new Dimension(200,100));//Establecemos el tamaño minimo que puede tomar nuestra ventana
        
        //this.getContentPane().setBackground(Color.blue);//Establecemos un color a la ventana
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cuando cerremos la ventana el programa tambien finaliza
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel();//Creacion del panel
        //panel.setBackground(Color.green);//establecemos el color del panel
        panel.setLayout(null);//estamos desactivando el diseño para qusar el metodo setBounds en etiqueta
        this.getContentPane().add(panel);//agregamosd el panel a la ventana
        
        //JLabel etiqueta = new JLabel("Hola");//creamos una etiqueta
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola");//establecemos el texto en la etiqueta
        etiqueta.setBounds(10,10 ,30 ,20 );//posicionamos la etiqueta
        etiqueta.setForeground(Color.white);//establecemos el color de la letra
        etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.black);//cambiamos el color de fondo de la etiqueta
        panel.add(etiqueta);//agregamos la etiqueta sobre el panel
    }
}
