package APE6;

import java.util.ArrayList;

class APE6_1 {
public static void main(String[] args) {
    ArrayList<String> estudiantes = new ArrayList<>();

    //Ingresar elementos al ArrayList
    estudiantes.add("Ana Garcia");
    estudiantes.add("Carlos Lopez");
    estudiantes.add("Maria Perez");
    estudiantes.add("Juan Torres");
    estudiantes.add("Lucia Ramirez");

    //Mostrar elementos
    System.out.println("Lista de estudiantes:");
    for(int i=0; i<estudiantes.size(); i++){
    System.out.println(estudiantes.get(i));    
}
}
}