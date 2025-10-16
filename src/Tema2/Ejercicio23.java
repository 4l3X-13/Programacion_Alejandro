package Tema2;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número positivo: ");
            num = sc.nextInt();

        } while (num >= 0);
    }
}
