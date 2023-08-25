
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    JPanel panel ;
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
        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();//Creacion del panel
        //panel.setBackground(Color.green);//establecemos el color del panel
        panel.setLayout(null);//estamos desactivando el diseño para qusar el metodo setBounds en etiqueta
        this.getContentPane().add(panel);//agregamosd el panel a la ventana
    }
    
    private void colocarEtiquetas(){
        
        //JLabel etiqueta = new JLabel("Hola");//creamos una etiqueta
        JLabel etiqueta = new JLabel();
        //JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER);//Construvtor para el texto y ubicacion del texto en la etiqueta 
        etiqueta.setText("Mundial 2018");//establecemos el texto en la etiqueta
        etiqueta.setBounds(85,10 ,300 ,80 );//posicionamos la etiqueta pos x,y,alto y ancho
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//estabelecemos la alineacion horizontal del texto
        etiqueta.setForeground(Color.BLACK);//establecemos el color de la letra
        //etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.black);//cambiamos el color de fondo de la etiqueta
        etiqueta.setFont(new Font("Comic Sans MS",0,40));//establecemos la fuente del texto primer parametro nombre de la fente,segundo el estilo de la fuente el cual se puede poner numerico o con el metodo Font.tipoTexto y el ultimo parametro tamaño
        /*
        0 normal
        1 negrita
        2 cursiva
        3 negrita y cursiva
        */
        panel.add(etiqueta);//agregamos la etiqueta sobre el panel
        
        //Etiqueta 2 - etiqueta tipo imagen
       
        JLabel etiqueta2 = new JLabel();//creamos la etiqueta
        ImageIcon imagen = new ImageIcon("balonMundial.jpg");//creamos la imagen
               
        //etiqueta2.setIcon(new ImageIcon("balonmundial.jpg"));
        etiqueta2.setBounds(80, 80, 300, 300);
        //etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));//ancho alto y un tipo de escalado
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//ancho alto y un tipo de escalado
        panel.add(etiqueta2);
        
    }
    
    public void colocarBotones(){
        //JButton boton1 = new JButton("Click"); //establecemos el texto en el constructor
        JButton boton1 = new JButton();
        boton1.setText("Click");//establecemos el texto
        boton1.setBounds(100, 100, 100, 40);//x y ancho alto
        boton1.setEnabled(true);//activar o descativar las funciones del boton 
        boton1.setMnemonic('a');//estabelecemos alt +letra que pongamos para poder usar el boton
        panel.add(boton1);//añadimos el boton al panel
        
    }
}
