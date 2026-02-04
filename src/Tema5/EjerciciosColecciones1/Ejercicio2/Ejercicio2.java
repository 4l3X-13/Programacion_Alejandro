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
            System.out.println("    GYMTONIC");
            System.out.println("--------------------------------");
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    usuarios.put("2", new Usuario("carlos", 20));
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
        System.out.println("1. Añadir producto");
        System.out.println("2. Verificar producto");
        System.out.println("Introduce la opción que quieres:");

    }

}

