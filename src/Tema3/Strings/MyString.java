package Tema3.Strings;

import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú de MyString: \n" +
                "a. Cadena invertida y en mayúsculas. \n" +
                "b. Contar número de vocales. \n" +
                "c. Palabra de mayor longitud. \n" +
                "d. Número de veces que una cadena está incluida en otra. \n" +
                "e. Número de palabras en una cadena. \n" +
                "f. Dar formato a número de teléfono. \n" +
                "g. Historiograma de frecuencias de vocales.");
        System.out.print("Introduce la opción que quieras: ");

        char opcion = sc.next().charAt(0);
        sc.nextLine();

        switch (opcion) {
            case 'a':
                System.out.println("Introduce una cadena: ");
                String cad = sc.nextLine();
                System.out.println(opA(cad));
                break;
            case 'b':
                System.out.println("Introduce una cadena: ");
                cad = sc.nextLine();
                System.out.println("Vocales: " + opB(cad));
                break;
            case 'c':
                System.out.println("Introduce una cadena: ");
                cad = sc.nextLine();
                System.out.println("Palabra más larga: " + opC(cad));
                break;
            case 'd':
                System.out.println("Introduce la cadena principal:");
                String cad1 = sc.nextLine();
                System.out.println("Introduce la cadena a buscar:");
                String cad2 = sc.nextLine();
                System.out.println("Apariciones: " + opD(cad1, cad2));
                break;
            case 'e':
                System.out.println("Introduce una cadena:");
                cad = sc.nextLine();
                System.out.println("Número de palabras: " + opE(cad));
                break;
            case 'f':
                System.out.println("Introduce un número de teléfono:");
                String telefono = sc.nextLine();
                System.out.println(opF(telefono));
                break;
            case 'g':
                System.out.println("Introduce una cadena:");
                cad = sc.nextLine();
                opG(cad);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        sc.close();
    }

    public static String opA(String cad) {
        return new StringBuilder(cad).reverse().toString().toUpperCase();
    }

    public static int opB(String cad) {
        int contador = 0;
        cad = cad.toLowerCase();
        for (char c : cad.toCharArray()) {
            if ("aeiouáéíóú".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static String opC(String cad) {
        String[] palabras = cad.split("\\s+");
        String mayor = "";
        for (String p : palabras) {
            if (p.length() > mayor.length()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public static int opD(String cad1, String cad2) {
        int contador = 0;
        int index = cad1.indexOf(cad2);
        while (index != -1) {
            contador++;
            index = cad1.indexOf(cad2, index + cad2.length());
        }
        return contador;
    }

    public static int opE(String cad) {
        if (cad.trim().isEmpty()) return 0;
        return cad.trim().split("\\s+").length;
    }

    public static String opF(String telefono) {
        telefono = telefono.replaceAll("\\s+", "");
        if (telefono.length() != 9) return "Número inválido";
        return telefono.substring(0, 3) + " " + telefono.substring(3, 5) + " " + telefono.substring(5, 7) + " " + telefono.substring(7);
    }

    public static void opG(String cad) {
        cad = cad.toLowerCase();
        int[] vocales = new int[5]; // a, e, i, o, u
        for (char c : cad.toCharArray()) {
            switch (c) {
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
        System.out.println("a: " + "*".repeat(vocales[0]));
        System.out.println("e: " + "*".repeat(vocales[1]));
        System.out.println("i: " + "*".repeat(vocales[2]));
        System.out.println("o: " + "*".repeat(vocales[3]));
        System.out.println("u: " + "*".repeat(vocales[4]));
    }
}
