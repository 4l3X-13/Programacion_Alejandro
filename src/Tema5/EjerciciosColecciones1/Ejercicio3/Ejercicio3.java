package Tema5.EjerciciosColecciones1.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        int opcion;
        int posicion;
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
                    scan.nextLine();
                    System.out.println("Introduce tu DNI: ");
                    String dni = scan.nextLine();

                    usuarios.add(new Usuario(nombre, edad, dni));
                    break;
//quitar SOLO en la última pos
                case 2:
                    System.out.println("Di la posición del usuario");
                    posicion = scan.nextInt();
                    System.out.println(usuarios.get(posicion) + "se ha ido de la cola");
                    usuarios.remove(posicion);
                    break;

                case 3:
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println("Posicion" + i + usuarios.get(i));
                    }
                    break;


                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opcion != 0);
    }

    public static void menu() {
        System.out.println("0. Salir");
        System.out.println("1. Crear y añadir un usuario");
        System.out.println("2. Eliminar un usuario de la cola");
        System.out.println("3. Mostrar la cola");
        System.out.println("Introduce la opción que quieres:");
    }
}