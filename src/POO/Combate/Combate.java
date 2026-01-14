package POO.Combate;

import java.util.Random;
import java.util.Scanner;

public class Combate {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static final int VELOCIDAD = 0;
    static final int ATAQUE = 1;
    static final int DEFENSA = 2;
    static final int VIDA = 3;

    static int[] jugador1 = new int[4];
    static int[] jugador2 = new int[4];
    static int vidaMax1;
    static int vidaMax2;

    public static void main(String[] args) {
        mostrarTitulo();
        configurarJugadores();

        vidaMax1 = jugador1[VIDA];
        vidaMax2 = jugador2[VIDA];

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
            atributos[VELOCIDAD] = leerEntero("Velocidad: ", 1, 200);
            atributos[ATAQUE] = leerEntero("Ataque:    ", 1, 200);
            atributos[DEFENSA] = leerEntero("Defensa:   ", 1, 200);
            atributos[VIDA]  = leerEntero("Vida:      ", 1, 200);

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
        int suma = atributos[VELOCIDAD] + atributos[ATAQUE] + atributos[DEFENSA] + atributos[VIDA];
        return suma <= 500;
    }

    static void asignarPorDefecto(int[] atributos) {
        atributos[VELOCIDAD] = 125;
        atributos[ATAQUE] = 125;
        atributos[DEFENSA] = 125;
        atributos[VIDA] = 125;
    }

    static void seleccionarPredefinido(int numeroJugador, int[] atributos) {
        System.out.println("\n--- JUGADOR " + numeroJugador + " ---");
        System.out.println("1. Ofensivo | 2. Defensivo | 3. Equilibrado");
        int clase = leerEntero("Elige clase: ", 1, 3);

        if (clase == 1) {
            atributos[VELOCIDAD] = 100; atributos[ATAQUE] = 200; atributos[DEFENSA] = 80; atributos[VIDA] = 120;
        } else if (clase == 2) {
            atributos[VELOCIDAD] = 60; atributos[ATAQUE] = 80; atributos[DEFENSA] = 200; atributos[VIDA] = 160;
        } else {
            atributos[VELOCIDAD] = 125; atributos[ATAQUE] = 125; atributos[DEFENSA] = 125; atributos[VIDA] = 125;
        }
    }

    static void iniciarBucleCombate() {
        int ronda = 1;
        while (jugador1[VIDA] > 0 && jugador2[VIDA] > 0) {
            System.out.println("\n=== RONDA " + ronda + " ===");
            mostrarBarrasVida();

            if (jugador1[VELOCIDAD] >= jugador2[VELOCIDAD]) {
                procesarTurno(1, jugador1, jugador2, vidaMax1);
                if (jugador2[VIDA] > 0) {
                    procesarTurno(2, jugador2, jugador1, vidaMax2);
                }
            } else {
                procesarTurno(2, jugador2, jugador1, vidaMax2);
                if (jugador1[VIDA] > 0) {
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
        int danioBase = atacante[ATAQUE] - (defensor[DEFENSA] / 3);

        if (danioBase < 5) danioBase = 5;

        boolean esCritico = random.nextInt(100) < 20;
        if (esCritico) {
            danioBase *= 2;
            System.out.print("¡CRÍTICO! ");
        }

        int danioTotal = danioBase + factorAleatorio;

        defensor[VIDA] -= danioTotal;
        if (defensor[VIDA] < 0) defensor[VIDA] = 0;

        System.out.println("Ha causado " + danioTotal + " de daño.");
    }

    static void realizarCura(int[] jugador, int maxVida) {
        int cura = 30 + random.nextInt(21);
        jugador[VIDA] += cura;

        if (jugador[VIDA] > maxVida) {
            jugador[VIDA] = maxVida;
        }
        System.out.println("Se ha recuperado " + cura + " puntos de vida.");
    }

    static void mostrarBarrasVida() {
        dibujarBarra(1, jugador1[VIDA], vidaMax1);
        dibujarBarra(2, jugador2[VIDA], vidaMax2);
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
        if (jugador1[VIDA] > 0) {
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