package Strings;

import java.util.Scanner;

public class Tema3StringEjercicio1 {

    public static void main(String[] args) {
        System.out.println("Estas son las opciones del menu:");

        boolean salir = false;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println(" a) Devolver Mayusculas ");
            System.out.println(" b) Numero de vocales");
            System.out.println(" c) Mayor longitud");
            System.out.println(" d) Dos cadenas devuelve numero ");
            System.out.println(" e) Numero de palabras que contiene ");
            System.out.println(" f) Convertir formato ");
            System.out.println(" g) Histograma de frecuencias de vocales ");
            System.out.println(" h) Salir del menu. ");

            System.out.println("Escoge una opcion:");
            String opcion = input.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Pon la cadena:");
                    String textoMayusculas = input.nextLine();
                    System.out.println("Cadena invertida y en maysculas: " + devolverMayusculas(textoMayusculas));
                    break;
                case "b":
                    System.out.println("Pon la cadena:");
                    String textoVocales = input.nextLine();
                    int numVocales = contarVocales(textoVocales);
                    System.out.println("Número de vocales: " + contarVocales(textoVocales));
                    break;
                case "c":
                    System.out.println("Pon la cadena:");
                    String texto = input.nextLine();
                    String palabraLarga = palabraMasLarga(texto);
                    System.out.println("La palabra más larga es: " + palabraLarga);
                    break;

                case "d":
                    System.out.println("Pon la cadena A:");
                    String cadenaA = input.nextLine();
                    System.out.println("Pon la cadena B:");
                    String cadenaB = input.nextLine();
                    int numero = compararCadenas(cadenaA, cadenaB);
                    System.out.println("Numero de veces que la segunda cadena esta incluida en la primera: " + numero);
                    break;
                case "e":
                    System.out.println("Pon una cadena:");
                    String textoPalabras = input.nextLine();
                    int numPalabras = contarPalabras(textoPalabras);
                    System.out.println("La palabra: " + textoPalabras + "tiene" + numPalabras + "letras");
                    break;
                case "f":

                    System.out.println("Pon un numero de telefono:");
                    String telefono = input.nextLine();
                    if (telefono.length() != 11) {
                        System.out.println("numero de telefono invalido");
                    } else {
                        System.out.println("Numero en formato: " + convertirFormato(telefono));
                    }
                    break;
                case "g":
                    System.out.println("Pon una cadena:");
                    String textoHistograma = input.nextLine();
                    mostrarHistograma(textoHistograma);
                    break;
                case "h":
                    System.out.println("Saliendo del menu");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida vuelve a escoger.");
            }
        } while (!salir);


    }

    //A
    public static String devolverMayusculas(String texto) {
        String invertido = new StringBuilder(texto).reverse().toString();  // Invertir la cadena
        return invertido.toUpperCase(); // Devolver en mayusculas
    }

    //B
    public static int contarVocales(String texto) {
        Scanner input = new Scanner(System.in);
        texto = texto.toLowerCase();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    //C
    public static String palabraMasLarga(String texto) {
        String[] palabras = texto.split(" "); // Apretamos espacio para separar las palabras
        String palabraLarga = ""; //
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraLarga.length()) {
                palabraLarga = palabras[i];
            }
        }
        return palabraLarga;
    }

    //D
    public static int compararCadenas(String cadenaA, String cadenaB) {
        int comparacion = 0;
        int a = cadenaA.length();
        int b = cadenaB.length();
        int sumaCadenas = a - b;
        for (int i = 0; i < sumaCadenas; i++) ;
        boolean coincide = true;
        for (int j = 0; j < b; j++) {
            coincide = false;
            if (coincide) ;// mirazr luuego
            comparacion++;
        }
        return comparacion;
    }

    //revisar
    //E
    public static int contarPalabras(String frase) {
        //debes dividir la frase en palabras, y contar luego las palabras
        //return palabra.length();
        return 0;
    }

    //F
    public static String convertirFormato(String telefono) {
        if (telefono.length() == 11) {
        }
        return "(+" + telefono.substring(0, 2) + ")-"//prefijo
                + telefono.substring(2, 5) + "-"// los 3 primeros 3 digitos
                + telefono.substring(5);// los numeros restantes

    }

    //G
    public static void mostrarHistograma(String texto) {
        int[] vocales = new int[5];
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (Character.toLowerCase(letra)) {
                case 'a':
                    vocales[0]++;
                    break;
                case 'e':
                    vocales[1]++;
                    break;
                case 'i':
                    vocales[2]++;
                    break;
                case 'o':
                    vocales[3]++;
                    break;
                case 'u':
                    vocales[4]++;
                    break;
            }
        }

        System.out.println("Histograma de vocales:");
        System.out.println("a " + vocales[0] + " " + "*".repeat(vocales[0]));
        System.out.println("e " + vocales[1] + " " + "*".repeat(vocales[1]));
        System.out.println("i " + vocales[2] + " " + "*".repeat(vocales[2]));
        System.out.println("o " + vocales[3] + " " + "*".repeat(vocales[3]));
        System.out.println("u " + vocales[4] + " " + "*".repeat(vocales[4]));
    }

}
