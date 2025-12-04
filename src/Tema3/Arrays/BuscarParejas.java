package Tema3.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] animales = {"león", "mandril", "suricata", "pájaro", "jirafa", "cebra", "rinoceronte", "hipopótamo", "elefante", "mono"};

        String[] cartas = new String[20];
        for (int i = 0; i < 10; i++) {
            cartas[i] = animales[i];
            cartas[i + 10] = animales[i];
        }

        for (int i = 0; i < cartas.length; i++) {
            int j = random.nextInt(cartas.length);
            String temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }

        boolean[] visibles = new boolean[20];

        int parejasEncontradas = 0;

        System.out.println("El tablero tiene 20 posiciones (0 a 19).");
        System.out.println("Encuentra las 10 parejas.\n");

        while (parejasEncontradas < 10) {
            mostrarTablero(cartas, visibles);

            System.out.print("Elige la primera posición (0-19): ");
            int pos1 = scanner.nextInt();
            if (pos1 < 0 || pos1 > 19 || visibles[pos1]) {
                System.out.println("Posición inválida o ya descubierta. Intenta de nuevo.\n");
                continue;
            }

            System.out.print("Elige la segunda posición (0-19): ");
            int pos2 = scanner.nextInt();
            if (pos2 < 0 || pos2 > 19 || visibles[pos2] || pos1 == pos2) {
                System.out.println("Posición inválida, repetida o ya descubierta. Intenta de nuevo.\n");
                continue;
            }

            System.out.println("\n¡Mirando las cartas!");
            System.out.println("Posición " + pos1 + ": " + cartas[pos1]);
            System.out.println("Posición " + pos2 + ": " + cartas[pos2]);
            System.out.println();

            if (cartas[pos1].equals(cartas[pos2])) {
                visibles[pos1] = true;
                visibles[pos2] = true;
                parejasEncontradas++;
                System.out.println("¡Correcto! Pareja encontrada. Llevas " + parejasEncontradas + "/10.\n");
            } else {
                System.out.println("¡No es pareja! Inténtalo de nuevo.");
                System.out.println("\n(Presiona Enter para continuar...)");
                scanner.nextLine();
                scanner.nextLine();
                for (int i = 0; i < 30; i++) System.out.println();
            }
        }

        System.out.println("¡Felicidades! Has encontrado todas las parejas. ");
        scanner.close();
    }

    public static void mostrarTablero(String[] cartas, boolean[] visibles) {
        System.out.println("Tablero actual:");
        for (int i = 0; i < cartas.length; i++) {
            if (visibles[i]) {
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