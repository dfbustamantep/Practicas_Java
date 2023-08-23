/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metdosyclasesabstractas;

/**
 *
 * @author DBustamanteP
 */
public class MetdosyClasesAbstractas {

    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHerbivoro animalH = new AnimalHerbivoro();
        
        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
    
}
