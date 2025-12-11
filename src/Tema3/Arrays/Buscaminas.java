package Tema3.Arrays;

import java.util.Scanner;
import java.util.Random;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] tablero = new int[20];
        boolean[] visible = new boolean[20];
        int minas = 6;
        int tamano = 20;


        for (int i = 0; i < tamano; i++) {
            tablero[i] = 0;
            visible[i] = false;
        }

        int minasColocadas = 0;
        while (minasColocadas < minas) {
            int pos = random.nextInt(tamano);
            if (tablero[pos] != -1) {
                tablero[pos] = -1;
                minasColocadas++;
            }
        }

        for (int i = 0; i < tamano; i++) {
            if (tablero[i] == -1) {
                continue;
            }

            int minasAlrededor = 0;

            if (i > 0 && tablero[i - 1] == -1) {
                minasAlrededor++;
            }
            if (i < tamano - 1 && tablero[i + 1] == -1) {
                minasAlrededor++;
            }

            tablero[i] = minasAlrededor;
        }

        boolean juegoTerminado = false;
        int casillasDescubiertas = 0;
        int casillasSeguras = tamano - minas;

        while (!juegoTerminado) {
            System.out.print("Tablero: ");
            for (int i = 0; i < tamano; i++) {
                if (visible[i]) {
                    System.out.print("[" + tablero[i] + "]");
                } else {
                    System.out.print("[?]");
                }
            }
            System.out.println();

            System.out.print("Selecciona una posición (0-19): ");
            int seleccion = scanner.nextInt();

            if (seleccion < 0 || seleccion >= tamano) {
                System.out.println("Posición inválida. Intenta de nuevo.");
                continue;
            }

            if (visible[seleccion]) {
                System.out.println("¡Ya has descubierto esa casilla!");
                continue;
            }

            if (tablero[seleccion] == -1) {
                System.out.println("\n¡BOOM! Has pisado una mina.");
                juegoTerminado = true;
            } else {
                visible[seleccion] = true;
                casillasDescubiertas++;

                if (casillasDescubiertas == casillasSeguras) {
                    System.out.println("\n¡FELICIDADES! Has despejado todo el campo minado.");
                    juegoTerminado = true;
                }
            }
        }

        System.out.println("\nTablero Final:");
        for (int i = 0; i < tamano; i++) {
            if (tablero[i] == -1) {
                System.out.print("[*]");
            } else {
                System.out.print("[" + tablero[i] + "]");
            }
        }
        scanner.close();
    }
}