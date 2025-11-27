package Tema3.Arrays;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        numeros = new int[]{0,1,2,3,4,5,6,7,8,9};

        System.out.println("1. Un procedimiento que imprime el array");
        System.out.println("2. Una funcion que devuelva el número máximo del array: ");
        System.out.println("3. Una funcion que devuelva el número mínimo del array: ");
        System.out.println("Introduce que opción quieres hacer: ");
        int opcion = sc.nextInt();
        switch (opcion) {
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

            case 2:
                maxArray(numeros);
                break;

            case 3:
                minArray(numeros);
                break;
        }
    }

    public static void imprimir(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void maxArray(int[] numeros) {
        int max;
        int max1 = 1;
        for (int i = 0; i < numeros.length; i++) {
            max = numeros[i];
            if (max > max1) {
                max1 = numeros[i];
            }
        }
        System.out.println(max1);
    }

    public static void minArray(int[] numeros) {
        int min;
        int min1 = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            min = numeros[i];
            if (min < min1) {
                min1 = numeros[i];
            }
        }
        System.out.println(min1);
    }

    public static void media(int[] numeros) {
        int media;
        for (int i = 0; i < numeros.length; i++) {
            media = numeros[i];

        }
    }


}
