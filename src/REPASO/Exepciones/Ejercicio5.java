package REPASO.Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;

        while (valor != -999) {
            try {
                System.out.print("Introduce un número (-999 para salir): ");
                valor = sc.nextInt();

                if (valor != -999) {
                    imprimePositivo(valor);
                    imprimeNegativo(valor);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                sc.close();
            }
        }
    }

    static void imprimePositivo(int p) {
        if (p < 0) throw new IllegalArgumentException("El numero " + p + " es negativo.");
        System.out.println("Positivo: " + p);
    }

    static void imprimeNegativo(int n) {
        if (n >= 0) throw new IllegalArgumentException("El numero " + n + " no es negativo.");
        System.out.println("Negativo: " + n);
    }
}