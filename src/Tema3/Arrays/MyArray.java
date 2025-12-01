package Tema3.Arrays;

import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numeros2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("1. Imprimir el array");
        System.out.println("2. Número máximo del array");
        System.out.println("3. Número mínimo del array");
        System.out.println("4. Media del array");
        System.out.println("5. Comprobar si un elemento existe");
        System.out.println("6. Suma de dos vectores");
        System.out.println("7. Resta de dos vectores");
        System.out.print("Introduce una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                imprimir(numeros);
                break;

            case 2:
                System.out.println("Máximo: " + maxArray(numeros));
                break;

            case 3:
                System.out.println("Mínimo: " + minArray(numeros));
                break;

            case 4:
                System.out.println("Media: " + media(numeros));
                break;

            case 5:
                System.out.print("Introduce el número a buscar: ");
                int elemento = sc.nextInt();
                if (elementExis(numeros, elemento)) {
                    System.out.println("El elemento SÍ existe.");
                } else {
                    System.out.println("El elemento NO existe.");
                }
                break;

            case 6:
                int[] suma = sumaVectores(numeros, numeros2);
                imprimir(suma);
                break;

            case 7:
                int[] resta = restaVectores(numeros, numeros2);
                imprimir(resta);
                break;

            case 8:
                productoEscalar(numeros, numeros2);
                break;


            default:
                System.out.println("Opción no válida.");
        }
    }


    public static void imprimir(int[] numeros) {
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int maxArray(int[] numeros) {
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int minArray(int[] numeros) {
        int min = numeros[0];
        for (int n : numeros) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static double media(int[] numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return (double) suma / numeros.length;
    }

    public static boolean elementExis(int[] numeros, int elemento) {
        for (int n : numeros) {
            if (n == elemento) {
                return true;
            }
        }
        return false;
    }

    public static int[] sumaVectores(int[] numeros1, int[] numeros2) {
        int[] resultado = new int[numeros1.length];
        for (int i = 0; i < numeros1.length; i++) {
            resultado[i] = numeros1[i] + numeros2[i];
        }
        return resultado;
    }

    public static int[] restaVectores(int[] numeros1, int[] numeros2) {
        int[] resultado = new int[numeros1.length];
        for (int i = 0; i < numeros1.length; i++) {
            resultado[i] = numeros1[i] - numeros2[i];
        }
        return resultado;
    }

    public static int productoEscalar(int[] numeros, int[] numeros2) {
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] * numeros2[i];
        }

        return resultado;
    }

}
