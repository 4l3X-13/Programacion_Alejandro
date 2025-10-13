package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 números de menor a mayor: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Estan ordenados de menor a mayor");
        } else {
            System.out.println("No estan ordenados de menor a mayor");
        }
    }
}
