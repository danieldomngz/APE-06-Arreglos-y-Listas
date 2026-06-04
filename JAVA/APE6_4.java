package APE6;

import java.util.ArrayList;
import java.util.Scanner;

public class APE6_4 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
 
        // Menú CRUD que se repite hasta que el usuario elija salir
        do {
            System.out.println("\n======== MENU ========");
            System.out.println("1. Crear elemento");
            System.out.println("2. Leer elementos");
            System.out.println("3. Actualizar elemento");
            System.out.println("4. Eliminar elemento");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcion) {
                case 1:
                //Ingresar elementos a la lista
                System.out.print("Ingresa el elemento a agregar: ");
                String nuevo = sc.nextLine();
                lista.add(nuevo);
                System.out.println("Elemento agregado.");
                
                break;

                case 2:
                //Leer todos los elementos de la lista
                if (lista.isEmpty()) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println("Elementos en la lista:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + ". " + lista.get(i));
                    }
                }

                break;
 
                case 3:
                // Modificar un elemento por índice
                System.out.print("Ingrese el indice del elemento a modificar: ");
                int indice = sc.nextInt();
                sc.nextLine();
                if (indice >= 0 && indice < lista.size()) {
                    System.out.print("Nuevo valor: ");
                    nuevo = sc.nextLine();
                    lista.set(indice, nuevo); 
                    System.out.println("Elemento actualizado.");
                } else {
                    System.out.println("Indice no válido.");
                }

                break;
 
                case 4:
                // Eliminar un elemento por índice
                System.out.print("Ingrese el indice del elemento a eliminar: ");
                indice = sc.nextInt();
                sc.nextLine();
                if (indice >= 0 && indice < lista.size()) {
                    lista.remove(indice); 
                    System.out.println("Elemento eliminado.");
                } else {
                    System.out.println("Indice no valido.");
                }

                break;

                case 5:
                System.out.println("Saliendo del programa");
                
                break;

                default:
                System.out.println("Opcion Invalida! ");
                
                break;
            }
 
        } while (opcion != 5); 


        sc.close();

    }
}
