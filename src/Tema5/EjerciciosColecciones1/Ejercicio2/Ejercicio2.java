package Tema5.EjerciciosColecciones1.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        Map<String, Usuario> usuarios = new HashMap<>();
        int opcion;
        String dni;
        do {
            System.out.println("--------------------------------");
            System.out.println("         GYMTONIC");
            System.out.println("--------------------------------");
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce tu DNI:");
                    String dni1 = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Ahora tu nombre: ");
                    String nombre = scan.nextLine();
                    System.out.println("Y ahora por último introduce tu edad: ");
                    int edad = scan.nextInt();
                    usuarios.put(dni1, new Usuario(nombre, edad));
                    System.out.println(dni1 + usuarios);
                    break;

                case 2:
                    System.out.println("Introduce el DNI de la persona que quieres quitar: ");
                    String dni2 = scan.nextLine();
                    usuarios.remove(dni2);

                    break;

                case 3:
                    System.out.println("Introduce el DNI para buscar el usuario: ");
                    dni = scan.next();
                    scan.nextLine();
                    if (usuarios.containsKey(dni)) {
                        System.out.println("Nombre y edad de " + dni + " es: " + usuarios.get(dni).getNombre() + " " + usuarios.get(dni).getEdad());
                    } else {
                        System.out.println("Nombre no existe.");
                    }


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
        System.out.println("2. Quitar usuario");
        System.out.println("3. Buscar usuario");
        System.out.println("Introduce la opción que quieres:");

    }
}

