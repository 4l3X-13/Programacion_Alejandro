package Tema2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elije la opción del menú: ");
            System.out.println("0. Superficie y perímetro de cuadrado");
            System.out.println("1. Superficie y perímetro de rectángulo");
            System.out.println("2. Superficie de triángulo");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Cuadrado");
                    System.out.print("Introduce el valor del lado: ");
                    double lado = sc.nextDouble();
                    double superficieCua = lado * lado;
                    double perimetroCua = 4 * lado;
                    System.out.println("La superficie es: " + superficieCua + " y el perímetro es: " + perimetroCua);
                    break;

                case 1:
                    System.out.println("Rectángulo");
                    System.out.print("Introduce la base: ");
                    double baseRec = sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double alturaRec = sc.nextDouble();
                    double superficieRec = baseRec * alturaRec;
                    double perimetroRec = 2 * (baseRec + alturaRec);
                    System.out.println("La superficie es: " + superficieRec + " y el perímetro es: " + perimetroRec);
                    break;

                case 2:
                    System.out.println("Triángulo");
                    System.out.print("Introduce la base: ");
                    double baseTri = sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double alturaTri = sc.nextDouble();
                    double superficieTri = (baseTri * alturaTri) / 2;
                    System.out.println("La superficie es: " + superficieTri);
                    break;

                default:
                    System.out.println("Error: No vale ese número, intentalo de nuevo crack :)");
                    break;
            }

        } while (opcion < 0 || opcion > 2);

        sc.close();
    }
}
