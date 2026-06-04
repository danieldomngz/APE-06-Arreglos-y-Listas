package APE6;

import java.util.ArrayList;
import java.util.Scanner;

public class APE6_5 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        String nombre;
        double nota;

        System.out.print("Ingrese el numero de estudiantes: ");
        n = sc.nextInt();
        sc.nextLine();
        
        //Ingresar datos
        for(int i=0; i<n; i++){
            System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
            nombre=sc.nextLine();
            nombres.add(nombre);
            System.out.print("Ingrese la nota del estudiante " + (i+1) + ": ");
            nota=sc.nextDouble();
            notas.add(nota);
            sc.nextLine();
        }

        //Mostrar datos de los estudiantes
        for(int i=0; i<n; i++){
            System.out.println(nombres.get(i)+ "\t\t Nota: " + notas.get(i));
        }

        sc.close();
    }
}
