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
        System.out.println("Cada jugador tiene 500 puntos a repartir entre velocidad, ataque, defensa y vida (máx. 200 cada uno).");
        System.out.println("Si fallas tres veces, tus puntos se reparten automáticamente de forma balanceada.\n");

        // -------------------- MENÚ DE SELECCIÓN --------------------
        System.out.println("Elige modo de personaje:");
        System.out.println("1. Crear tu propio personaje");
        System.out.println("2. Usar personaje predeterminado");
        int modo = sc.nextInt();

        int velocidad1 = 0, ataque1 = 0, defensa1 = 0, vida1 = 0;
        int velocidad2 = 0, ataque2 = 0, defensa2 = 0, vida2 = 0;

        switch (modo) {
            case 2:
                // -------------------- PERSONAJES PREDETERMINADOS --------------------
                System.out.println("Personajes disponibles:");
                System.out.println("1. Guerrero Furia (Enfoque en ATAQUE)");
                System.out.println("2. Defensor de Hierro (Enfoque en DEFENSA)");
                System.out.println("3. Titán de Sangre (Enfoque en VIDA)");
                System.out.println("4. Relámpago (Enfoque en VELOCIDAD)");

                System.out.print("Jugador ① elige (1–4): ");
                int p1 = sc.nextInt();
                switch (p1) {
                    case 1:
                        velocidad1 = 80;
                        ataque1 = 200;
                        defensa1 = 100;
                        vida1 = 120;
                        break;
                    case 2:
                        velocidad1 = 60;
                        ataque1 = 80;
                        defensa1 = 200;
                        vida1 = 160;
                        break;
                    case 3:
                        velocidad1 = 50;
                        ataque1 = 70;
                        defensa1 = 120;
                        vida1 = 200;
                        break;
                    case 4:
                        velocidad1 = 200;
                        ataque1 = 100;
                        defensa1 = 80;
                        vida1 = 120;
                        break;
                    default:
                        System.out.println("Opción no válida. Se usará personaje por defecto.");
                }

                System.out.print("Jugador ② elige (1–4): ");
                int p2 = sc.nextInt();
                switch (p2) {
                    case 1:
                        velocidad2 = 80;
                        ataque2 = 200;
                        defensa2 = 100;
                        vida2 = 120;
                        break;
                    case 2:
                        velocidad2 = 60;
                        ataque2 = 80;
                        defensa2 = 200;
                        vida2 = 160;
                        break;
                    case 3:
                        velocidad2 = 50;
                        ataque2 = 70;
                        defensa2 = 120;
                        vida2 = 200;
                        break;
                    case 4:
                        velocidad2 = 200;
                        ataque2 = 100;
                        defensa2 = 80;
                        vida2 = 120;
                        break;
                    default:
                        System.out.println("Opción no válida. Se usará personaje por defecto.");
                }
                break;

            case 1:
                // -------------------- CREACIÓN DE PERSONAJES --------------------
                System.out.println("=== ＣＲＥＡＣＩÓＮ ＤＥＬ ＪＵＧＡＤＯＲ ① ===");
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
                        System.out.println("¡Error! Suma total o atributo fuera de rango. Intento " + intentos1 + "/3\n");
                    }
                    if (intentos1 == 3) {
                        System.out.println("Se te acabaron los intentos. Atributos equilibrados automáticamente.");
                        velocidad1 = ataque1 = defensa1 = vida1 = 125;
                    }
                } while ((velocidad1 + ataque1 + defensa1 + vida1 > 500 || velocidad1 > 200 || ataque1 > 200 || defensa1 > 200 || vida1 > 200) && intentos1 < 3);

                System.out.println("\n=== ＣＲＥＡＣＩÓＮ ＤＥＬ ＪＵＧＡＤＯＲ ② ===");
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
                        System.out.println("Se te acabaron los intentos. Atributos equilibrados automáticamente.");
                        velocidad2 = ataque2 = defensa2 = vida2 = 125;
                    }
                } while ((velocidad2 + ataque2 + defensa2 + vida2 > 500 || velocidad2 > 200 || ataque2 > 200 || defensa2 > 200 || vida2 > 200) && intentos2 < 3);
                break;

            default:
                System.out.println("Opción inválida. Cerrando juego.");
                sc.close();
                return;
        }

        // -------------------- INICIO COMBATE --------------------
        int vidaMax1 = vida1;
        int vidaMax2 = vida2;
        int ronda = 1;
        boolean garra1 = false;
        boolean garra2 = false;

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("ＣＯＭＩＥＮＺＡ ＥＬ ＣＯＭＢＡＴＥ ");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        int primerJugador = (velocidad2 > velocidad1) ? 2 : 1;

        while (vida1 > 0 && vida2 > 0) {
            System.out.println("\nＲＯＮＤＡ " + ronda);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            int longitud = 50;
            int llenos1 = (vida1 * longitud) / vidaMax1;
            int llenos2 = (vida2 * longitud) / vidaMax2;

            System.out.print("Jugador ①: ");
            for (int i = 0; i < longitud; i++) System.out.print(i < llenos1 ? "█" : "░");
            System.out.println(" " + vida1 + "/" + vidaMax1);

            System.out.print("Jugador ②: ");
            for (int i = 0; i < longitud; i++) System.out.print(i < llenos2 ? "█" : "░");
            System.out.println(" " + vida2 + "/" + vidaMax2);

            for (int turno = 1; turno <= 2; turno++) {
                int atacante = (turno == 1) ? primerJugador : (primerJugador == 1 ? 2 : 1);

                int vidaAtacante = (atacante == 1) ? vida1 : vida2;
                int vidaDefensor = (atacante == 1) ? vida2 : vida1;
                int ataque = (atacante == 1) ? ataque1 : ataque2;
                int defensa = (atacante == 1) ? defensa2 : defensa1;
                boolean garra = (atacante == 1) ? garra1 : garra2;

                System.out.println("\nTurno del Jugador " + atacante);
                System.out.println("1️Atacar");
                System.out.println("2️Curar");
                System.out.println("3️Usar objeto");
                System.out.print("→ Elige una opción: ");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        boolean esquiva = false;
                        if (garra && random.nextInt(100) < 40) {
                            esquiva = true;
                            System.out.println("⚡ ¡Esquiva el ataque con velocidad sobrehumana!");
                        }
                        int critico = random.nextInt(21);
                        int danio = (esquiva) ? 0 : ataque - (defensa / 4) + critico;
                        if (danio < 0) danio = 0;
                        vidaDefensor -= danio;
                        if (vidaDefensor < 0) vidaDefensor = 0;
                        System.out.println("Causa " + danio + " de daño (Crítico +" + critico + ")");
                        break;

                    case 2:
                        int cura = 20 + random.nextInt(21);
                        vidaAtacante += cura;
                        if (vidaAtacante > (atacante == 1 ? vidaMax1 : vidaMax2))
                            vidaAtacante = (atacante == 1 ? vidaMax1 : vidaMax2);
                        System.out.println("Se cura +" + cura + " puntos de vida.");
                        break;

                    case 3:
                        System.out.println("Elige un objeto:");
                        System.out.println("1️GARRA RÁPIDA (duplica velocidad)");
                        int obj = sc.nextInt();
                        switch (obj) {
                            case 1:
                                if (!garra) {
                                    if (atacante == 1) {
                                        velocidad1 *= 2;
                                        garra1 = true;
                                    } else {
                                        velocidad2 *= 2;
                                        garra2 = true;
                                    }
                                    System.out.println("⚡ GARRA RÁPIDA — velocidad duplicada!");
                                } else {
                                    System.out.println("Ya has usado GARRA RÁPIDA antes.");
                                }
                                break;
                            default:
                                System.out.println("Objeto no válido.");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Opción inválida. Pierdes el turno.");
                        break;
                }

                if (atacante == 1) vida1 = vidaAtacante;
                else vida2 = vidaAtacante;
                if (atacante == 1) vida2 = vidaDefensor;
                else vida1 = vidaDefensor;

                if (vida1 <= 0 || vida2 <= 0) turno = 3;
            }
            ronda++;
        }

        System.out.println("\n======================================================================================");
        if (vida1 > vida2) System.out.println("¡ＪＵＧＡＤＯＲ ① ＧＡＮＡ!");
        else if (vida2 > vida1) System.out.println("¡ＪＵＧＡＤＯＲ ② ＧＡＮＡ!");
        else System.out.println("¡ＥＭＰＡＴＥ!");
        System.out.println("======================================================================================");

        sc.close();
    }
}
