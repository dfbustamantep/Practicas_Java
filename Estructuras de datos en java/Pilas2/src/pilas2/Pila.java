/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas2;

/**
 *
 * @author DBustamanteP
 */
public class Pila {
    private int tope,maximo;
    private String pilasComidas[];
    
    public Pila(int maximo){
        this.maximo=maximo;
        tope=0;
        pilasComidas=new String [maximo];
    }
    
    public void agragarComidas(String comida){
        
        if(tope<maximo){
            pilasComidas[tope]=comida;
            tope++;
            System.out.println("El elemento ha sido agragado");
        }
    }
    
    public void eliminarComidas(){
        if(tope>0){
            System.out.println("El dato ha sido eliminado");
            tope--;
        }
        else{
            System.out.println("No hay datos a eliminar");
        }
    }
    
    public boolean estaVacia(){
        if (tope>0){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    public boolean buscar(String dato){
        boolean encontrado = false;
        if(!estaVacia()){
            for(int i= (tope-1);i>=0;i--){
                if(pilasComidas[i].equals(dato)){
                    encontrado=true;
                }
            }
            
        }else{
            System.out.println("No hay datos en la pila");
        }    
        return encontrado;
    }
    
    public void mostrar(){
        if(estaVacia() == false){
            for(int i=(tope-1);i>=0;i--){
                System.out.println(pilasComidas[i]);
            }
        }else{
            System.out.println("La pila esta vacia");
        }
    }
}
