package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Bustamante P
 */
public class Operacion {

    //atributos
   
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //metodos
    
    //metodo para sumar ambos numeros
    //metdo que recibe dos parametros y no retorna
    public void sumar(int numero1,int numero2) {
        suma=numero1+numero2;
    }

    //metodo para restar ambos numeros
    //metdo que recibe dos parametros y no retorna
    public void restar(int numero1,int numero2) {
        resta=numero1-numero2;
    }

    //metodo para multiplicar ambos numeros
    //metdo que recibe dos parametros y no retorna
    public void multiplicar(int numero1,int numero2) {
        multiplicacion=numero1*numero2;
    }

    //metodo para dividir ambos numeros
    //metdo que recibe dos parametros y no retorna
    public void dividir(int numero1,int numero2) {
        division=numero1/numero2;
    }

    //mostramos los resultados
    public void mostrarResultados() {
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
    }
}
