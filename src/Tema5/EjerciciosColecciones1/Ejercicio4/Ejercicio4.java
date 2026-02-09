package Tema5.EjerciciosColecciones1.Ejercicio4;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        HashSet<String> productos = new HashSet<>();
        int opcion;
        do {
            System.out.println("--------------------------------");
            System.out.println("    LISTA DE LA COMPRA");
            System.out.println("--------------------------------");
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    anadirProducto(productos);
                    break;

                case 2:
                    verificarProducto(productos);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 0);
    }


    public static void menu() {
        System.out.println("0. Salir");
        System.out.println("1. Añadir producto");
        System.out.println("2. Verificar producto");
        System.out.println("Introduce la opción que quieres:");

    }

    public static void anadirProducto(HashSet productos) {
        Scanner scan = new Scanner(System.in);
        int seguir = 0;
        do {
            System.out.println("Añade el producto a continuación: ");
            String producto = scan.next();
            if (productos.contains(producto)){
                System.out.println("Este producto ya está en la lista");
            }else{
                System.out.println("El producto fué introducido en la lista exitosamente");
                productos.add(producto);
            }
            System.out.println("Desea seguir añadiendo productos?");
            System.out.println("0. NO");
            System.out.println("1. SI");
            seguir = scan.nextInt();

        } while (seguir == 1);
        System.out.println(productos);

    }

    public static void verificarProducto(HashSet productos) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el producto que quieras verificar: ");
        if (productos.contains(scan.next())) {
            System.out.println("Este producto ya está en la lista");
        } else {
            System.out.println("Este producto aún no esta en la lista");
        }
    }
}
