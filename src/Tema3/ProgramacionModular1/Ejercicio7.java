package Tema3.ProgramacionModular1;

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
                } else if (esPrimo(num) == false) {
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
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
