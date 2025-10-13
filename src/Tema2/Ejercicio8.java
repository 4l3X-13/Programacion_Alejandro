package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los €: ");
        double euro = sc.nextInt();
        double dollar = euro * 1.07;
        System.out.println(euro + " euros son " + dollar + " dolares.");
    }
}
