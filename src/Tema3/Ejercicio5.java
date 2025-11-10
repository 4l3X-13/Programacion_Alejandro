package Tema3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = sc.nextInt();
        tablaMult(numero);
    }

    public static void tablaMult(int numero) {
        System.out.println("Tabla del " + numero);
        System.out.println("1 * " + numero + " = " + (1 * numero));
        System.out.println("2 * " + numero + " = " + (2 * numero));
        System.out.println("3 * " + numero + " = " + (3 * numero));
        System.out.println("4 * " + numero + " = " + (4 * numero));
        System.out.println("5 * " + numero + " = " + (5 * numero));
        System.out.println("6 * " + numero + " = " + (6 * numero));
        System.out.println("7 * " + numero + " = " + (7 * numero));
        System.out.println("8 * " + numero + " = " + (8 * numero));
        System.out.println("9 * " + numero + " = " + (9 * numero));
        System.out.println("10 * " + numero + " = " + (10 * numero));

    }
}
