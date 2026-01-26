package Tema4.POO.POO1.Combate;

import java.util.Random;
import java.util.Scanner;

public class Combate {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static final int velocidad = 0;
    static final int ataque = 1;
    static final int defensa = 2;
    static final int vida = 3;

    static int[] jugador1 = new int[4];
    static int[] jugador2 = new int[4];
    static int vidaMax1;
    static int vidaMax2;

    public static void main(String[] args) {
        mostrarTitulo();
        configurarJugadores();

        vidaMax1 = jugador1[vida];
        vidaMax2 = jugador2[vida];

        iniciarBucleCombate();
        anunciarGanador();

        scanner.close();
    }

    static void mostrarTitulo() {
        System.out.println("======================================");
        System.out.println("       SIMULADOR DE COMBATE");
        System.out.println("======================================");
    }

    static void configurarJugadores() {
        System.out.println("1. Crear personajes manualmente");
        System.out.println("2. Usar personajes predefinidos");
        int opcion = leerEntero("Elige una opción: ", 1, 2);

        if (opcion == 1) {
            crearJugadorManual(1, jugador1);
            crearJugadorManual(2, jugador2);
        } else {
            seleccionarPredefinido(1, jugador1);
            seleccionarPredefinido(2, jugador2);
        }
    }

    static void crearJugadorManual(int numeroJugador, int[] atributos) {
        System.out.println("\n--- JUGADOR " + numeroJugador + " ---");
        boolean valido;
        int intentos = 0;

        do {
            System.out.println("Introduce atributos (Suma máx 500, individual 1-200)");
            atributos[velocidad] = leerEntero("Velocidad: ", 1, 200);
            atributos[ataque] = leerEntero("Ataque:    ", 1, 200);
            atributos[defensa] = leerEntero("Defensa:   ", 1, 200);
            atributos[vida]  = leerEntero("Vida:      ", 1, 200);

            valido = validarAtributos(atributos);

            if (!valido) {
                intentos++;
                System.out.println("La suma supera 500. Intento " + intentos + "/3");
            }

            if (intentos >= 3) {
                System.out.println("Intentos agotados. Asignando valores por defecto.");
                asignarPorDefecto(atributos);
                valido = true;
            }

        } while (!valido);
    }

    static boolean validarAtributos(int[] atributos) {
        int suma = atributos[velocidad] + atributos[ataque] + atributos[defensa] + atributos[vida];
        return suma <= 500;
    }

    static void asignarPorDefecto(int[] atributos) {
        atributos[velocidad] = 125;
        atributos[ataque] = 125;
        atributos[defensa] = 125;
        atributos[vida] = 125;
    }

    static void seleccionarPredefinido(int numeroJugador, int[] atributos) {
        System.out.println("\n--- JUGADOR " + numeroJugador + " ---");
        System.out.println("1. Ofensivo | 2. Defensivo | 3. Equilibrado");
        int clase = leerEntero("Elige clase: ", 1, 3);

        if (clase == 1) {
            atributos[velocidad] = 100; atributos[ataque] = 200; atributos[defensa] = 80; atributos[vida] = 120;
        } else if (clase == 2) {
            atributos[velocidad] = 60; atributos[ataque] = 80; atributos[defensa] = 200; atributos[vida] = 160;
        } else {
            atributos[velocidad] = 125; atributos[ataque] = 125; atributos[defensa] = 125; atributos[vida] = 125;
        }
    }

    static void iniciarBucleCombate() {
        int ronda = 1;
        while (jugador1[vida] > 0 && jugador2[vida] > 0) {
            System.out.println("\n=== RONDA " + ronda + " ===");
            mostrarBarrasVida();

            if (jugador1[velocidad] >= jugador2[velocidad]) {
                procesarTurno(1, jugador1, jugador2, vidaMax1);
                if (jugador2[vida] > 0) {
                    procesarTurno(2, jugador2, jugador1, vidaMax2);
                }
            } else {
                procesarTurno(2, jugador2, jugador1, vidaMax2);
                if (jugador1[vida] > 0) {
                    procesarTurno(1, jugador1, jugador2, vidaMax1);
                }
            }

            pausa();
            ronda++;
        }
    }

    static void procesarTurno(int numeroJugador, int[] atacante, int[] defensor, int maxVida) {
        System.out.println("\nTurno del Jugador " + numeroJugador);
        System.out.println("1. Atacar | 2. Curarse");
        int accion = leerEntero("Acción: ", 1, 2);

        if (accion == 1) {
            realizarAtaque(atacante, defensor);
        } else {
            realizarCura(atacante, maxVida);
        }
    }

    static void realizarAtaque(int[] atacante, int[] defensor) {
        int factorAleatorio = random.nextInt(15);
        int danioBase = atacante[ataque] - (defensor[defensa] / 3);

        if (danioBase < 5) danioBase = 5;

        boolean esCritico = random.nextInt(100) < 20;
        if (esCritico) {
            danioBase *= 2;
            System.out.print("¡CRÍTICO! ");
        }

        int danioTotal = danioBase + factorAleatorio;

        defensor[vida] -= danioTotal;
        if (defensor[vida] < 0) defensor[vida] = 0;

        System.out.println("Ha causado " + danioTotal + " de daño.");
    }

    static void realizarCura(int[] jugador, int maxVida) {
        int cura = 30 + random.nextInt(21);
        jugador[vida] += cura;

        if (jugador[vida] > maxVida) {
            jugador[vida] = maxVida;
        }
        System.out.println("Se ha recuperado " + cura + " puntos de vida.");
    }

    static void mostrarBarrasVida() {
        dibujarBarra(1, jugador1[vida], vidaMax1);
        dibujarBarra(2, jugador2[vida], vidaMax2);
    }

    static void dibujarBarra(int numero, int vidaActual, int vidaTotal) {
        int longitud = 20;
        int marcas = (vidaActual * longitud) / vidaTotal;

        System.out.print("J" + numero + " [" + vidaActual + "] ");
        for (int i = 0; i < longitud; i++) {
            if (i < marcas) System.out.print("█");
            else System.out.print("-");
        }
        System.out.println();
    }

    static void anunciarGanador() {
        System.out.println("\n*********************************");
        if (jugador1[vida] > 0) {
            System.out.println("    ¡ EL JUGADOR 1 GANA !");
        } else {
            System.out.println("    ¡ EL JUGADOR 2 GANA !");
        }
        System.out.println("*********************************");
    }

    static int leerEntero(String mensaje, int min, int max) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= min && numero <= max) {
                    return numero;
                }
            } else {
                scanner.next();
            }
            System.out.println("Entrada inválida. Debe ser entre " + min + " y " + max);
        }
    }

    static void pausa() {
        System.out.println("(Presiona Enter para continuar...)");
        try {
            System.in.read();
        } catch (Exception e) {}
    }
}