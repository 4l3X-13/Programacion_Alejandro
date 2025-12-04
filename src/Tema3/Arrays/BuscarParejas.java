package Tema3.Arrays;

import java.util.Scanner;
import java.util.Random;

public class BuscarParejas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] cartas = {
                "león", "león", "mandril", "mandril", "suricata", "suricata",
                "pájaro", "pájaro", "jirafa", "jirafa", "cebra", "cebra",
                "rinoceronte", "rinoceronte", "hipopótamo", "hipopótamo",
                "elefante", "elefante", "mono", "mono"
        };

        mezclar(cartas);

        boolean[] descubiertas = new boolean[20];
        int parejasEncontradas = 0;

        System.out.println("Encuentra las 10 parejas (posiciones del 0 al 19)\n");

        while (parejasEncontradas < 10) {
            mostrarTablero(cartas, descubiertas);

            System.out.print("Primera posición: ");
            int p1 = scan.nextInt();
            System.out.print("Segunda posición: ");
            int p2 = scan.nextInt();

            System.out.println("\nCarta en " + p1 + ": " + cartas[p1]);
            System.out.println("Carta en " + p2 + ": " + cartas[p2]);

            if (cartas[p1] == cartas[p2]) {
                descubiertas[p1] = true;
                descubiertas[p2] = true;
                parejasEncontradas++;
                System.out.println("Correcto Llevas " + parejasEncontradas + "/10.\n");
            } else {
                // No es pareja
                System.out.println("No es pareja. Pulsa Enter para continuar...");
                scan.nextLine();
                scan.nextLine();
                for (int i = 0; i < 30; i++) System.out.println();
            }
        }

        System.out.println("Has encontrado todas las parejas.");
        scan.close();
    }

    public static void mezclar(String[] cartas) {
        Random r = new Random();
        for (int i = 0; i < cartas.length; i++) {
            int j = r.nextInt(cartas.length);
            String temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
    }

    public static void mostrarTablero(String[] cartas, boolean[] descubiertas) {
        System.out.println("Tablero:");
        for (int i = 0; i < cartas.length; i++) {
            if (descubiertas[i]) {
                System.out.print(cartas[i] + " ");
            } else {
                System.out.print("? ");
            }
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}