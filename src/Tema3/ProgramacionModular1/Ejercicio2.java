package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número (para el ejercicio 1): ");
        int num = sc.nextInt();
        int signo = Ejercicio1.numberSign(num);

        if (signo == 1) {
            System.out.println("El número es positivo.");
        } else if (signo == -1) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        int age;
        do {
            System.out.print("Introduce tu edad: ");
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("La edad es incorrecta. Intentalo de nuevo.");
            }
        } while (age < 0);

        if (isAdult(age)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        sc.close();
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }
}
