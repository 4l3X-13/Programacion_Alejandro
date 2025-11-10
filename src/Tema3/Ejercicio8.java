package Tema3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una fecha:");
        System.out.print("Mes: ");
        int mes = esMes(sc);

        System.out.print("Día: ");
        int dia = esDia(sc, mes);

        System.out.println("Fecha introducida: " + dia + "/" + mes);
        sc.close();
    }

    public static int esMes(Scanner sc) {
        int mes;
        do {
            mes = sc.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.print("Mes incorrecto, inténtalo de nuevo: ");
            }
        } while (mes < 1 || mes > 12);
        System.out.println("Mes correcto");
        return mes;
    }

    public static int esDia(Scanner sc, int mes) {
        int dia;
        int maxDias;

        switch (mes) {
            case 2 -> maxDias = 28;
            case 4, 6, 9, 11 -> maxDias = 30;
            default -> maxDias = 31;
        }

        do {
            dia = sc.nextInt();
            if (dia < 1 || dia > maxDias) {
                System.out.print("Día incorrecto, introduce un número entre 1 y " + maxDias + ": ");
            }
        } while (dia < 1 || dia > maxDias);

        System.out.println("Día correcto");
        return dia;
    }
}
