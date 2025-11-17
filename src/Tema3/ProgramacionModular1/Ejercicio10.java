package Tema3.ProgramacionModular1;

import java.util.Scanner;

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
        char eleccion = sc.next().charAt(0);

        switch (eleccion) {
            case 'a':
                System.out.println("EJERCICIO 1");
                Ejercicio1.main(args);
            case 'b':
                System.out.println("EJERCICIO 2");
                Ejercicio2.main(args);
            case 'c':
                System.out.println("EJERCICIO 3");
                Ejercicio3.main(args);
            case 'd':
                System.out.println("EJERCICIO 4");
                Ejercicio4.main(args);
            case 'e':
                System.out.println("EJERCICIO 5");
                Ejercicio5.main(args);
            case 'f':
                System.out.println("EJERCICIO 6");
                Ejercicio6.main(args);
            case 'g':
                System.out.println("EJERCICIO 7");
                Ejercicio7.main(args);
            case 'h':
                System.out.println("EJERCICIO 8");
                Ejercicio8.main(args);
            case 'i':
                System.out.println("EJERCICIO 9");
                Ejercicio9.main(args);

        }
    }
}
