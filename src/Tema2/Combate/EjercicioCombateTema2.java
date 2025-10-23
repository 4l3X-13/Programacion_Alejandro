package Tema2.Combate;

import java.util.Random;
import java.util.Scanner;

public class EjercicioCombateTema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("                                                                                     \uD83C\uDD72\uD83C\uDD7E\uD83C\uDD7C\uD83C\uDD71\uD83C\uDD70\uD83C\uDD83\uD83C\uDD74 \uD83C\uDD70\uD83C\uDD7B\uD83C\uDD74\uD83C\uDD87\n" +
                " ░░░░░░▄█▀█▄░░░░░░░░░░░░░░░\n" +
                "░▄█▀▀▀▀░░░░▀█▄▄▄▄▄▄▄░░░░░░\n" +
                "█▀░░░░░░░░░░░░░░░░░▀█░░░░░\n" +
                "▀▄░▄░░░░░░░░░░░░░░░▄█░░░░░\n" +
                "░█████▄▄▄▄▄██▄▄▄█▀▀█░░░░░░\n" +
                "░█▀█░░░░▀░░░░░▀░░░░█▀▀▀▀▀█\n" +
                "░█░███▄▄▄▄░░░▄▄▄▄▄██▀▀██░█\n" +
                "░█░███░████▀████░███░░█░░█\n" +
                "░█▄███░████░████░███░░█░█▀\n" +
                "░░░███░████░████░███░░█░█░\n" +
                "░░░███░████░████░███▄▄█░█░\n" +
                "░░░███░████░████░███░░░▄█░\n" +
                "░░░███░████░████░███▀▀▀▀░░\n" +
                "░░▄███▄████░████▄███▄░░░░░\n" +
                "░░███▀███████████▀███░░░░░\n" +
                "░░░░▀▀▀██▄▄▄▄▄██▀▀▀░░░░░░░");
        System.out.println("\n                                                                                    ¡¡¡EMPIEZA EL COMBATE!!! ");
        System.out.println("Lo primero será crear tu jugador, pero hay ciertas reglas: \n");
        System.out.println("📜 REGLAS");
        System.out.println("1. Cada jugador dispone de 500 puntos a repartir entre velocidad, ataque, defensa y vida (máx. 200 cada uno).");
        System.out.println("2. Ningún atributo puede superar los 200 ni ser negativo.\n");

        // ------------------------- CREACIÓN JUGADOR 1 -------------------------
        System.out.println("=== ENTRANDO AL MENÚ DE CREACIÓN DEL PERSONAJE 1 ===\n");
        int[] stats1 = crearJugador(sc);
        int velocidad1 = stats1[0];
        int ataque1 = stats1[1];
        int defensa1 = stats1[2];
        int vida1 = stats1[3];
        int critico1 = random.nextInt(21); // crítico aleatorio 0-20

        // ------------------------- CREACIÓN JUGADOR 2 -------------------------
        System.out.println("\n=== ENTRANDO AL MENÚ DE CREACIÓN DEL PERSONAJE 2 ===\n");
        int[] stats2 = crearJugador(sc);
        int velocidad2 = stats2[0];
        int ataque2 = stats2[1];
        int defensa2 = stats2[2];
        int vida2 = stats2[3];
        int critico2 = random.nextInt(21);

        int vidaMax1 = vida1;
        int vidaMax2 = vida2;
        int ronda = 1;

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(" COMIENZA EL COMBATE ");
        System.out.println("--------------------------------------------------------------------------------------");

        while (vida1 > 0 && vida2 > 0) {
            System.out.println("\n                                                                                 ⓇⓄⓃⒹⒶ " + ronda);
            System.out.println("--------------------------------------------------------------------------------------");

            // Turno dependiendo de velocidad
            if (velocidad1 >= velocidad2) {
                vida2 = atacar("Jugador1", "Jugador2", ataque1, defensa2, critico1, vida2);
                if (vida2 <= 0) break;

                vida1 = atacar("Jugador2", "Jugador1", ataque2, defensa1, critico2, vida1);
                if (vida1 <= 0) break;
            } else {
                vida1 = atacar("Jugador2", "Jugador1", ataque2, defensa1, critico2, vida1);
                if (vida1 <= 0) break;

                vida2 = atacar("Jugador1", "Jugador2", ataque1, defensa2, critico1, vida2);
                if (vida2 <= 0) break;
            }

            // ------------------------- BARRAS DE VIDA -------------------------
            mostrarBarraVida("Jugador1", vida1, vidaMax1);
            mostrarBarraVida("Jugador2", vida2, vidaMax2);

            ronda++;
        }

        System.out.println("\n======================================================================================");
        if (vida1 > vida2) {
            System.out.println(" 🏆 ¡Jugador1 GANA EL COMBATE!");
        } else if (vida2 > vida1) {
            System.out.println(" 🏆 ¡Jugador2 GANA EL COMBATE!");
        } else {
            System.out.println(" 🤝 ¡EMPATE!");
        }
        System.out.println("======================================================================================");

        sc.close();
    }

    // ------------------------- FUNCIONES AUXILIARES -------------------------

    public static int[] crearJugador(Scanner sc) {
        int[] stats = new int[4];
        String[] nombres = {"velocidad", "ataque", "defensa", "vida"};
        int total = 0;

        for (int i = 0; i < nombres.length; i++) {
            do {
                System.out.printf("Introduce el valor de %s (0–200): ", nombres[i]);
                stats[i] = sc.nextInt();
                if (stats[i] < 0 || stats[i] > 200) {
                    System.out.println("⚠️ Valor fuera del rango permitido. Intenta de nuevo.");
                }
            } while (stats[i] < 0 || stats[i] > 200);

            total += stats[i];
        }

        if (total > 500) {
            System.out.println("⚠️ Has superado el límite total de 500 puntos. Se ajustarán automáticamente.");
            for (int i = 0; i < 4; i++) stats[i] = stats[i] * 500 / total;
        }

        return stats;
    }

    public static int atacar(String atacante, String defensor, int ataque, int defensa, int critico, int vidaDefensor) {
        int danio = ataque - (defensa / 4) + critico;
        if (danio < 0) danio = 0;
        vidaDefensor -= danio;
        if (vidaDefensor < 0) vidaDefensor = 0;

        System.out.printf("%s ataca a %s y causa %d de daño (Crítico +%d)\n", atacante, defensor, danio, critico);
        return vidaDefensor;
    }

    public static void mostrarBarraVida(String jugador, int vidaActual, int vidaMax) {
        int longitudBarra = 30;
        int bloquesLlenos = (int) ((vidaActual / (double) vidaMax) * longitudBarra);
        StringBuilder barra = new StringBuilder();

        for (int i = 0; i < longitudBarra; i++) {
            barra.append(i < bloquesLlenos ? "█" : "░");
        }
        System.out.printf("%-10s: [%s] %d/%d\n", jugador, barra, vidaActual, vidaMax);
    }
}
