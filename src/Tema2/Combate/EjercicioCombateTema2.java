package Tema2.Combate;

import java.util.Scanner;

public class EjercicioCombateTema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("                                                                                     \uD83C\uDD72\uD83C\uDD7E\uD83C\uDD7C\uD83C\uDD71\uD83C\uDD70\uD83C\uDD83\uD83C\uDD74 \uD83C\uDD70\uD83C\uDD7B\uD83C\uDD74\uD83C\uDD87\n ░░░░░░▄█▀█▄░░░░░░░░░░░░░░░\n" +
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
        System.out.println("");

        System.out.println("                                                                                    ¡¡¡EMPIEZA EL COMBATE!!! ");
        System.out.println("Lo primero será crear tu jugador, pero hay ciertas reglas: \n");
        System.out.println("\uD835\uDCE1\uD835\uDCD4\uD835\uDCD6\uD835\uDCDB\uD835\uDCD0\uD835\uDCE2");
        System.out.println("1. \uD835\uDCDB\uD835\uDCEA \uD835\uDCFC\uD835\uDCFE\uD835\uDCF6\uD835\uDCEA \uD835\uDCED\uD835\uDCEE \uD835\uDCF5\uD835\uDCF8\uD835\uDCFC \uD835\uDCEA\uD835\uDCFD\uD835\uDCFB\uD835\uDCF2\uD835\uDCEB\uD835\uDCFE\uD835\uDCFD\uD835\uDCF8\uD835\uDCFC \uD835\uDCED\uD835\uDCEE \uD835\uDCFE\uD835\uDCF7 \uD835\uDCF3\uD835\uDCFE\uD835\uDCF0\uD835\uDCEA\uD835\uDCED\uD835\uDCF8\uD835\uDCFB \uD835\uDCF7\uD835\uDCF8 \uD835\uDCF9\uD835\uDCF8\uD835\uDCED\uD835\uDCFBá \uD835\uDCFC\uD835\uDCEE\uD835\uDCFB \uD835\uDCFC\uD835\uDCFE\uD835\uDCF9\uD835\uDCEE\uD835\uDCFB\uD835\uDCF2\uD835\uDCF8\uD835\uDCFB \uD835\uDCEA 500\uD835\uDCDF\uD835\uDCE2");
        System.out.println("2. \uD835\uDCD2\uD835\uDCEA\uD835\uDCED\uD835\uDCEA \uD835\uDCFE\uD835\uDCF7\uD835\uDCF8 \uD835\uDCED\uD835\uDCEE \uD835\uDCF5\uD835\uDCF8\uD835\uDCFC \uD835\uDCEA\uD835\uDCFD\uD835\uDCFB\uD835\uDCF2\uD835\uDCEB\uD835\uDCFE\uD835\uDCFD\uD835\uDCF8\uD835\uDCFC \uD835\uDCED\uD835\uDCEE\uD835\uDCEB\uD835\uDCEE \uD835\uDCFD\uD835\uDCEE\uD835\uDCF7\uD835\uDCEE\uD835\uDCFB \uD835\uDCFE\uD835\uDCF7 \uD835\uDCFF\uD835\uDCEA\uD835\uDCF5\uD835\uDCF8\uD835\uDCFB \uD835\uDCEE\uD835\uDCF7\uD835\uDCFD\uD835\uDCFB\uD835\uDCEE 1 \uD835\uDD02 200.");
        System.out.println("\n");

        // ------------------------- CREACIÓN DEL JUGADOR 1 -------------------------
        System.out.println("ENTRANDO AL MENÚ DE CREACIÓN DEL PERSONAJE 1 ....\n");

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC15\uD835\uDC04\uD835\uDC0B\uD835\uDC0E\uD835\uDC02\uD835\uDC08\uD835\uDC03\uD835\uDC00\uD835\uDC03");
        int velocidad1 = sc.nextInt();
        if (velocidad1 > 200 || velocidad1 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            velocidad1 = sc.nextInt();
        }

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC00\uD835\uDC13\uD835\uDC00\uD835\uDC10\uD835\uDC14\uD835\uDC04");
        int ataque1 = sc.nextInt();
        if (ataque1 > 200 || ataque1 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            ataque1 = sc.nextInt();
        }

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC03\uD835\uDC04\uD835\uDC05\uD835\uDC04\uD835\uDC0D\uD835\uDC12\uD835\uDC00");
        int defensa1 = sc.nextInt();
        if (defensa1 > 200 || defensa1 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            defensa1 = sc.nextInt();
        }

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC12 \uD835\uDC0F\uD835\uDC14\uD835\uDC0D\uD835\uDC13\uD835\uDC0E\uD835\uDC12 \uD835\uDC03\uD835\uDC04 \uD835\uDC15\uD835\uDC08\uD835\uDC03\uD835\uDC00");
        int vida1 = sc.nextInt();
        if (vida1 > 200 || vida1 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            vida1 = sc.nextInt();
        }

        // ------------------------- CREACIÓN DEL JUGADOR 2 -------------------------
        System.out.println("ENTRANDO AL MENÚ DE CREACIÓN DEL PERSONAJE 2 ....\n");

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC15\uD835\uDC04\uD835\uDC0B\uD835\uDC0E\uD835\uDC02\uD835\uDC08\uD835\uDC03\uD835\uDC00\uD835\uDC03");
        int velocidad2 = sc.nextInt();
        if (velocidad2 > 200 || velocidad2 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            velocidad2 = sc.nextInt();
        }

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC00\uD835\uDC13\uD835\uDC00\uD835\uDC10\uD835\uDC14\uD835\uDC04");
        int ataque2 = sc.nextInt();
        if (ataque2 > 200 || ataque2 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            ataque2 = sc.nextInt();
        }

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC03\uD835\uDC04\uD835\uDC05\uD835\uDC04\uD835\uDC0D\uD835\uDC12\uD835\uDC00");
        int defensa2 = sc.nextInt();
        if (defensa2 > 200 || defensa2 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            defensa2 = sc.nextInt();
        }

        System.out.println("\uD835\uDC04\uD835\uDC0B\uD835\uDC08\uD835\uDC09\uD835\uDC04 \uD835\uDC13\uD835\uDC14 \uD835\uDC12 \uD835\uDC0F\uD835\uDC14\uD835\uDC0D\uD835\uDC13\uD835\uDC0E\uD835\uDC12 \uD835\uDC03\uD835\uDC04 \uD835\uDC15\uD835\uDC08\uD835\uDC03\uD835\uDC00");
        int vida2 = sc.nextInt();
        if (vida2 > 200 || vida2 < 0) {
            System.out.println("EL VALOR NO ESTÁ EN EL RANGO ESTABLECIDO");
            vida2 = sc.nextInt();
        }

        int vidaMax1 = vida1;
        int vidaMax2 = vida2;

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(" COMIENZA EL COMBATE ");
        System.out.println("--------------------------------------------------------------------------------------");

        int ronda = 1;

        while (vida1 > 0 && vida2 > 0) {
            System.out.println("\n                                                                                 ⓇⓄⓃⒹⒶ " + ronda);
            System.out.println("--------------------------------------------------------------------------------------");

            if (velocidad1 >= velocidad2) {
                int danio1 = ataque1 - (defensa2 / 4);
                if (danio1 < 0) danio1 = 0;
                vida2 -= danio1;
                if (vida2 < 0) vida2 = 0;
                System.out.println("Jugador1 ataca a Jugador2 y causa " + danio1 + " de daño.");

                if (vida2 <= 0) {
                    System.out.println("Jugador2 ha sido derrotado ");
                    break;
                }

                int danio2 = ataque2 - (defensa1 / 4);
                if (danio2 < 0) danio2 = 0;
                vida1 -= danio2;
                if (vida1 < 0) vida1 = 0;
                System.out.println("Jugador2 contraataca y causa " + danio2 + " de daño.");

                if (vida1 <= 0) {
                    System.out.println("Jugador1 ha sido derrotado ");
                    break;
                }

            } else {
                int danio2 = ataque2 - (defensa1 / 4);
                if (danio2 < 0) danio2 = 0;
                vida1 -= danio2;
                if (vida1 < 0) vida1 = 0;
                System.out.println("Jugador2 ataca a Jugador1 y causa " + danio2 + " de daño.");

                if (vida1 <= 0) {
                    System.out.println("Jugador1 ha sido derrotado ");
                    break;
                }

                int danio1 = ataque1 - (defensa2 / 4);
                if (danio1 < 0) danio1 = 0;
                vida2 -= danio1;
                if (vida2 < 0) vida2 = 0;
                System.out.println("Jugador1 contraataca y causa " + danio1 + " de daño.");

                if (vida2 <= 0) {
                    System.out.println("Jugador2 ha sido derrotado ");
                    break;
                }
            }






            // ------------------------- BARRAS DE VIDA -------------------------
            System.out.println("\n  VIDA ACTUAL:");

            // Barra de vida Jugador1
            int longitudBarra = 30;
            int bloquesLlenos1 = (int) ((vida1 / (double) vidaMax1) * longitudBarra);
            StringBuilder barra1 = new StringBuilder();
            for (int i = 0; i < longitudBarra; i++) {
                if (i < bloquesLlenos1) barra1.append("█");
                else barra1.append("░");
            }
            System.out.printf("%-10s: [%s] %d/%d\n", "Jugador1", barra1, vida1, vidaMax1);

            // Barra de vida Jugador2
            int bloquesLlenos2 = (int) ((vida2 / (double) vidaMax2) * longitudBarra);
            StringBuilder barra2 = new StringBuilder();
            for (int i = 0; i < longitudBarra; i++) {
                if (i < bloquesLlenos2) barra2.append("█");
                else barra2.append("░");
            }
            System.out.printf("%-10s: [%s] %d/%d\n", "Jugador2", barra2, vida2, vidaMax2);

            ronda++;
        }

        System.out.println("\n======================================================================================");
        if (vida1 > vida2) {
            System.out.println(" ¡Jugador1 GANA EL COMBATE!");
        } else if (vida2 > vida1) {
            System.out.println(" ¡Jugador2 GANA EL COMBATE!");
        } else {
            System.out.println(" ¡EMPATE!");
        }
        System.out.println("======================================================================================");
    }
}
