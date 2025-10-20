package Tema2;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Los 20 primeros números primos: ");

        int numP = 2;
        int contador = 0;

        while (contador < 20) {
            boolean esPrimo = true;

            for (int i = 2; i < numP; i++) {
                if (numP % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numP);
                contador++;
            }

            numP++;
        }
    }
}
