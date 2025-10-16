package Tema2;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            int i = 2;
            while (i <= num / 2 && esPrimo) {
                if (num % i == 0) {
                    esPrimo = false;
                }
                i++;
            }
        }

        if (esPrimo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }
}
