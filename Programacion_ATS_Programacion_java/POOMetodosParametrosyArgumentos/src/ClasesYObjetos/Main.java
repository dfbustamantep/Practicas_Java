package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Bustamante P
 */
public class Main {

    public static void main(String[] args) {
        int  n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
        Operacion op = new Operacion();
        
        //op.leerNumeros();
        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);
        
        op.mostrarResultados();

    }
}
