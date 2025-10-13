package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número 1 (" + num1 + ") es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número 2 (" + num2 + ") es el mayor");
        } else {
            System.out.println("El número 3 (" + num3 + ") es el mayor");
        }
        sc.close();
    }
}
