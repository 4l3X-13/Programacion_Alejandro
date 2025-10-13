package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del rectángulo: ");
        int altura = sc.nextInt();

        int superficie = base * altura;
        System.out.println("La superficie es: " + superficie);
        int perimetro = 2 * (base * altura);
        System.out.println("La perimetro es: " + perimetro);

    }
}
