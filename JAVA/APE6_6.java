package APE6;

import java.util.ArrayList;
import java.util.Scanner;

public class APE6_6 {
public static void main(String[] args) {
    
        ArrayList<String> nombres     = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        ArrayList<Double>  precios    = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
 
        do {
            System.out.println("\n======= SISTEMA DE INVENTARIO =======");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver inventario");
            System.out.println("3. Buscar producto");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
 
            switch (opcion) {
                case 1:
                // Agregar un nuevo producto al inventario
                System.out.print("Nombre del producto: ");
                nombres.add(sc.nextLine());
 
                System.out.print("Cantidad: ");
                cantidades.add(sc.nextInt());
 
                System.out.print("Precio: ");
                precios.add(sc.nextDouble());
                sc.nextLine();
                System.out.println("Producto agregado al inventario.");
                break;

                case 2:
                // Mostrar todo el inventario
                if (nombres.isEmpty()) {
                    System.out.println("El inventario esta vacio.");
                } else {
                    System.out.println("\n--- Inventario ---");
                    System.out.printf("%-20s %-10s %-10s%n", "Producto", "Cantidad", "Precio");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.printf("%-20s %-10d $%-10.2f%n",
                            nombres.get(i), cantidades.get(i), precios.get(i));
                    }
                }
                break;

                case 3:
                // Buscar un producto por nombre
                System.out.print("Que producto desea buscar: ");
                String buscar = sc.nextLine();
                int pos = nombres.indexOf(buscar);
                if (pos != -1) {
                    System.out.println("Encontrado: " + nombres.get(pos)
                        + " | Cantidad: " + cantidades.get(pos)
                        + " | Precio: $" + precios.get(pos));
                } else {
                    System.out.println("Producto no encontrado.");
                }
                break;

                case 4:
                System.out.println("Cerrando el sistema");
                break;

                default:
                System.out.println("Opcion Invalida!");
                break;
            }

        } while (opcion != 4);
 
        System.out.println("Sistema cerrado.");
        sc.close();
}    
}
