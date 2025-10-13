package Tema1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de tu dado:");
        int numDad = sc.nextInt();
        if (numDad > 6 || numDad < 1) {
            System.out.println("Número incorrecto");
        } else {
            int resultado = 7 - numDad;
            System.out.println(resultado);
        }


    }
}
