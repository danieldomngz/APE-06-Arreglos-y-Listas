package APE6;

import java.util.LinkedList;
import java.util.Scanner;

public class APE6_10 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int atendidos = 0; 
 
        System.out.println("=== SISTEMA DE FILA DE ATENCION ===");
 
        do {
            System.out.println("\nPersonas en fila: " + fila.size());
            System.out.println("1. Llega una persona nueva");
            System.out.println("2. Atender siguiente persona");
            System.out.println("3. Ver quien está en la fila");
            System.out.println("4. Ver estadisticas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
 
            switch (opcion) {
                case 1:
                // Agregar una persona al final de la fila
                System.out.print("Nombre de la persona: ");
                String persona = sc.nextLine();
                fila.add(persona);
                System.out.println(persona + " se unio a la fila. " +
                                   "Su posicion: #" + fila.size());
                break;
 
                case 2:
                // Atender al primero de la fila
                if (fila.isEmpty()) {
                    System.out.println("No hay nadie en la fila.");
                } else {
                    String siguiente = fila.peek();
                    System.out.println("Atendiendo a: " + siguiente + "...");
                    fila.poll();
                    atendidos++;
                    System.out.println("Atencion completada. Personas que faltan: " + fila.size());
                }
                break;
 
                case 3:
                // Mostrar la fila completa
                if (fila.isEmpty()) {
                    System.out.println("La fila esta vacia.");
                } else {
                    System.out.println("Fila actual (de primero a ultimo):");
                    int pos = 1;
                    for (int i=0; i<fila.size(); i++) {
                        System.out.println("  #" + pos + " -> " + fila.get(i));
                        pos++;
                    }
                }
                break;
 
                case 4:
                // Mostrar estadísticas del sistema
                System.out.println("--- Estadisticas ---");
                System.out.println("Personas atendidas: " + atendidos);
                System.out.println("Personas en espera: " + fila.size());
                if (!fila.isEmpty()) {
                    System.out.println("Proxima persona: " + fila.peek());
                }
                break;

                case 5:
                System.out.println("Saliendo del programa");
                break;

                default:
                System.out.println("Opcion Invalida!");
                break;
            }
 
        } while (opcion != 5);
 
        System.out.println("\nSistema cerrado. Total atendidos hoy: " + atendidos);
        sc.close();
    }
}
