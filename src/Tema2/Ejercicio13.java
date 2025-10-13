package Tema2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las horas: ");
        int horas = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos = sc.nextInt();
        int horasAct = horas + 1;
        int minutosAct = minutos + 1;
        int segundosAct = segundos + 1;

        if (horas == 23) {
            horasAct = 0;
        } else if (minutosAct == 60) {
           minutosAct = 0;
        } else if (segundosAct == 60) {
            segundosAct = 0;
        }


        System.out.println("La hora actualizada es: " + horasAct + ":" + minutosAct + ":" + segundosAct);
        sc.close();
    }
}
