package Tema3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio válido");
        double radius = sc.nextDouble();
        System.out.println("El radio es válido?");
        System.out.println(validRadius(radius));
        if (validRadius(radius) == true) {
            System.out.println("El perímetro del círculo es: " + calculateCirclePerimeter(radius));
            System.out.println("La superfície del círculo es: " + calculateCircleArea(radius));
        } else {
            System.out.println("El radio es inválido");
        }

    }

    public static boolean validRadius(double radius) {
        if (radius < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
