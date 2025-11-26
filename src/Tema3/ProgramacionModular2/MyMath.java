package Tema3.ProgramacionModular2;

import java.util.Scanner;

public class MyMath {

    //TODO: cambiar y pasar por parámetro los datos necesarios de cada función
    public static double squarePerimeter(int lado1) {
        return lado1 * 4;
    }

    public static double squareArea(double lado2) {
        return lado2 * lado2;
    }

    public static double rectanglePerimeter(double base1, double altura1) {
        return 2 * (base1 + altura1);
    }

    public static double rectangleArea(double base2, double altura2) {
        return base2 * altura2;
    }

    public static double circlePerimeter(double radio1) {
        return 2 * Math.PI * radio1;
    }

    public static double circleArea(double radio2) {

        return Math.PI * Math.pow(radio2, 2);
    }

    public static boolean esPrimo1(int numero) {

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

    public static boolean noEsPrimo2(int numero) {
        return !esPrimo1(numero);
    }

    public static void numDigit(int num, int cifra) {
        if (num == 0) {
            System.out.println("Tiene 1 cifra");
        }
        do {
            num = num / 10;
            cifra++;
        } while (num > 0);
        System.out.println("Tiene " + cifra + " cifras");
    }

    public static void numDigitPares(int num2, int par2) {
        if (num2 == 0) {
            System.out.println("Tiene 1 cifra par");
        }
        do {
            if (num2 % 2 == 0) {
                par2++;
                num2 = num2 / 10;

            } else if (num2 % 2 != 0) {
                num2 = num2 / 10;
            }
        } while (num2 != 0);
        System.out.println("Tiene " + par2 + " cifras pares");
    }

    public static void numDigitImpares(int num3, int impar3) {

        if (num3 == 0) {
            System.out.println("Tiene 1 cifra par");
        }
        do {
            if (num3 % 2 == 0) {
                num3 = num3 / 10;

            } else if (num3 % 2 != 0) {
                impar3++;
                num3 = num3 / 10;
            }
        } while (num3 != 0);
        System.out.println("Tiene " + impar3 + " cifras impares");
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

    public static void discriminanteEq(int a, int b, int c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer coeficiente:");
        int coef1 = scanner.nextInt();
        System.out.println("Ahora el segundo coeficiente:");
        int coef2 = scanner.nextInt();
        System.out.println("Ahora el tercer coeficiente:");
        int coef3 = scanner.nextInt();
        int discriminante = (coef2 * coef2) - (4 * coef1 * coef3);
        if (discriminante > 0) {
            return 2;
        } else if (discriminante == 0) {
            System.out.println("1");
        } else if (discriminante < 0) {
            System.out.println("No hay solución real");
        }
    }

    public static int sumaNumEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = scanner.nextInt();
        int suma = 0;
        while (num > 0) {
            suma = suma + num % 10;
            num = num / 10;
        }
        return suma;
    }


}