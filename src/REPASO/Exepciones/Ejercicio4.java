package REPASO.Exepciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = new Random().nextInt(100) + 1;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) vector[i] = new Random().nextInt(10) + 1;
        while (true) {
            try {
                System.out.print("Indice (pon un numero negativo para salir): ");
                int posicion = sc.nextInt();
                if (posicion < 0) break;
                System.out.println("Valor: " + vector[posicion]);
            } catch (Exception e) {
                System.out.println("Error: entrada no válida o índice inexistente");
                sc.nextLine();
            }
        }
        sc.close();
    }
}