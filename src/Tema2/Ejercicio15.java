package Tema2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del mes: ");
        int numMes = sc.nextInt();
        System.out.println("Introduce el número del año: ");
        int anyo = sc.nextInt();

        boolean bisiesto = (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0));

        if (numMes == 1 || numMes == 3 || numMes == 5 || numMes == 7 || numMes == 8 || numMes == 10 || numMes == 12) {
            System.out.println("El mes tiene 31 días");
        } else if (numMes == 4 || numMes == 6 || numMes == 9 || numMes == 11) {
            System.out.println("El mes tiene 30 días");
        } else if (numMes == 2) {
            if (bisiesto) {
                System.out.println("El mes tiene 29 días (año bisiesto)");
            } else {
                System.out.println("El mes tiene 28 días");
            }
        } else {
            System.out.println("Número de mes no válido");
        }
    }
}
