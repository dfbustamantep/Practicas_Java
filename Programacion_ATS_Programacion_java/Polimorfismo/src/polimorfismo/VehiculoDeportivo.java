/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author DBustamanteP
 */
public class VehiculoDeportivo  extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo,int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    @Override
    public String mostrarDatos(){
        return "La matricula es: "+matricula+"\nLa marca es: "+marca+"\nEl modelo es: "+modelo+"\nEl cilindraje es "+cilindrada+"\n";
    }
    
}
