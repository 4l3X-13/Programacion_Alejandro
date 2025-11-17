package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Introduce un número entero del 1 al 10:");
            numero = sc.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido. Debe estar entre 1 y 10.\n");
            }
        } while (numero < 1 || numero > 10);

        tablaMult(numero);
        sc.close();
    }

    public static void tablaMult(int numero) {
        System.out.println("\nTABLA DEL " + numero + "\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + numero + " = " + (i * numero));
        }
    }
}
