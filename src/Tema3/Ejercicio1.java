package Tema3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println(numberSign(num));
        if (numberSign(num) == 0){
            System.out.println("Es cero");
        } else if (numberSign(num) == 1) {
            System.out.println("Es positivo");
        }
    }

    public static int numberSign(int num) {
        if (num > 0) {
            return +1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}