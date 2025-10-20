package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;


        Random random = new Random();
        int randomInt = random.nextInt(99999);
        //System.out.println(randomInt);  // Quitar comentario para ver cual es el número ganador.

        do {
            System.out.println("Introduce un número para ganar la lotería: ");
            int numJ = sc.nextInt();
            if (numJ == randomInt) {
                System.out.println("GANASTE LA LOTERÍA");
                break;
            } else {
                System.out.println("NO GANASTE :(");
            }
            contador++;

        } while (contador < 5);
    }
}
