package Tema2;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contador1 = 0;
        int contador2 = 0;
        do {
            System.out.println("Introduce un número positivo: ");
            num = sc.nextInt();
            if (num >= 0) {
                contador1 = contador1 + num;
                contador2++;
            }
        } while (num >= 0);

        double media = contador1 / contador2;
        System.out.println("La media de los números son: " + media);

    }
}
