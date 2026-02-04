package Tema5.EjerciciosColecciones1.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        Map<String, Usuario> usuarios = new HashMap<>();
        int opcion;
        do {
            System.out.println("--------------------------------");
            System.out.println("         GYMTONIC");
            System.out.println("--------------------------------");
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce tu DNI:");
                    String dni = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Ahora tu nombre: ");
                    String nombre = scan.nextLine();
                    System.out.println("Y ahora por último introduce tu edad: ");
                    int edad = scan.nextInt();
                    usuarios.put(dni, new Usuario(nombre, edad));
                    System.out.println(dni + usuarios);
                    break;

                case 2:
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
        System.out.println("1. Añadir usuario");
        System.out.println("2. Verificar usuario");
        System.out.println("Introduce la opción que quieres:");

    }
}

