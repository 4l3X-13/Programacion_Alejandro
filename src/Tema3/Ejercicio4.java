package Tema3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showMenu();
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                euro2dollar();
                break;
            case 2:
                dollar2euro();
                break;

            default:
                System.out.println("Opcion invalida");
        }
        sc.close();
    }


    public static void showMenu() {
        System.out.println("Elije que quieres:");
        System.out.println("1. Pasar de EUROS a DOLLARES");
        System.out.println("2. Pasar de DOLLARES a EUROS");
    }


    public static double euro2dollar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elegiste  de EUROS a DOLLARES");
        System.out.println("Introduce cuántos EUROS quieres convertir a DOLLARES");
        double euros1 = sc.nextDouble();
        double dollares1 = euros1 * 1.157;
        System.out.println(euros1 + " EUROS son " + dollares1 + " DOLLARES");
        return dollares1;
    }

    public static double dollar2euro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elegiste  de DOLLARES a EUROS");
        System.out.println("Introduce cuántos DOLLARES quieres convertir a EUROS");
        double dollares2 = sc.nextDouble();
        double euros2 = dollares2 * 0.86;
        System.out.println(dollares2 + " DOLLARES son " + euros2 + " EUROS");
        return euros2;
    }


}
