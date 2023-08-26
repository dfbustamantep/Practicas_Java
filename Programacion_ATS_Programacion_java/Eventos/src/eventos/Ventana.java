/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DBustamanteP
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;
    
    public Ventana(){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarAreaDeTexto();
        colocarBoton();
        
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void colocarEtiqueta(){
        /*JLabel etiqueta = new JLabel ("Ingrese su nombre");
        etiqueta.setBounds(30, 10,200,30);
        etiqueta.setFont(new Font("Comic Sans MS",0,20));
        panel.add(etiqueta);*/
    }
    
    private void colocarAreaDeTexto(){
        /*cajaTexto = new JTextField();
        cajaTexto.setBounds(30,50,300,30);
        panel.add(cajaTexto);*/
        
        areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,200,300);
        panel.add(areaTexto);
    }
    
    private void colocarBoton(){
        boton = new JButton("¡Pulsa aqui!");
        boton.setBounds(150,350,150,40);
        boton.setFont(new Font("Comics Sans MS",0,15));
        panel.add(boton);
        
        saludo = new JLabel();
        saludo.setBounds(50,400,300,40);
        saludo.setFont(new Font("Comics Sans MS",0,15));
        panel.add(saludo);
        
        //eventoOyenteDeAccion();
        eventoOyenteDeRaton();
                
    }
    
    private void eventoOyenteDeAccion(){
        //Agregamos el evento de tipo ActionListener
        ActionListener oyenteDeAccion;
        oyenteDeAccion = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+areaTexto.getText());
               /* String a =cajaTexto.getText();
                System.out.println(a);*/
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }
    
    private void eventoOyenteDeRaton(){
        //agregando oyente de raton 
        MouseListener oyenteDeRaton;
        oyenteDeRaton = new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {//presionar y solatar el boton dentro del boton
                areaTexto.append("Mouse clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {//presionar el boton
                areaTexto.append("Mouse pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {//presionar y soltar boton
                areaTexto.append("Mouse relessed\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("Mouse entered\n");//meter el cursor en el boton
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("Mouse exited\n");//quitar el cursosr del boton
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }
}
