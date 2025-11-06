package Tema3;

import java.util.Scanner;

public class Ejercicio2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = sc.nextInt();
        System.out.println("¿Eres mayor de edad?");
        System.out.println(isAdult(age));
        sc.close();
    }

    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
