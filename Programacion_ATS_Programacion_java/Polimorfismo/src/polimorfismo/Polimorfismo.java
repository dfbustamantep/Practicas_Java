/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author DBustamanteP
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo misVehiculos[]=new Vehiculo[4];
        
        misVehiculos[0]=new Vehiculo("GH67","Ferrari","A89");
        misVehiculos[1]=new VehiculoTurismo("78HJ","Audi","P14",4);
        misVehiculos[2]=new VehiculoDeportivo("45GH","Toyota","KJ8",500);
        misVehiculos[3]=new VehiculoFurgoneta("KJI8","Toyota","J9",2000);
        
        for(Vehiculo vehiculos : misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
        }
    }
    
}
