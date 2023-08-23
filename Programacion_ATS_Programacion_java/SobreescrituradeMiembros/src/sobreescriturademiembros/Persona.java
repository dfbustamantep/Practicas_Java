
package sobreescriturademiembros;

/**
 *
 * @author DBustamanteP
 */
public class Persona extends Animal{

    @Override//estamos sobrescribiendo
    public void comer(){
        System.out.println("Estoy comiendo con cubiertos");
    }
}
