
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.MediaTracker;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
        //colocarBotones();
        // colocarRadioBotones();
        //colocarCajasdeTexto();
        //colocarAreasdeTexto();
        colocarListasDesplegables();
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
    
    private void colocarBotones(){
        
        //boton 1 boton de texto
        //JButton boton1 = new JButton("Click"); //establecemos el texto en el constructor
        JButton boton1 = new JButton();
        boton1.setText("Click");//establecemos el texto
        boton1.setBounds(100, 100, 100, 40);//x y ancho alto
        boton1.setEnabled(true);//activar o descativar las funciones del boton 
        boton1.setMnemonic('a');//estabelecemos alt +letra que pongamos para poder usar el boton
        boton1.setForeground(Color.blue);//establecemos el color de la lewtra del boton
        boton1.setFont(new Font("Comic Sans MS",3,20));//establecemos la fuente del texto primer parametro nombre de la fente,segundo el estilo de la fuente el cual se puede poner numerico o con el metodo Font.tipoTexto y el ultimo parametro tamaño
        /*
        0 normal
        1 negrita
        2 cursiva
        3 negrita y cursiva
        */
        panel.add(boton1);//añadimos el boton al panel
        
        //boton 2 bton de imagewn
        JButton boton2 = new JButton();//creamos un nuevo boton
        //x y ancho alto
        boton2.setBounds(100,200,100,40);
        //boton2.setOpaque(true);//cuando no nos deja cambiar el color del boton podemos usar el metodo .setOpaque
        ImageIcon imagen2 = new ImageIcon("boton.jpg");//creamos una imagen
        boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight() ,Image.SCALE_SMOOTH )));
        boton2.setBackground(Color.blue);//establecemos color de fondo del boton
        
        panel.add(boton2);
        
        
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1",true);//true aparece marcado cuando lo ejecutamos
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);//para que este disponible 
        radioBoton1.setText("Programacion");//cambiar texto
        radioBoton1.setFont(new Font("Comic Sans MS",0,20));
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2",false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3",false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    
    private void colocarCajasdeTexto(){
        JTextField cajaTexto = new JTextField();//creacion caja de texto
        //JTextField cajaTexto = new JTextField("Hola",20);//constructor para poner un mensaje en la caja y el tamañlo del jtextfield cuando el layout del panel esta activado
        cajaTexto.setBounds(50, 50, 200, 30);//x y ancho alto
        cajaTexto.setText("Hola..");//le ponemos un texto a la caja
        
        System.out.println("El texto en la caja es: "+cajaTexto.getText());//impirmimos un mensaje que nos idga que dice la caja y lo que dice la cja alo conseguimos con el metodo .getText();
        panel.add(cajaTexto);
        
    }
    
    private void colocarAreasdeTexto(){
        JTextArea areaTexto=new JTextArea();//creacion area de texto
        areaTexto.setBounds(20, 20, 300, 200);//x y ancho alto
        areaTexto.setText("Escriba el texto aqui..");//dar un texto predefinido
        areaTexto.append("\nEscribe por aqui..");//añadir mas texto al area
        areaTexto.setEditable(true);//establecer editado del area de texto
        
        System.out.println("El texto es "+areaTexto.getText());
        panel.add(areaTexto);
    }
    
    private void colocarListasDesplegables(){
        String [] paises = {"Colombia","Peru","Paraguay","Ecuador"};
        
        JComboBox listaDesplegable1 = new JComboBox(paises);//añadimos la lista de paises a nuestra lsita desplegable
        listaDesplegable1.setBounds(20, 20, 100, 30);// x y ancho alto
        
        listaDesplegable1.addItem("Argentina");//agregar otro elemento a JComboBox
        listaDesplegable1.setSelectedItem("");//seleccionar el primer objeto visto
        panel.add(listaDesplegable1);
    }
}
