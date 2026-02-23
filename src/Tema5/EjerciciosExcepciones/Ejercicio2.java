package Tema5.EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Introduce el primer número (entero): ");
            int num1 = scan.nextInt();

            System.out.print("Introduce el segundo número (entero): ");
            int num2 = scan.nextInt();

            int resultado = num1 / num2;

            System.out.println("El resultado de la división es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir obligatoriamente números enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir un número entre cero.");
        } finally {
            scan.close();
        }
    }
}

