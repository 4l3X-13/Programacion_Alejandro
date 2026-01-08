package Strings;

import java.util.Scanner;

public class Tema3StringEjercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1, introduce una palabra: ");
        String palabra = scanner.nextLine();
        char[] adivinaPalabra = new char[palabra.length()];
        int intentos = 6;
        StringBuilder noAdivina = new StringBuilder();
        boolean juegoTerminado = false;
        for (int i = 0; i < palabra.length(); i++) {
            adivinaPalabra[i] = '_';
        }

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("Jugador 2 adivina la palabra:");


        while (intentos > 0 && !juegoTerminado) {
            System.out.print("Palabra: ");
            for (int i = 0; i < adivinaPalabra.length; i++) {
                System.out.print(adivinaPalabra[i] + " ");
            }
            System.out.println();

            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Letras incorrectas: " + noAdivina);

            System.out.print("Introduce una letra: ");
            char letra = scanner.next().charAt(0);

            boolean encontrada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    adivinaPalabra[i] = letra;
                    encontrada = true;
                }
            }

            if (encontrada) {
                System.out.println("correcto");
            } else {
                System.out.println("incorrecto");
                noAdivina.append(letra).append(" ");
                intentos--;
            }
            boolean completada = true;
            for (int i = 0; i < adivinaPalabra.length; i++) {
                if (adivinaPalabra[i] == '_') {
                    completada = false;
                }
            }

            if (completada) {
                System.out.println("Has ganado");
                juegoTerminado = true;
            }
        }

        if (intentos == 0) {
            System.out.println("Has perdido la palabra era " + palabra);
        }

        scanner.close();
    }
}
