package POO.Ejercicio1;

import java.util.Scanner;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        Scanner sc = new Scanner(System.in);
        reloj.setHora(13);
        reloj.setMinutos(45);
        reloj.setSegundos(23);
        reloj.setEs24h(true);
        reloj.mostrar();

    }
}
