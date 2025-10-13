package Tema2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los €: ");
        double dollar = sc.nextInt();
        double euro = dollar / 1.07;
        System.out.println(dollar + " dolares son " + euro + " euros.");
    }
}
