/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Daniel Bustamante P
 */
public class Matrices {

    public static void main(String[] args) {
        int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<3;i++){//numero de filas
            for(int j=0;j<3;j++){//numero de columnas
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        int matriz1[][],filas,columnas;
        Scanner input=new Scanner(System.in);
        
        filas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        columnas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        
        matriz1=new int[filas][columnas];
        
        System.out.println("Ingreso de datos");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Digite el elemento ["+(i+1)+"]["+(j+1)+"]:");
                matriz1[i][j]=input.nextInt();
            }
        }
        
        System.out.println("Salida de datos");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz1[i][j]);   
                System.out.print(" ");
            }
            System.out.println("");
        }        
    }

}
