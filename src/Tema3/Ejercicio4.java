package Tema3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showMenu();
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Elegiste de EUROS a DÓLARES");
                System.out.println("Introduce cuántos EUROS quieres convertir:");
                double euros = sc.nextDouble();
                double resultado1 = euro2dollar(euros);
                System.out.println(euros + " EUROS son " + resultado1 + " DÓLARES");
                break;

            case 2:
                System.out.println("Elegiste de DÓLARES a EUROS");
                System.out.println("Introduce cuántos DÓLARES quieres convertir:");
                double dollars = sc.nextDouble();
                double resultado2 = dollar2euro(dollars);
                System.out.println(dollars + " DÓLARES son " + resultado2 + " EUROS");
                break;

            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }


    public static void showMenu() {
        System.out.println("Elige qué quieres:");
        System.out.println("1. Pasar de EUROS a DÓLARES");
        System.out.println("2. Pasar de DÓLARES a EUROS");
    }

    public static double euro2dollar(double euros) {
        return euros * 1.157;
    }

    public static double dollar2euro(double dollars) {
        return dollars * 0.86;
    }
}
