package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] tablero = new int[15];

        int posMosca = rand.nextInt(15);
        tablero[posMosca] = 1;

        System.out.println("La mosca está en la posición: " + (posMosca + 1));

        System.out.println("¡Bienvenido a Atrapa a la Mosca!");
        System.out.println("Selecciona una posición del 1 al 15 para atrapar a la mosca.");

        boolean atrapada = false;

        while (!atrapada) {
            System.out.print("Tu elección: ");
            int eleccion = sc.nextInt() - 1;

            if (eleccion < 0 || eleccion >= 15) {
                System.out.println("Número inválido. Debe estar entre 1 y 15.");
                continue;
            }

            if (eleccion == posMosca) {
                System.out.println("¡Enhorabuena! Has atrapado a la mosca en la posición " + (eleccion + 1));
                atrapada = true;
            } else if (eleccion == posMosca - 1 || eleccion == posMosca + 1) {

                tablero[posMosca] = 0;

                int nuevaPos;
                do {
                    nuevaPos = rand.nextInt(15);
                } while (nuevaPos == posMosca ||
                        nuevaPos == posMosca - 1 ||
                        nuevaPos == posMosca + 1);

                posMosca = nuevaPos;
                tablero[posMosca] = 1;

                System.out.println("¡La mosca se ha escapado! Intenta de nuevo.");
            } else {
                System.out.println("La mosca no estaba cerca. Intenta de nuevo.");
            }
        }

        sc.close();
    }
}