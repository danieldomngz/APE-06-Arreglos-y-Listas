package APE6;

import java.util.ArrayList;

public class APE6_2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        //Agregar elementos al ArrayList
        notas.add(9.8);
        notas.add(8.75);
        notas.add(7.5);
        notas.add(10.0);
        notas.add(5.3);
        notas.add(9.2);

        //Mostrar elementos
        for(int i=0; i<notas.size(); i++){
            System.out.println("Nota " + (i+1) + ": " + notas.get(i));
        }
    }
}
