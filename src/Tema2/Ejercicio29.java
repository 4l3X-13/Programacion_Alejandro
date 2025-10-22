package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        boolean acert= false;


        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println(randomInt);
        do {

            do {
                System.out.println("Introduce un número: ");
                int numJ = sc.nextInt();
                if (numJ == randomInt) {
                    System.out.println("ACERTASTE EL NÚMERO");
                    acert = true;

                    break;
                } else {
                    System.out.println("NO ACERTASTE EL NÚMERO");
                }
                contador++;

            } while (contador < 5);

        }while(randomInt > 0 || acert == false);

    }
}



