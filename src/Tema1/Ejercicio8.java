package Tema1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primero número: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor a " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor a " + numero1);
        }

    }
}
