package REPASO.Exepciones;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n = rnd.nextInt(100) + 1;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) vector[i] = rnd.nextInt(10) + 1;

        int posicion = 0;
        while (posicion >= 0) {
            try {
                System.out.print("Indice (negativo para salir): ");
                posicion = sc.nextInt();
                if (posicion >= 0) {
                    System.out.println("Valor: " + vector[posicion]);
                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Introduce un índice válido entre 0 y " + (n - 1));
                sc.nextLine();
            }
        }
        sc.close();
    }
}