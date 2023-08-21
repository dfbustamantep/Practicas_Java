

/**
 *
 * @author DBustamanteP
 */
public class main {
    public static void main(String[] args) {
        Persona arr[];//solo creamos la referncia
        arr=new Persona[5];//creamos el arreglo que almacena objetos de tipo persona y reservamos el espacio en memoria 
        Persona arr2[]=new Persona[5];
        
        arr2=arr;//se copia las direcciones haciendo que ambos arreglos apunten al mismo espacio de memoria
        
        arr[0]=new Persona("Juan",18);
        arr[1]=new Persona("Alba",82);
        arr[2]=new Persona("Jose",20);
        arr[3]=new Persona("Maria",92);
        arr[4]=new Persona("Pedro",48);
        
        for(int i=0;i<arr2.length;i++){
            System.out.println("Persona "+(i+1)+"\n"+arr2[i]);
        }
        
        if(arr2==arr){
            System.out.println("La referncia es la misma");
        }
    }
}
