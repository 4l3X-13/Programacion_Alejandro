package Tema5.EjerciciosColecciones1;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        HashSet<String> productos = new HashSet<>();
        System.out.println("--------------------------------");
        System.out.println("    LISTA DE LA COMPRA");
        System.out.println("--------------------------------");
        menu();
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                anadirProducto(productos);
                break;

            case 2:
                verificarProducto();
                break;

            case 3:
                mostrarCarrito(productos);
                break;

            case 0:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción incorrecta");
        }

    }


    public static void menu() {
        System.out.println("0. Salir");
        System.out.println("1. Añadir producto");
        System.out.println("2. Verificar producto");
        System.out.println("3. Mostrar carrito");
        System.out.println("Introduce la opción que quieres:");

    }

    public static void anadirProducto(HashSet productos) {
        Scanner scan = new Scanner(System.in);
        productos.add("Manzana");
    }

    public static void verificarProducto() {

    }

    public static void mostrarCarrito(HashSet productos) {
        System.out.println(productos);
    }
}
