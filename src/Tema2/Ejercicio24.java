package Tema2;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Introduce la nota: ");
            nota = sc.nextInt();
            if (nota > 10) {
                System.out.println("Número invalido");
            }
        } while (nota >= 0);
    }
}
