package Tema1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el año: ");
        int anyo = sc.nextInt();

        if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
            System.out.println("SI es bisiesto.");
        } else {
            System.out.println("NO es bisiesto.");
        }
        sc.close();
    }
}
