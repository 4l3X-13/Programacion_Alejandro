package Tema5.EjerciciosColecciones1.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        Map<String, Usuario> usuarios = new HashMap<>();
        int opcion;
        do {
            System.out.println("--------------------------------");
            System.out.println("            BANCO ");
            System.out.println("--------------------------------");
            menu();
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce tu nombre: ");
                    String nombre = scan.nextLine();
                    System.out.println("Introduce tu edad: ");
                    int edad = scan.nextInt();
                    System.out.println("Introduce tu DNI: ");
                    String dni = scan.nextLine();
                    break;

                case 2:
                    System.out.println("Di la posición del usuario");
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
        System.out.println("1. Añadir un usuario a la cola");
        System.out.println("2. Quitar un usuario de la cola");
        System.out.println("Introduce la opción que quieres:");
    }
}