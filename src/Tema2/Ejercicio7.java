package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int resultado = num1 - num2;
            System.out.println(num1 + "-" + num2);
            System.out.println("El resultado es: " + resultado);
        } else if (num1 == num2) {
            System.out.println("Los números son iguales");
        } else {
            int resultado = num2 - num1;
            System.out.println(num2 + "-" + num1);
            System.out.println("El resultado es: " + resultado);
        }
    }
}
