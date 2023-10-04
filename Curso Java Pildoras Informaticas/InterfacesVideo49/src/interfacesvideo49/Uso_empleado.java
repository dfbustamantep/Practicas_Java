/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesvideo49;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author DBustamanteP
 */
public class Uso_empleado {

    public static void main(String[] args) {
        
        Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
        jefe_RRHH.estableceIncentivo(2570);
        //Array de empleados
        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
        misEmpleados[4] = jefe_RRHH; //Polimorfismo en accion Principio de sustitucion
        misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);

        //Cast de datos    
        Jefatura jefe_Finanzas = (Jefatura) misEmpleados[5];
        jefe_Finanzas.estableceIncentivo(55000);

        for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }
        
        //Uamos el metodo sort de la clase Arrays,pero para eso debemos implementar la interface Comparable en Empleado 
        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {
            System.out.println(" Nombre: " + e.dameNombre()
                    + " Sueldo: " + e.dameSueldo()
                    + " Fecha de alta: " + e.dameFechaContratp());
        }
    }
}

//Para usar el metodo sort tenemos que implementar la interfaz comparable y usar el metodo compareTo
class Empleado implements Comparable {

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    //getters
    public String dameNombre() {
        return nombre + " Id: " + Id;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public Date dameFechaContratp() {
        return altaContrato;
    }

    //setters
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    @Override
    public int compareTo(Object miObjeto) {

        Empleado otroEmpleado = (Empleado) miObjeto;

        if (this.Id < otroEmpleado.Id) {
            return -1;
        }

        if (this.Id > otroEmpleado.Id) {
            return 1;
        }

        return 0;
    }
}

class Jefatura extends Empleado {

    private double incentivo;

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    public void estableceIncentivo(double b) {
        incentivo = b;
    }

    public double dameSueldo() {
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }
}
