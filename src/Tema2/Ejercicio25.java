package Tema2;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        int factorial = 1;
        int contador = 1;
        do {
            factorial = factorial * contador;
            contador = contador + 1;
        } while (contador <= num);
        System.out.println(factorial);
    }
}
