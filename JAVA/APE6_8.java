package APE6;

import java.util.ArrayList;

public class APE6_8 {
    public static void main(String[] args) {


        int[] arreglo = {10, 20, 40, 50}; 
        int[] nuevoArreglo = new int[arreglo.length + 1]; 
 
        //Copiar los elementos en el nuevo arreglo
        for (int i = 0; i < 2; i++) {
            nuevoArreglo[i] = arreglo[i];
        }
        nuevoArreglo[2] = 30; 
        for (int i = 2; i < arreglo.length; i++) {
            nuevoArreglo[i + 1] = arreglo[i];
        }

        //Mostrar arreglos
        System.out.println("=== INSERCIÓN EN ARREGLO ===");
        System.out.print("Arreglo original: ");
        for(int i=0; i<arreglo.length; i++){
        System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        System.out.print("Después de insertar 30 en posición 2: ");
        for (int i=0; i<nuevoArreglo.length; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }
        System.out.println("\n(Requirió crear un nuevo arreglo y copiar todos los elementos)");

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(40);
        lista.add(50);
 
        System.out.println("\n=== INSERCIÓN EN ARRAYLIST ===");
        System.out.println("Lista original: " + lista);
 
        lista.add(2, 30); 
        System.out.println("Después de insertar 30 en posición 2: " + lista);
 
    }
}
