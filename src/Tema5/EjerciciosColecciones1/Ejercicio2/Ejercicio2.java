package Tema5.EjerciciosColecciones1.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() { // Nota: Normalmente debería ser public static void main(String[] args)
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
            scan.nextLine(); // <--- CORRECCIÓN IMPORTANTE: Limpiamos el buffer aquí

            switch (opcion) {
                case 1:
                    System.out.println("Introduce tu DNI:");
                    // Aquí ya no hace falta limpiar porque lo hicimos arriba
                    dni = scan.nextLine();

                    System.out.println("Ahora tu nombre: ");
                    String nombre = scan.nextLine();

                    System.out.println("Y ahora por último introduce tu edad: ");
                    int edad = scan.nextInt();
                    // scan.nextLine(); // Opcional: limpiar buffer tras leer edad si después pidieras otro String

                    usuarios.put(dni, new Usuario(nombre, edad));
                    System.out.println("Usuario guardado: " + usuarios.get(dni)); // Confirmamos que se guardó
                    break;

                case 2:
                    System.out.println("Introduce el DNI de la persona que quieres quitar: ");
                    String dni2 = scan.nextLine();
                    if (usuarios.containsKey(dni2)) {
                        usuarios.remove(dni2);
                        System.out.println("Usuario eliminado.");
                    } else {
                        System.out.println("El usuario no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Introduce el DNI para buscar el usuario: ");
                    // Recomiendo usar nextLine() para ser consistente, next() puede dar problemas con espacios
                    dni = scan.nextLine();

                    if (usuarios.containsKey(dni)) {
                        // Código simplificado para ser más legible
                        Usuario u = usuarios.get(dni);
                        System.out.println("Datos del usuario " + dni + ": " + u);
                    } else {
                        System.out.println("Usuario no existe.");
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