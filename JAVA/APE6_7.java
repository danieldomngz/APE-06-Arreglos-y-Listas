package APE6;

import java.util.ArrayList;

public class APE6_7 {
    public static void main(String[] args) {

        // El arreglo tiene tamaño fijo
        int[] arreglo = new int[5];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;

        System.out.println("=== ARREGLO NORMAL ===");
        System.out.println("Tamano fijo: " + arreglo.length);
        for (int i=0; i<5; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // El ArrayList puede crecer y reducirse dinámicamente
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        System.out.println("\n=== ARRAYLIST ===");
        System.out.println("Tamano actual: " + lista.size());
        for (int i=0; i<lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();

        lista.add(60);
        lista.add(70);
        System.out.println("Después de agregar 2 elementos más, tamano: " + lista.size());

        lista.remove(0); 
        System.out.println("Después de eliminar el primero, tamano: " + lista.size());

    }
}
