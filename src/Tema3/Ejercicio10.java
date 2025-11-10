package Tema3;

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
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 'a':
                Ejercicio1.main(args);

            case 'b':
                Ejercicio2.main(args);

            case 'c':
                Ejercicio3.main(args);
            case 'd':
                Ejercicio4.main(args);
            case 'e':
                Ejercicio5.main(args);
            case 'f':
                Ejercicio6.main(args);
            case 'g':
                Ejercicio7.main(args);

            case 'h':
                Ejercicio8.main(args);
            case 'i':
                Ejercicio9.main(args);

        }
    }
}
