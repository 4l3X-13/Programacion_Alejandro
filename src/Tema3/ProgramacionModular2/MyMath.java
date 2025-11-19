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
        System.out.println("7. Sacar si un número NO es primo.");

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

            case 7:
                boolean esPrimo1 = esPrimo1();
                if (esPrimo1 == true) {
                    System.out.println("Es primo");
                }
                break;

            case 8:
                boolean noEsPrimo2 = noEsPrimo2();
                if (noEsPrimo2 == false) {
                    System.out.println("No es primo");
                }
                break;

            case 9:
                numDigit();
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

    public static boolean esPrimo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean noEsPrimo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void numDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();
        int cifra = 0;
        if (num == 0) {
            System.out.println("Tiene 1 cifra");
        }
        do {
            num = num / 10;
            cifra++;
        } while (num > 0);
        System.out.println("Tiene " + cifra + " cifras");
    }
}

