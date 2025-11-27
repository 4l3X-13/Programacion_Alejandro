package Tema3.Arrays;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        numeros = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("1. Un procedimiento que imprime el array");
        imprimir(numeros);
        System.out.println("Introduce que opción quieres hacer: ");
        int opcion = sc.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("Quieres imprimir el array? ");
                boolean pregunt = sc.nextBoolean();
                if (pregunt == true) {
                    imprimir(numeros);
                    break;
                } else if (pregunt == false) {
                    System.out.println("Pues no imprimo el array crack :(");
                    break;
                }

        }
    }

    public static void imprimir(int [] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
