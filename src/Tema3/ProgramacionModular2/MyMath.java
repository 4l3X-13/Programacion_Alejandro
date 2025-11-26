package Tema3.ProgramacionModular2;

import java.util.Scanner;

public class MyMath {


        public static double squarePerimeter () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserta la longitud del lado: ");
            double lado = scanner.nextDouble();
            return lado * 4;
        }

        public static double squareArea () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserta la longitud del lado: ");
            double lado = scanner.nextDouble();
            return lado * lado;
        }

        public static double rectanglePerimeter () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserta la base: ");
            double base = scanner.nextDouble();
            System.out.print("Inserta la altura: ");
            double altura = scanner.nextDouble();
            return 2 * (base + altura);
        }

        public static double rectangleArea () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserta la base: ");
            double base = scanner.nextDouble();
            System.out.print("Inserta la altura: ");
            double altura = scanner.nextDouble();
            return base * altura;
        }

        public static double circlePerimeter () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserta el radio: ");
            double radio = scanner.nextDouble();
            return 2 * Math.PI * radio;
        }

        public static double circleArea () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserta el radio: ");
            double radio = scanner.nextDouble();
            return Math.PI * Math.pow(radio, 2);
        }

        public static boolean esPrimo1 () {
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

        public static boolean noEsPrimo2 () {
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

        public static void numDigit () {
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

        public static void numDigitPares () {
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

        public static void numDigitImpares () {
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

        public static int factorial () {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }

        public static int factorialRecursivo ( int num){
            Scanner scanner = new Scanner(System.in);
            if (num <= 1) {
                return 1;
            } else {
                return num * factorialRecursivo(num - 1);
            }

        }

        public static void discriminanteEq () {
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

        public static int sumaNumEntero () {
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