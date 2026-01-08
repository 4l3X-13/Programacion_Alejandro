package Strings;

import java.util.Scanner;

public class Tema3StringEjercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe:");
        String mensaje = input.nextLine();
        String mensajeCifrado = encriptar(mensaje, 1);

        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
    }

    public static String encriptar(String message, int shift) {
        StringBuilder mensajeEncriptado = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char cifrado = message.charAt(i);

            if (Character.isLetter(cifrado)) { // Si es una letra
                cifrado = Character.toUpperCase(cifrado); // Convertimos a mayuscula
                if (cifrado == 'Z') {
                    cifrado = 'A'; // La Z pasa a A
                } else {
                    cifrado = (char) (cifrado + 1); // Se mueve una posicion +1
                }
            } else if (Character.isDigit(cifrado)) { // Si es un numero
                if (cifrado == '9') {
                    cifrado = '0'; // El 9 pasa a 0
                } else {
                    cifrado = (char) (cifrado + 1); // Se mueve una posicion +1
                }
            }
            mensajeEncriptado.append(cifrado); // Poner mensaje cifrado
        }

        return mensajeEncriptado.toString();
    }
}
