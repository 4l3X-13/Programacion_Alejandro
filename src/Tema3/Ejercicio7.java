package Tema3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número entero positivo hasta que introduzcas 0 para terminar el programa: ");
            num = scanner.nextInt();
            if (num > 0) {
                if (esPrimo(num)) {
                    System.out.println(num + " es primo");
                } else {
                    System.out.println(num + " no es primo");
                }
            } else if (num < 0) {
                System.out.println("Introduce solo números positivos.");
            }
        } while (num != 0);
        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        } else if (num / 1 == 0 && num / num == 0) {
            return true;
        } else {
            return false;
        }


    }
}
