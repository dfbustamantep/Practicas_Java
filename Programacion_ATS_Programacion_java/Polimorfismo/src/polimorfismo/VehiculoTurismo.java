/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author DBustamanteP
 */
public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;
    
    public VehiculoTurismo(String matricula, String marca, String modelo,int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return "La matricula es: "+matricula+"\nLa marca es: "+marca+"\nEl modelo es: "+modelo+"\nEl numero de puertas es: "+nPuertas+"\n";
    }
}
