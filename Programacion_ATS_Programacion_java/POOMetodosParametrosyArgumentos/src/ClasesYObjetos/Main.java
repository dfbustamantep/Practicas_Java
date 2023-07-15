package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Bustamante P
 */
public class Main {

    public static void main(String[] args) {
        //vatiables locales
        int  n1,n2;
        
        //pedimos los valores de las variables con JOptionPane
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
        //instanciamos un objeto de nuestra clase operacion
        Operacion op = new Operacion();
        
        //mandamos por parametros nuestras variables gloables a los metodos que tenemos en nuestra clase operacion
        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);
        //mostramos los resultados
        op.mostrarResultados();

    }
}
