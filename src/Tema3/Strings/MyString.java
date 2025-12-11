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
                String cad1 = sc.nextLine();
                System.out.println(opA(cad1));
                break;

            case 'b':
                System.out.println("Introduce una cadena: ");
                String cad2 = sc.nextLine();
                System.out.println("Vocales: " + opB(cad2));
                break;

            case 'c':
                System.out.println("Introduce una cadena: ");
                String cad3 = sc.nextLine();
                System.out.println("Palabra más larga: " + opC(cad3));
                break;

            case 'd':
                System.out.println("Introduce la cadena principal:");
                String cad4 = sc.nextLine();
                System.out.println("Introduce la cadena a buscar:");
                String cad5 = sc.nextLine();
                System.out.println("Apariciones: " + opD(cad4, cad5));
                break;

            case 'e':
                System.out.println("Introduce una cadena:");
                String cad6 = sc.nextLine();
                System.out.println("Número de palabras: " + opE(cad6));
                break;

            case 'f':
                System.out.println("Introduce un número de teléfono:");
                String telefono = sc.nextLine();
                System.out.println(opF(telefono));
                break;

            case 'g':
                System.out.println("Introduce una cadena:");
                String cad7 = sc.nextLine();
                opG(cad7);
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }


    public static String opA(String cad1) {
        return "";
    }

    public static int opB(String cad2) {
        return 0;
    }

    public static String opC(String cad3) {
        return "";
    }

    public static int opD(String cad1, String cad2) {
        return 0;
    }

    public static int opE(String cad1) {
        return 0;
    }

    public static String opF(String telefono) {
        return "";
    }

    public static void opG(String cad1) {
    }
}
