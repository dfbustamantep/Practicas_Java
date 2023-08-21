
package clasestack3;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author DBustamanteP
 */
public class ClaseStack3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack <Producto> p = new Stack <Producto>();
        
        Producto pro;
        System.out.println("Ingrese la cantidad de productos");
        int cantidad=entrada.nextInt();
        
        String nom;
        int cod,stock;
               
        for(int i=0;i<cantidad;i++){
            
            System.out.println("\tProdcuto "+(i+1));
            System.out.println("--------------------------------------------");
            entrada.nextLine();
            System.out.println("Digite el nombre del producto");
            nom=entrada.nextLine();
            System.out.println("Digite el codigo del producto");
            cod=entrada.nextInt();
            System.out.println("Digite la cantidad del producto");
            stock=entrada.nextInt();
            System.out.println("--------------------------------------------");
            
            pro = new Producto(nom,cod,stock);
            p.push(pro);
            
        }
        System.out.println("Productos con stock menor a 10");
        //mientras la pila no este vacia
        while(!p.isEmpty()){
            //invocamos al metodo pop y lo guardamos en pop
            pro=p.pop();
            //almacenamos el stock del producto
            int st=pro.getStock();
            if(st<10){
                pro.mostrar();
            }
        }
    }
    
}
