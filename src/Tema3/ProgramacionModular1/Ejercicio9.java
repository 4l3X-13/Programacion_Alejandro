package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char caracter = sc.next().charAt(0);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        System.out.println("\n");
        imprimirTriangulo(caracter, numero);
    }

    public static void imprimirTriangulo(char caracter, int numLineas) {
        for (int i = 1; i <= numLineas; i++) {
            int numCaracteres = 2 * i - 1;
            int espacios = numLineas - i;
            System.out.println(" ".repeat(espacios) + String.valueOf(caracter).repeat(numCaracteres));

        }
    }
}
