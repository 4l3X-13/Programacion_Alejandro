package Tema2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        int resultado = 0;
        do {
            num = num / 10;
            resultado++;

        } while (num > 0);

        System.out.println("El número tiene " + resultado + " cifras.");

    }
}