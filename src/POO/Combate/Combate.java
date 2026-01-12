package POO.Combate;

import java.util.Random;
import java.util.Scanner;

public class CombateModular {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int[] jugador1 = readPlayerStats(1);
        int[] jugador2 = readPlayerStats(2);

        int vidaMax1 = jugador1[3];
        int vidaMax2 = jugador2[3];

        int ronda = 1;

        while (jugador1[3] > 0 && jugador2[3] > 0) {

            System.out.println("\n****************************************");
            System.out.println("RONDA " + ronda);

            printRoundInfo(jugador1[3], vidaMax1, jugador2[3], vidaMax2);

            if (jugador1[0] >= jugador2[0]) {
                jugador2[3] -= makeAttack(jugador1, jugador2, 1, 2);
                if (jugador2[3] > 0)
                    jugador1[3] -= makeAttack(jugador2, jugador1, 2, 1);
            } else {
                jugador1[3] -= makeAttack(jugador2, jugador1, 2, 1);
                if (jugador1[3] > 0)
                    jugador2[3] -= makeAttack(jugador1, jugador2, 1, 2);
            }

            jugador1[3] = Math.max(jugador1[3], 0);
            jugador2[3] = Math.max(jugador2[3], 0);

            printRoundInfo(jugador1[3], vidaMax1, jugador2[3], vidaMax2);

            System.out.println("Pulsa cualquier tecla para continuar");
            sc.next();

            ronda++;
        }

        System.out.println("\n========================================");
        if (jugador1[3] > 0)
            System.out.println("EL JUGADOR 1 HA GANADO");
        else
            System.out.println("EL JUGADOR 2 HA GANADO");
    }

    // ---------------- FUNCIONES ----------------

    static int[] readPlayerStats(int numJugador) {
        int[] stats = new int[4];
        boolean valid;

        do {
            System.out.println("\nJUGADOR " + numJugador);
            System.out.print("Velocidad: ");
            stats[0] = sc.nextInt();
            System.out.print("Ataque: ");
            stats[1] = sc.nextInt();
            System.out.print("Defensa: ");
            stats[2] = sc.nextInt();
            System.out.print("Vida: ");
            stats[3] = sc.nextInt();

            valid = areValidPlayerStats(stats);

            if (!valid)
                System.out.println("Valores incorrectos. Inténtalo de nuevo.");

        } while (!valid);

        return stats;
    }

    static boolean areValidPlayerStats(int[] stats) {
        int suma = 0;
        for (int stat : stats) {
            if (stat < 1 || stat > 200) return false;
            suma += stat;
        }
        return suma <= 500;
    }

    static int makeAttack(int[] atacante, int[] defensor, int nAt, int nDef) {
        int damage = calculateDamage(atacante[1], defensor[2]);
        System.out.println("Jugador " + nAt + " golpea con " + damage + " de daño");
        return damage;
    }

    static int calculateDamage(int ataque, int defensa) {
        int randomFactor = random.nextInt(11); // 0–10
        int damage = ataque - defensa / 2 + randomFactor;
        return Math.max(damage, 0);
    }

    static void printRoundInfo(int vida1, int max1, int vida2, int max2) {
        System.out.print("Jugador 1: ");
        printLifeBar(vida1, max1);
        System.out.print("Jugador 2: ");
        printLifeBar(vida2, max2);
    }

    static void printLifeBar(int vida, int max) {
        int length = 30;
        int filled = vida * length / max;
        for (int i = 0; i < length; i++)
            System.out.print(i < filled ? "-" : " ");
        System.out.println(" " + vida);
    }
}
