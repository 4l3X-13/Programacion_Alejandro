package Tema3.ProgramacionModular2;

import java.util.Scanner;

import static Tema3.ProgramacionModular2.MyMath.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce qué quieres hacer:");
        System.out.println("1. Sacar el perímetro del cuadrado.");
        System.out.println("2. Sacar el área del cuadrado.");
        System.out.println("3. Sacar el perímetro del rectángulo.");
        System.out.println("4. Sacar el área del rectángulo.");
        System.out.println("5. Sacar el perímetro del círculo.");
        System.out.println("6. Sacar el área del círculo.");
        System.out.println("7. Sacar si un número es primo.");
        System.out.println("8. Sacar si un número NO es primo.");
        System.out.println("9. Sacar cuantos dígitos tiene un número.");
        System.out.println("10. Sacar cuantos digitos pares que tiene un número: ");
        System.out.println("11. Sacar cuantos digitos impares que tiene un número: ");
        System.out.println("12. Sacar la factorial de un número:");
        System.out.println("13. Sacar el factorial recursivo de un número:");
        System.out.println("14. Ecuación de segundo grado: ");
        System.out.println("15. Suma digitos entero: ");

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

            case 10:
                numDigitPares();
                break;

            case 11:
                numDigitImpares();
                break;

            case 12:
                factorial();
                break;

            case 13:
                System.out.println("Introduce un numero:");
                int num = scanner.nextInt();
                int resultado = factorialRecursivo(num);
                System.out.println("El factorial es: " + resultado);
                break;

            case 14:
                discriminanteEq();
                break;

            case 15:
                sumaNumEntero();
                break;

            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }
}

