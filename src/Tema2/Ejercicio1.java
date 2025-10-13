package Tema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado: ");
        int lado = sc.nextInt();

        int superficie = lado ^ 2;
        int perimetro = 4 * lado;

        System.out.println("Superficie: " + superficie);
        System.out.println("Perímetro: " + perimetro);


        sc.close();
    }
}
