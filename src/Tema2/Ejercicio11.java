package Tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 números consecutivos: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num2 == num1 + 1 && num3 == num2 + 1 || num1 == num2 + 1 && num2 == num3 + 1) {
            System.out.println("Los números son consecutivos");
        } else {
            System.out.println("Los números no son consecutivos");
        }
    }
}
