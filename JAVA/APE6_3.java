package APE6;

import java.util.ArrayList;
import java.util.Scanner;

public class APE6_3 {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String producto, buscar;

        //Registrar productos al ArrayList
        System.out.println("==================Registro de Productos==================");
        for(int i=0; i<5; i++){
            System.out.println("Ingrese el producto " + (i+1) + ": ");
            producto=sc.nextLine();
            productos.add(producto);
        }

        //Busqueda del producto
        System.out.println("Ingrese el producto a buscar: ");
        buscar=sc.nextLine();

        if(productos.contains(buscar)){
            System.out.println("El producto si se encuentra disponible");
        }else{
            System.out.println("El producto no se encuentra disponible");
        }

    sc.close();
    }
}
