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
        System.out.println("7. Sacar si un número es primo.");
        System.out.println("8. Sacar si un número NO es primo.");
        System.out.println("9. Sacar cuantos dígitos tiene un número.");
        System.out.println("10. Sacar cuantos digitos pares que tiene un número: ");
        System.out.println("11. Sacar cuantos digitos impares que tiene un número: ");
        System.out.println("12. Sacar la factorial de un número:");
        System.out.println("13. Sacar el factorial recursivo de un número:");


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

    public static void numDigitPares() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();
        int par = 0;
        if (num == 0) {
            System.out.println("Tiene 1 cifra par");
        }
        do {
            if (num % 2 == 0) {
                par++;
                num = num / 10;

            } else if (num % 2 != 0) {
                num = num / 10;
            }
        } while (num != 0);
        System.out.println("Tiene " + par + " cifras pares");
    }

    public static void numDigitImpares() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();
        int impar = 0;
        if (num == 0) {
            System.out.println("Tiene 1 cifra par");
        }
        do {
            if (num % 2 == 0) {
                num = num / 10;

            } else if (num % 2 != 0) {
                impar++;
                num = num / 10;
            }
        } while (num != 0);
        System.out.println("Tiene " + impar + " cifras impares");
    }

    public static int factorial() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int factorialRecursivo(int num) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 1) {
            return 1;
        } else {
            return num * factorialRecursivo(num - 1);
        }

    }

    public static void ecuacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer coeficiente:");
        int coef1 = scanner.nextInt();
        System.out.println("Ahora el segundo coeficiente:");
        int coef2 = scanner.nextInt();
        System.out.println("Ahora el tercer coeficiente:");
        int coef3 = scanner.nextInt();
        int discriminante = (coef2 * coef2) - (4 * coef1 * coef3);
        if (discriminante > 0) {
            System.out.println("Tiene 2 soluciones reales distintas");
        } else if (discriminante == 0) {
            System.out.println("Tiene 1 soluciones reales diferente");
        } else if (discriminante < 0) {
            System.out.println("No hay solución real");

        }
    }
}

