package Tema2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de personas: ");
        int personas = sc.nextInt();
        System.out.println("Introduce el número de días: ");
        int dias = sc.nextInt();
        //int noches = dias / 2;

        double tarifEst = (15 * dias) * personas;

        if (personas > 5 && dias >= 7) {
            double descuento = (tarifEst * 25) / 100;
            double precio = tarifEst - descuento;
            System.out.println("El precio es de: " + precio);
        } else {
            System.out.println("El precio es de: " + tarifEst);
        }

    }
}
