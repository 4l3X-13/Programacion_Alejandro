package Tema2;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número A: ");
        int a = sc.nextInt();
        System.out.println("Introduce un número B: ");
        int b = sc.nextInt();

        if (b > a) {
            if (a % 2 == 0) {
                a++;
                for (int i = a; i <= b; i = i + 2) {
                    System.out.println(i);
                }
            }
            for (int i = a; i <= b; i = i + 2) {
                System.out.println(i);
            }

        }
    }
}
