package Tema2.Combate;

import java.util.Random;
import java.util.Scanner;

public class EjercicioCombateTema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("                                                                                     🅲🅾🅼🅱🅰🆃🅴");
        System.out.println(" ░░░░░░▄█▀█▄░░░░░░░░░░░░░░░\n" +
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
        System.out.println("\nＲＥＧＬＡＳ:");
        System.out.println("1️Cada jugador tiene 500 puntos a repartir entre velocidad, ataque, defensa y vida (máx. 200 cada uno).");
        System.out.println("2️Si fallas tres veces, tus puntos se reparten automáticamente de forma balanceada.\n");

        // -------------------- CREACIÓN JUGADOR 1 --------------------
        System.out.println("=== ＣＲＥＡＣＩÓＮ ＤＥＬ ＪＵＧＡＤＯＲ ① ===");
        int velocidad1 = 0, ataque1 = 0, defensa1 = 0, vida1 = 0;
        int intentos1 = 0;

        do {
            System.out.print("Velocidad (0–200): ");
            velocidad1 = sc.nextInt();
            System.out.print("Ataque (0–200): ");
            ataque1 = sc.nextInt();
            System.out.print("Defensa (0–200): ");
            defensa1 = sc.nextInt();
            System.out.print("Vida (0–200): ");
            vida1 = sc.nextInt();
            int total1 = velocidad1 + ataque1 + defensa1 + vida1;
            if (total1 > 500 || velocidad1 > 200 || ataque1 > 200 || defensa1 > 200 || vida1 > 200) {
                intentos1++;
                System.out.println(" ¡Error! Suma total o atributo fuera de rango. Intento " + intentos1 + "/3\n");
            }
            if (intentos1 == 3) {
                System.out.println("Se te acabaron los intentos. Atributos equilibrados automáticamente.");
                velocidad1 = ataque1 = defensa1 = vida1 = 125;
            }
        } while ((velocidad1 + ataque1 + defensa1 + vida1 > 500 || velocidad1 > 200 || ataque1 > 200 || defensa1 > 200 || vida1 > 200) && intentos1 < 3);

        // -------------------- CREACIÓN JUGADOR 2 --------------------
        System.out.println("\n===  ＣＲＥＡＣＩÓＮ ＤＥＬ ＪＵＧＡＤＯＲ ② ===");
        int velocidad2 = 0, ataque2 = 0, defensa2 = 0, vida2 = 0;
        int intentos2 = 0;

        do {
            System.out.print("Velocidad (0–200): ");
            velocidad2 = sc.nextInt();
            System.out.print("Ataque (0–200): ");
            ataque2 = sc.nextInt();
            System.out.print("Defensa (0–200): ");
            defensa2 = sc.nextInt();
            System.out.print("Vida (0–200): ");
            vida2 = sc.nextInt();
            int total2 = velocidad2 + ataque2 + defensa2 + vida2;
            if (total2 > 500 || velocidad2 > 200 || ataque2 > 200 || defensa2 > 200 || vida2 > 200) {
                intentos2++;
                System.out.println("¡Error! Suma total o atributo fuera de rango. Intento " + intentos2 + "/3\n");
            }
            if (intentos2 == 3) {
                System.out.println(" Se te acabaron los intentos. Atributos equilibrados automáticamente.");
                velocidad2 = ataque2 = defensa2 = vida2 = 125;
            }
        } while ((velocidad2 + ataque2 + defensa2 + vida2 > 500 || velocidad2 > 200 || ataque2 > 200 || defensa2 > 200 || vida2 > 200) && intentos2 < 3);

        int vidaMax1 = vida1;
        int vidaMax2 = vida2;
        int ronda = 1;

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("ＣＯＭＩＥＮＺＡ ＥＬ ＣＯＭＢＡＴＥ ");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        boolean garra1 = false;
        boolean garra2 = false;

        while (vida1 > 0 && vida2 > 0) {
            System.out.println("\nＲＯＮＤＡ " + ronda);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            int longitud = 30;
            int llenos1 = (vida1 * longitud) / vidaMax1;
            int llenos2 = (vida2 * longitud) / vidaMax2;

            System.out.print("Jugador ①: [");
            for (int i = 0; i < longitud; i++) System.out.print(i < llenos1 ? "█" : "░");
            System.out.println("] " + vida1 + "/" + vidaMax1);

            System.out.print("Jugador ②: [");
            for (int i = 0; i < longitud; i++) System.out.print(i < llenos2 ? "█" : "░");
            System.out.println("] " + vida2 + "/" + vidaMax2);

            // TURNO DEL JUGADOR 1
            System.out.println("\nTurno del Jugador ①");
            System.out.println("1️Atacar");
            System.out.println("2️Curar");
            System.out.println("3️Usar objeto");
            System.out.print("→ Elige una opción: ");
            int opcion1 = sc.nextInt();

            if (opcion1 == 1) {
                // Comprobamos si jugador 2 esquiva
                boolean esquiva2 = false;
                if (garra2) {
                    int chance = random.nextInt(100);
                    if (chance < 40) { // 40% de esquivar con garra rápida
                        esquiva2 = true;
                        System.out.println("⚡ ¡Jugador ② esquiva el ataque con velocidad sobrehumana!");
                    }
                }

                int critico1 = random.nextInt(21);
                int danio1 = (esquiva2) ? 0 : ataque1 - (defensa2 / 4) + critico1;
                if (danio1 < 0) danio1 = 0;
                vida2 -= danio1;
                if (vida2 < 0) vida2 = 0;
                System.out.println("Jugador ① causa " + danio1 + " de daño (Crítico +" + critico1 + ")");
            }

            if (opcion1 == 2) {
                int cura1 = 20 + random.nextInt(21);
                vida1 += cura1;
                if (vida1 > vidaMax1) vida1 = vidaMax1;
                System.out.println("Jugador ① se cura +" + cura1 + " puntos de vida.");
            }

            if (opcion1 == 3) {
                System.out.println("Elige un objeto:");
                System.out.println("1️GARRA RÁPIDA (duplica velocidad)");
                int obj = sc.nextInt();
                if (obj == 1 && !garra1) {
                    velocidad1 *= 2;
                    garra1 = true;
                    System.out.println("⚡ Jugador ① usa GARRA RÁPIDA — velocidad duplicada!");
                } else if (garra1) {
                    System.out.println("Ya has usado GARRA RÁPIDA antes.");
                }
            }

            if (vida2 <= 0) break;

            // TURNO DEL JUGADOR 2
            System.out.println("\nTurno del Jugador ②");
            System.out.println("1️Atacar");
            System.out.println("2️Curar");
            System.out.println("3️Usar objeto");
            System.out.print("→ Elige una opción: ");
            int opcion2 = sc.nextInt();

            if (opcion2 == 1) {
                boolean esquiva1 = false;
                if (garra1) {
                    int chance = random.nextInt(100);
                    if (chance < 40) {
                        esquiva1 = true;
                        System.out.println("⚡ ¡Jugador ① esquiva el ataque con velocidad sobrehumana!");
                    }
                }

                int critico2 = random.nextInt(21);
                int danio2 = (esquiva1) ? 0 : ataque2 - (defensa1 / 4) + critico2;
                if (danio2 < 0) danio2 = 0;
                vida1 -= danio2;
                if (vida1 < 0) vida1 = 0;
                System.out.println("Jugador ② causa " + danio2 + " de daño (Crítico +" + critico2 + ")");
            }

            if (opcion2 == 2) {
                int cura2 = 20 + random.nextInt(21);
                vida2 += cura2;
                if (vida2 > vidaMax2) vida2 = vidaMax2;
                System.out.println("Jugador ② se cura +" + cura2 + " puntos de vida.");
            }

            if (opcion2 == 3) {
                System.out.println("Elige un objeto:");
                System.out.println("1️GARRA RÁPIDA (duplica velocidad)");
                int obj2 = sc.nextInt();
                if (obj2 == 1 && !garra2) {
                    velocidad2 *= 2;
                    garra2 = true;
                    System.out.println("⚡ Jugador ② usa GARRA RÁPIDA — velocidad duplicada!");
                } else if (garra2) {
                    System.out.println("Ya has usado GARRA RÁPIDA antes.");
                }
            }

            ronda++;
        }

        System.out.println("\n======================================================================================");
        if (vida1 > vida2) System.out.println("¡ＪＵＧＡＤＯＲ ① ＧＡＮＡ ＥＬ ＣＯＭＢＡＴＥ!");
        else if (vida2 > vida1) System.out.println("¡ＪＵＧＡＤＯＲ ② ＧＡＮＡ ＥＬ ＣＯＭＢＡＴＥ!");
        else System.out.println("¡ＥＭＰＡＴＥ ＥＰＩＣＯ!");
        System.out.println("======================================================================================");

        sc.close();
    }
}
