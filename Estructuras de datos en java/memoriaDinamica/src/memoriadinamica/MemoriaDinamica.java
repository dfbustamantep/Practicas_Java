/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memoriadinamica;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DBustamanteP
 */
public class MemoriaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Integer> listaNumerica=new ArrayList<Integer>();
        int n,i=0;
        Scanner entrada = new Scanner (System.in);
        do{
            System.out.println("Ingrese el numero "+(i+1)+": ");
            n=entrada.nextInt();
            if(n>=0){
            
            listaNumerica.add(n);
            i++;
            }
            
        }while(n>0);
        
        System.out.println("Datos de la lista");
        
        for(int j=0;j<listaNumerica.size();j++){
            System.out.println("Elemento "+(j+1)+": "+listaNumerica.get(j));
        }
        /*for(int num:listaNumerica){
            System.out.println(num);
        }*/
        
        if(listaNumerica.isEmpty()){
            System.out.println("La lista esta vacia");
        }
        else{
            System.out.println("La lista no esta vacia");
        }
    }
    
}
