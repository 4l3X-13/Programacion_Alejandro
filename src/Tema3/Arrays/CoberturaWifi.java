package Tema3.Arrays;

import java.util.Scanner;

public class CoberturaWifi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int habitaciones = 20;
        int[] cobertura = new int[habitaciones];

        System.out.print("Introduce la habitación donde va el router (1-20): ");
        int habitacion = sc.nextInt() - 1;

        System.out.print("Introduce la potencia del router (1-6): ");
        int potencia = sc.nextInt();

        cobertura[habitacion] = potencia;

        for (int i = habitacion - 1; i >= 0; i--) {
            int distancia = habitacion - i;
            int valor = potencia - distancia;
            cobertura[i] = Math.max(0, valor);
        }

        for (int i = habitacion + 1; i < habitaciones; i++) {
            int distancia = i - habitacion;
            int valor = potencia - distancia;
            cobertura[i] = Math.max(0, valor);
        }

        for (int i = 0; i < habitaciones; i++) {
            System.out.print(cobertura[i] + " ");
        }
    }
}
