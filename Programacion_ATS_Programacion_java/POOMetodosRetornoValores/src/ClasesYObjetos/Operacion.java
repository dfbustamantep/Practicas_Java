package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Bustamante P
 */
public class Operacion {

    //atributos
   
    //metodos
    
    //metodo para sumar ambos numeros
    //metdo que recibe dos parametros y retorna un entero
    public int sumar(int numero1,int numero2) {
        int suma=numero1+numero2;
        return suma;
    }

    //metodo para restar ambos numeros
    //metdo que recibe dos parametros y retorna un entero
    public int restar(int numero1,int numero2) {
        int resta=numero1-numero2;
        return resta;
    }

    //metodo para multiplicar ambos numeros
    //metdo que recibe dos parametros y retorna un entero
    public int multiplicar(int numero1,int numero2) {
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }

    //metodo para dividir ambos numeros
    //metdo que recibe dos parametros y retorna un entero
    public int dividir(int numero1,int numero2) {
        int division=numero1/numero2;
        return division;
    }

    /*//mostramos los resultados
    public void mostrarResultados(int suma,int resta,int multiplicacion,int division) {
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
    }*/
}
