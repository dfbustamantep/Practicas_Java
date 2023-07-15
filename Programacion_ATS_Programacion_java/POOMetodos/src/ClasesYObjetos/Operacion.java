package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Bustamante P
 */
public class Operacion {

    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //metodos
    //metodo para pedir al usuario que digite los numeros
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));
    }

    //metodo para sumar ambos numeros
    public void sumar() {
        suma = numero1 + numero2;
    }

    //metodo para restar ambos numeros
    public void restar() {
        resta = numero1 - numero2;
    }

    //metodo para multiplicar ambos numeros
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    //metodo para dividir ambos numeros
    public void dividir() {
        division = numero1 / numero2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
    }
}
