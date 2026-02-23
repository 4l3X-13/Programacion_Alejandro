package Tema5.EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("Error: El número " + p + " no es positivo.");
        }
        System.out.println("Valor positivo confirmado: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("Error: El número " + n + " no es negativo.");
        }
        System.out.println("Valor negativo confirmado: " + n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\n--- MENÚ DE PRUEBAS ---");
                System.out.println("1. Probar imprimePositivo");
                System.out.println("2. Probar imprimeNegativo");
                System.out.println("3. Salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();

                if (opcion == 1) {
                    System.out.print("Introduce un número: ");
                    int num = scanner.nextInt();
                    imprimePositivo(num);
                } else if (opcion == 2) {
                    System.out.print("Introduce un número: ");
                    int num = scanner.nextInt();
                    imprimeNegativo(num);
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                scanner.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (opcion != 3);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}

