
package poomiembrosestaticos;

/**
 *
 * @author DBustamanteP
 */
public class POOMiembrosEstaticos {
    //atributo estatico
    private static String frase = "Primera frase";
    
    //metodo estatico
    public static int sumar(int n1,int n2){
        int suma=n1+n2;
        return suma;
    }
    
    public static void main(String[] args) {
        /*POOMiembrosEstaticos objeto1= new POOMiembrosEstaticos();
        POOMiembrosEstaticos objeto2= new POOMiembrosEstaticos();
        
        objeto2.frase="Segunda frase";
        
        System.out.println(objeto1.frase);
        System.out.println(objeto2.frase);*/
        System.out.println(POOMiembrosEstaticos.frase);
        System.out.println("La suma es "+POOMiembrosEstaticos.sumar(3, 4));
    }
    
}
