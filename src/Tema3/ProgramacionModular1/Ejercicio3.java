package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;

        do {
            System.out.println("Introduce un radio válido:");
            radius = sc.nextDouble();

            if (!validRadius(radius)) {
                System.out.println("El radio es inválido, prueba otra vez.");
            }
        } while (!validRadius(radius));

        System.out.println("El perímetro del círculo es: " + calculateCirclePerimeter(radius));
        System.out.println("La superficie del círculo es: " + calculateCircleArea(radius));
    }

    public static boolean validRadius(double radius) {
        return radius >= 0;
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
