
package sobreescriturademiembros;

/**
 *
 * @author DBustamanteP
 */
public class Perro extends Animal{
    @Override//estamos sobrescribiendo
    public void comer(){
        System.out.println("Estoy comeindo con mi plato en el suelo");
    }
}
