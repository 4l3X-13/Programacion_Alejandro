package Tema5.EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = random.nextInt(100) + 1;
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10) + 1;
        }

        System.out.println("Vector de tamaño " + n + " creado con éxito.");
        System.out.println("Introduce una posición para consultar (o un negativo para salir):");

        while (true) {
            try {
                System.out.print("\n¿Qué posición quieres ver? [0 - " + (n - 1) + "]: ");
                int posicion = scanner.nextInt();

                if (posicion < 0) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                System.out.println("El valor en la posición " + posicion + " es: " + vector[posicion]);

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Esa posición no existe. El rango es de 0 a " + (n - 1));
            }
        }

        scanner.close();
    }
}

