package Tema5.EjerciciosColecciones1.Ejercicio4;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        HashSet<String> productos = new HashSet<>();
        HashSet<String> carro = new HashSet<>();

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

                case 3:
                    anadirProductoCarro(productos, carro);
                    break;

                case 4:
                    mostrarCarro(carro);
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
        System.out.println("1. Añadir producto a la lista");
        System.out.println("2. Verificar producto de la lista");
        System.out.println("3. Meter producto al carro");
        System.out.println("4. Mostrar carro");

        System.out.println("Introduce la opción que quieres:");

    }

    public static void anadirProducto(HashSet productos) {
        Scanner scan = new Scanner(System.in);
        int seguir = 0;
        do {
            System.out.println("Añade el producto a continuación: ");
            String producto1 = scan.next();
            if (productos.contains(producto1)) {
                System.out.println("Este producto ya está en la lista");
            } else {
                System.out.println("El producto fué introducido en la lista exitosamente");
                productos.add(producto1);
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

    public static void anadirProductoCarro(HashSet productos, HashSet<String> carro) {
        Scanner scan = new Scanner(System.in);
        int seguir;
        do {
            System.out.println("Introduce el producto que quieras añadir al carrito: ");
            if (productos.contains(scan.next())) {
                System.out.println("El producto esta en la lista de la compra");
                String product = scan.nextLine();
                carro.add(product);
            } else {
                System.out.println("El producto no esta en la lista de la compra");
            }
            System.out.println("Desea seguir añadiendo productos?");
            System.out.println("0. NO");
            System.out.println("1. SI");
            seguir = scan.nextInt();
        } while (seguir == 1);
    }

    public static void mostrarCarro(HashSet<String> carro){
        System.out.println(carro);
    }
}
