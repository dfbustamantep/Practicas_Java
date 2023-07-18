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
        //como los metodos retornan entonces mostramos en un mensaje por consola los reultados
        /*int sum=*/System.out.println("La suma es "+op.sumar(n1,n2));
        /*int res=*/System.out.println("La resta es "+op.restar(n1,n2));
        /*int mult=*/System.out.println("La division es "+op.multiplicar(n1,n2));
        /*int div=*/System.out.println("La multiplicacion es "+op.dividir(n1,n2));
        
        /*//mostramos los resultados
        op.mostrarResultados(sum,res,mult,div);
        */
    }
}
