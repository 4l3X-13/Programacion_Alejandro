package Tema3.ProgramacionModular2;

import java.util.Scanner;
import static Tema3.ProgramacionModular2.MyMath.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce qué quieres hacer:");
        System.out.println("1. Perímetro cuadrado");
        System.out.println("2. Área cuadrado");
        System.out.println("3. Perímetro rectángulo");
        System.out.println("4. Área rectángulo");
        System.out.println("5. Perímetro círculo");
        System.out.println("6. Área círculo");
        System.out.println("7. Saber si un número es primo");
        System.out.println("8. Saber si un número NO es primo");
        System.out.println("9. Contar dígitos");
        System.out.println("10. Contar dígitos pares");
        System.out.println("11. Contar dígitos impares");
        System.out.println("12. Factorial iterativo");
        System.out.println("13. Factorial recursivo");
        System.out.println("14. Ecuación de segundo grado");
        System.out.println("15. Sumar dígitos de un entero");

        int eleccion = scanner.nextInt();

        switch (eleccion) {

            case 1:
                System.out.println("Introduce el lado:");
                double lado1 = scanner.nextDouble();
                System.out.println("Perímetro del cuadrado: " + squarePerimeter(lado1));
                break;

            case 2:
                System.out.println("Introduce el lado:");
                double lado2 = scanner.nextDouble();
                System.out.println("Área del cuadrado: " + squareArea(lado2));
                break;

            case 3:
                System.out.println("Inserta base:");
                double base1 = scanner.nextDouble();
                System.out.println("Inserta altura:");
                double altura1 = scanner.nextDouble();
                System.out.println("Perímetro rectángulo: " + rectanglePerimeter(base1, altura1));
                break;

            case 4:
                System.out.println("Inserta base:");
                double base2 = scanner.nextDouble();
                System.out.println("Inserta altura:");
                double altura2 = scanner.nextDouble();
                System.out.println("Área rectángulo: " + rectangleArea(base2, altura2));
                break;

            case 5:
                System.out.println("Inserta radio:");
                double radio1 = scanner.nextDouble();
                System.out.println("Perímetro círculo: " + circlePerimeter(radio1));
                break;

            case 6:
                System.out.println("Inserta radio:");
                double radio2 = scanner.nextDouble();
                System.out.println("Área círculo: " + circleArea(radio2));
                break;

            case 7:
                System.out.println("Introduce un número:");
                int numero = scanner.nextInt();
                if (esPrimo1(numero)) System.out.println("Es primo");
                else System.out.println("No es primo");
                break;

            case 8:
                System.out.println("Introduce un número:");
                int numero2 = scanner.nextInt();
                if (noEsPrimo2(numero2)) System.out.println("No es primo");
                else System.out.println("Es primo");
                break;

            case 9:
                System.out.println("Introduce número:");
                numDigit(scanner.nextInt(), 0);
                break;

            case 10:
                System.out.println("Introduce número:");
                numDigitPares(scanner.nextInt(), 0);
                break;

            case 11:
                System.out.println("Introduce número:");
                numDigitImpares(scanner.nextInt(), 0);
                break;

            case 12:
                System.out.println("Introduce número:");
                int num4 = scanner.nextInt();
                System.out.println("Factorial: " + factorial(num4, 1));
                break;

            case 13:
                System.out.println("Introduce número:");
                int num5 = scanner.nextInt();
                System.out.println("Factorial recursivo: " + factorialRecursivo(num5));
                break;

            case 14:
                System.out.println("Coef a:");
                int a = scanner.nextInt();
                System.out.println("Coef b:");
                int b = scanner.nextInt();
                System.out.println("Coef c:");
                int c = scanner.nextInt();

                int disc = discriminanteEq((b * b) - (4 * a * c));

                System.out.println("Número de soluciones: " + disc);
                break;

            case 15:
                System.out.println("Introduce número:");
                int num6 = scanner.nextInt();
                System.out.println("Suma de dígitos: " + sumaNumEntero(num6, 0));
                break;

            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }
}
