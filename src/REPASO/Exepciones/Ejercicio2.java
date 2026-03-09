package REPASO.Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Inserta el numero 1: ");
            int num1 = sc.nextInt();
            System.out.print("Inserta el numero 2: ");
            int num2 = sc.nextInt();
            System.out.println("La solucion es: " + (num1 / num2));
        } catch (InputMismatchException e) {
            System.out.println("No has insertado un numero correcto");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            sc.close();
        }
    }
}