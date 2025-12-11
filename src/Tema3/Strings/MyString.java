package Tema3.Strings;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú de MyString: \n " +
                "a. Una función que reciba una cadena y devuelva esta cadena invertida y en mayúsculas. \n " +
                "b. Una función que reciba una cadena y devuelva el número de vocales. \n " +
                "c. Una función que reciba una cadena y devuelva una palabra de mayor longitud. \n " +
                "d. Una función que reciba dos cadenas y devuelva el número de veces que la segunda cadena está incluida en la primera. \n " +
                "e. Una función que reciba una cadena y devuelva el número de palabras que contiene. \n " +
                "f. Una función que reciba un número de teléfono, por ejemplo `34555332211´ y lo convierta en formato (+34)-555-332211. \n " +
                "g. Un procedimiento que reciba una cadena y muestre por pantalla el historiograma de frecuencias de las vocales.");
        System.out.println("Introduce la opción que quieras: ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 'a':
                System.out.println("Una función que reciba una cadena y devuelva esta cadena invertida y en mayúsculas.");
                break;

            case 'b':
                System.out.println("Una función que reciba una cadena y devuelva el número de vocales.");
                break;

            case 'c':
                System.out.println("Una función que reciba una cadena y devuelva una palabra de mayor longitud.");
                break;

            case 'd':
                System.out.println("Una función que reciba dos cadenas y devuelva el número de veces que la segunda cadena está incluida en la primera.");
                break;

            case 'e':
                System.out.println("Una función que reciba una cadena y devuelva el número de palabras que contiene.");
                break;

            case 'f':
                System.out.println("Una función que reciba un número de teléfono, por ejemplo `34555332211´ y lo convierta en formato (+34)-555-332211.");
                break;

            case 'g':
                System.out.println("Un procedimiento que reciba una cadena y muestre por pantalla el historiograma de frecuencias de las vocales.");
                break;
        }

    }
}
