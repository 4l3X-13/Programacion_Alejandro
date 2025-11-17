package Tema3.ProgramacionModular1;

import java.util.Scanner;

import static Tema3.ProgramacionModular1.Ejercicio1.numberSign;
import static Tema3.ProgramacionModular1.Ejercicio2.isAdult;
import static Tema3.ProgramacionModular1.Ejercicio3.*;
import static Tema3.ProgramacionModular1.Ejercicio4.*;
import static Tema3.ProgramacionModular1.Ejercicio5.tablaMult;
import static Tema3.ProgramacionModular1.Ejercicio6.numMult;
import static Tema3.ProgramacionModular1.Ejercicio7.esPrimo;
import static Tema3.ProgramacionModular1.Ejercicio8.esFechaValida;
import static Tema3.ProgramacionModular1.Ejercicio9.imprimirTriangulo;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.");
        System.out.println("\n Elige un ejercicio: ");
        char eleccion1 = sc.next().charAt(0);

        switch (eleccion1) {
            case 'a':
                System.out.println("EJERCICIO 1");
                System.out.println("Introduce un número: ");
                int num1 = sc.nextInt();
                System.out.println(numberSign(num1));
                if (numberSign(num1) == 0) {
                    System.out.println("Es cero");
                } else if (numberSign(num1) == 1) {
                    System.out.println("Es positivo");
                }
                break;

            case 'b':
                System.out.println("EJERCICIO 2");
                System.out.println("Introduce un número (para el ejercicio 1): ");
                int num2 = sc.nextInt();
                int signo2 = numberSign(num2);

                if (signo2 == 1) {
                    System.out.println("El número es positivo.");
                } else if (signo2 == -1) {
                    System.out.println("El número es negativo.");
                } else {
                    System.out.println("El número es cero.");
                }

                int age1;
                do {
                    System.out.print("Introduce tu edad: ");
                    age1 = sc.nextInt();
                    if (age1 < 0) {
                        System.out.println("La edad es incorrecta. Intentalo de nuevo.");
                    }
                } while (age1 < 0);

                if (isAdult(age1)) {
                    System.out.println("Es mayor de edad");
                } else {
                    System.out.println("Es menor de edad");
                }
                break;

            case 'c':
                System.out.println("EJERCICIO 3");
                double radius1;

                do {
                    System.out.println("Introduce un radio válido:");
                    radius1 = sc.nextDouble();

                    if (!validRadius(radius1)) {
                        System.out.println("El radio es inválido, prueba otra vez.");
                    }
                } while (!validRadius(radius1));

                System.out.println("El perímetro del círculo es: " + calculateCirclePerimeter(radius1));
                System.out.println("La superficie del círculo es: " + calculateCircleArea(radius1));
                break;

            case 'd':
                System.out.println("EJERCICIO 4");
                showMenu();
                int eleccion2 = sc.nextInt();

                switch (eleccion2) {
                    case 1:
                        System.out.println("Elegiste de EUROS a DÓLARES");
                        System.out.println("Introduce cuántos EUROS quieres convertir:");
                        double euros1 = sc.nextDouble();
                        double resultado1 = euro2dollar(euros1);
                        System.out.println(euros1 + " EUROS son " + resultado1 + " DÓLARES");
                        break;

                    case 2:
                        System.out.println("Elegiste de DÓLARES a EUROS");
                        System.out.println("Introduce cuántos DÓLARES quieres convertir:");
                        double dollars1 = sc.nextDouble();
                        double resultado2 = dollar2euro(dollars1);
                        System.out.println(dollars1 + " DÓLARES son " + resultado2 + " EUROS");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }
                break;

            case 'e':
                System.out.println("EJERCICIO 5");
                int numero1;
                do {
                    System.out.println("Introduce un número entero del 1 al 10:");
                    numero1 = sc.nextInt();

                    if (numero1 < 1 || numero1 > 10) {
                        System.out.println("Número inválido. Debe estar entre 1 y 10.\n");
                    }
                } while (numero1 < 1 || numero1 > 10);

                tablaMult(numero1);
                break;

            case 'f':
                System.out.println("EJERCICIO 6");
                System.out.println("TABLAS DE MULTIPLICAR");
                numMult();
                break;

            case 'g':
                System.out.println("EJERCICIO 7");
                int num3;
                do {
                    System.out.println("Introduce un número entero positivo hasta que introduzcas 0 para terminar el programa: ");
                    num3 = sc.nextInt();
                    if (num3 > 0) {
                        if (esPrimo(num3)) {
                            System.out.println(num3 + " es primo");
                        } else {
                            System.out.println(num3 + " no es primo");
                        }

                    } else if (num3 < 0) {
                        System.out.println("Introduce solo números positivos.");
                    }
                } while (num3 != 0);
                break;

            case 'h':
                System.out.println("EJERCICIO 8");
                System.out.println("Introduce una fecha:");
                System.out.print("Día: ");
                int dia1 = sc.nextInt();

                System.out.print("Mes: ");
                int mes1 = sc.nextInt();

                System.out.print("Año: ");
                int anio1 = sc.nextInt();

                if (esFechaValida(dia1, mes1, anio1)) {
                    System.out.println("La fecha es correcta.");
                } else {
                    System.out.println("La fecha es incorrecta.");
                }
                break;

            case 'i':
                System.out.println("EJERCICIO 9");
                System.out.println("Introduce un caracter: ");
                char caracter1 = sc.next().charAt(0);
                System.out.println("Introduce un numero: ");
                int numero2 = sc.nextInt();
                System.out.println("\n");
                imprimirTriangulo(caracter1, numero2);
                break;
        }
    }
}
