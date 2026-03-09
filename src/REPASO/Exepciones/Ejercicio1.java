package REPASO.Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un numero: ");
            int num = sc.nextInt();
            System.out.println("Numero insertado: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Numero insertado incorrecto");
        } finally {
            sc.close();
        }
    }
}