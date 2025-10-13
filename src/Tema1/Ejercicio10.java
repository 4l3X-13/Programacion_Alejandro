package Tema1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primero número: ");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println();

        System.out.println("Suma= ");
        System.out.println(numero1 + numero2);

        System.out.println("Resta= ");
        System.out.println(numero1 - numero2);

        System.out.println("Producto= ");
        System.out.println(numero1 * numero2);

        System.out.println("División= ");
        System.out.println(numero1 / numero2);
    }
}

