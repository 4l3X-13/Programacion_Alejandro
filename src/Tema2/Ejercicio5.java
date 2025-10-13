package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        double mediaDec = (num1 + num2 + num3) / 3;
        int mediaNoDec = (num1 + num2 + num3) / 3;

        System.out.println(mediaDec);
        System.out.println(mediaNoDec);
    }
}
