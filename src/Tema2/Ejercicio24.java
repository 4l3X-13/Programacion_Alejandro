package Tema2;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int aprovado = 0;
        int suspendido = 0;
        do {
            System.out.println("Introduce la nota y pon un número negativo para que pare: ");
            nota = sc.nextInt();
            if (nota > 10) {
                System.out.println("Número invalido");
            }
            if (nota >= 5){
                aprovado ++;
            }else{
                suspendido ++;
            }

        } while (nota >= 0);

        System.out.println("Han aprovado " + aprovado + " personas");
        System.out.println("Han suspendido " + suspendido + " personas");

    }
}
