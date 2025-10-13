package Tema1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que quieres que sea el radio");
        double radio = sc.nextDouble();
        double area = 3.14 * radio * radio;
        System.out.println(area);

    }
}
