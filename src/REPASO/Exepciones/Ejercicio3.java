package REPASO.Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        int i = 0;

        while (i < vector.length) {
            try {
                System.out.print("Inserta el valor para la posición " + i + ": ");
                vector[i] = sc.nextDouble();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero valido");
                sc.nextLine();
            }
            //meter otro catch con el error del Array, como en ejer4
        }
        System.out.println("Vector hecho correctamente");
        sc.close();
    }
}