package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del triángulo: ");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();

        int superficie = (base * altura)/2;
        System.out.println("La superficie es: " + superficie);
    }
}
