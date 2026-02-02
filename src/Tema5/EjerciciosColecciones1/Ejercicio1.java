package Tema5.EjerciciosColecciones1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        Set<String> productos = new HashSet<>();
        System.out.println("--------------------------------");
        System.out.println("    LISTA DE LA COMPRA");
        System.out.println("--------------------------------");
        int opcion = 0;
        menu(opcion);
        switch (opcion) {
            case 1:
                anadirProducto();
                break;

            case 2:
                verificarProducto();
                break;

            case 0:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción incorrecta");
        }

    }


    public static void menu(int opcion) {
        Scanner scan = new Scanner(System.in);
        System.out.println("0. Salir");
        System.out.println("1. Añadir producto");
        System.out.println("2. Verificar producto");
        System.out.println("Introduce la opción que quieres:");
        opcion = scan.nextInt();

    }

    public static void anadirProducto() {
        //productos.add("Manzana");
    }

    public static void verificarProducto() {

    }
}
