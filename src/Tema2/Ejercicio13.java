package Tema2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();

        if (horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60 || segundos < 0 || segundos >= 60) {
            System.out.println("S I N T A X   E R R O R");
        } else {
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }

            if (minutos == 60) {
                minutos = 0;
                horas++;
            }

            if (horas == 24) {
                horas = 0;
            }

            System.out.printf("La hora actualizada es: %02d:%02d:%02d%n", horas, minutos, segundos);
        }

        sc.close();
    }
}
