package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una fecha:");
        System.out.print("Día: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Año: ");
        int anio = sc.nextInt();

        if (esFechaValida(dia, mes, anio)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        sc.close();
    }

    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasEnMes = diasEnMes(mes, anio);
        if (dia < 1 || dia > diasEnMes) {
            return false;
        }

        return true;
    }

    public static int diasEnMes(int mes, int anio) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return esBisiesto(anio) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
