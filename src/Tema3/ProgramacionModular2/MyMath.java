package Tema3.ProgramacionModular2;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce qué quieres hacer:");
        System.out.println("1. Sacar el perímetro del cuadrado.");
        System.out.println("2. Sacar el área del cuadrado.");
        System.out.println("3. Sacar el perímetro del rectángulo.");
        System.out.println("4. Sacar el área del rectángulo.");
        System.out.println("5. Sacar el perímetro del círculo.");
        System.out.println("6. Sacar el área del círculo.");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Perímetro del cuadrado: " + squarePerimeter());
                break;

            case 2:
                System.out.println("Área del cuadrado: " + squareArea());
                break;

            case 3:
                System.out.println("Perímetro del rectángulo: " + rectanglePerimeter());
                break;

            case 4:
                System.out.println("Área del rectángulo: " + rectangleArea());
                break;

            case 5:
                System.out.println("Perímetro del círculo: " + circlePerimeter());
                break;

            case 6:
                System.out.println("Área del círculo: " + circleArea());
                break;

            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }

    public static double squarePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta la longitud del lado: ");
        double lado = scanner.nextDouble();
        return lado * 4;
    }

    public static double squareArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta la longitud del lado: ");
        double lado = scanner.nextDouble();
        return lado * lado;
    }

    public static double rectanglePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta la base: ");
        double base = scanner.nextDouble();
        System.out.print("Inserta la altura: ");
        double altura = scanner.nextDouble();
        return 2 * (base + altura);
    }

    public static double rectangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta la base: ");
        double base = scanner.nextDouble();
        System.out.print("Inserta la altura: ");
        double altura = scanner.nextDouble();
        return base * altura;
    }

    public static double circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta el radio: ");
        double radio = scanner.nextDouble();
        return 2 * Math.PI * radio;
    }

    public static double circleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta el radio: ");
        double radio = scanner.nextDouble();
        return Math.PI * Math.pow(radio, 2);
    }
}

