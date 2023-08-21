
package clasestack3;

/**
 *
 * @author DBustamanteP
 */
public class Producto {
    private String nombre;
    private int codigo,stock;
    
    public Producto(String nom,int cod,int st){
        nombre = nom;
        codigo = cod;
        stock = st;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+"\nCodigo: "+codigo+"\nStock: "+stock);
    }
}
