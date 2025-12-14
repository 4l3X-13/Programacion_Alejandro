package Strings;

import java.util.Scanner;

public class Tema3StringEjercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pon la palabra de 5 letras");
        String palabraEscondida = input.nextLine();
        int maxIntentos = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Empieza el juego ");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinar la palabra de 5 letras.");

        for (int intento = 1; intento <= maxIntentos; intento++) {
            System.out.print("Intento " + intento + ": ");
            String adivina = scanner.nextLine().toLowerCase();

            if (adivina.length() != 5) {
                System.out.println("La palabra tiene que tener 5 letras");
                intento--;
                continue;
            }
            if (adivina.equals(palabraEscondida)) {
                System.out.println("Has adivinado la palabra");

            } else {
                String pista = generarEscondida(palabraEscondida, adivina);
                System.out.println("Pista: " + pista);
            }
        }
        if (maxIntentos == 5) {
            System.out.println("La palabra escondida es " + palabraEscondida);
        }

        scanner.close();
    }

    public static String generarEscondida(String palabraEscondida, String adivina) {
        StringBuilder pista = new StringBuilder("-----");


        for (int i = 0; i < palabraEscondida.length(); i++) {
            if (adivina.charAt(i) == palabraEscondida.charAt(i)) {
                pista.setCharAt(i, '*');
            } else {
                pista.setCharAt(i, '_');
            }
        }

        return pista.toString();
    }
}
