/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DBustamanteP
 */
import java.util.Scanner;
public class Enum {
    //Talla solo podra guardar esos valores
    /*enum Talla{
        MINI,
        MEDIANO,
        GRANDE,
        MUY_GRANDE
    };*/
    
    enum Talla{
        MINI("S"),
        MEDIANO("M"),
        GRANDE("L"),
        MUY_GRANDE("XL");
        
      private Talla(String abreviatura){
          this.abreviatura = abreviatura;
      }
      
      public String dameAbreviatura(){
          return abreviatura;
      }
      
      private String abreviatura;
    };
    
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
            /*
            String talla;
                        
            talla="Pequeña";
            talla="Mediana";
            talla="Grande";
            */
            /*Talla s=Talla.MINI;
            Talla m=Talla.MEDIANO;
            Talla l=Talla.GRANDE;
            Talla xl=Talla.MUY_GRANDE;*/
            
            System.out.println("Digite una talla: MINI,MEDIANO,GRANDE,MUY_GRANDE");
            
            String entradaDatos = entrada.next().toUpperCase();
            
            //Talla laTalla = Enum.valueOf(Talla.class,entradaDatos);
            Talla laTalla = Talla.valueOf(Talla.class, entradaDatos);
            System.out.println("Talla "+laTalla);
            
            System.out.println("Abreviatura "+laTalla.dameAbreviatura());
    }
}
