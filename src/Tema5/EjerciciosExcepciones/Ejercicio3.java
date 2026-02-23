package Tema5.EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[5];
        int i = 0;

        System.out.println("Introduce 5 números decimales para llenar el vector:");

        while (i < vector.length) {
            try {
                System.out.print("Valor para la posición [" + i + "]: ");
                vector[i] = scanner.nextDouble();
                i++;

            } catch (InputMismatchException e) {
                System.out.println("Error: El valor introducido no es un número válido. Inténtalo de nuevo.");
                scanner.next();
            }
        }

        System.out.println("Vector completado con éxito:");
        for (double valor : vector) {
            System.out.print("[" + valor + "] ");
        }

        scanner.close();
    }
}

