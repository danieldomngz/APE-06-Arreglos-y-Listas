package APE6;

import java.util.LinkedList;
import java.util.Scanner;

public class APE6_9 {
    public static void main(String[] args) {
        LinkedList<String> turnos = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
 
        do {
            System.out.println("\n=== GESTION DE TURNOS ===");
            System.out.println("1. Agregar turno al final");
            System.out.println("2. Agregar turno al inicio (urgente)");
            System.out.println("3. Atender siguiente turno");
            System.out.println("4. Ver todos los turnos");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
 
            switch (opcion) {
                case 1:
                // Agregar un turno normal al final de la cola
                System.out.print("Nombre del paciente/cliente: ");
                String nombre = sc.nextLine();
                turnos.addLast(nombre);
                System.out.println(nombre + " agregado al final de la cola.");
                break;

                case 2:
                // Agregar un turno urgente al inicio de la cola
                System.out.print("Nombre del caso urgente: ");
                nombre = sc.nextLine();
                turnos.addFirst(nombre);
                System.out.println(nombre + " agregado al INICIO (urgente).");
                break;

                case 3:
                // Atender al primero de la cola y lo eliminar
                if (turnos.isEmpty()) {
                    System.out.println("No hay turnos pendientes.");
                } else {
                    String atendido = turnos.removeFirst();
                    System.out.println("Atendiendo a: " + atendido);
                    System.out.println("Turnos restantes: " + turnos.size());
                }
                break;
 
                case 4:
                // Mostrar todos los turnos en orden
                if (turnos.isEmpty()) {
                    System.out.println("No hay turnos en la lista.");
                } else {
                    System.out.println("Turnos actuales:");
                    int numero = 1;
                    for (String turno : turnos) {
                        System.out.println(numero + ". " + turno);
                        numero++;
                    }
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
 
        System.out.println("Sistema cerrado.");
        sc.close();
    }
}