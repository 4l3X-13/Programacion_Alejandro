package Tema2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        double raiz = Math.sqrt(numero);
        System.out.println("La raíz es: " + raiz);
        if (numero < 0) {
            System.out.println("ERROR");
        }
        sc.close();
    }
}
