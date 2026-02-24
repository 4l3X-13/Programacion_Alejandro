package ChuletaExamen2AVA.ChuletaDiana;

import java.util.ArrayList;
import java.util.Random;

public class MainHero {
    public static void main(String[] args) {

        // 1. Herramientas: El dado de las probabilidades
        Random dado = new Random();

        // 2. Creamos a nuestro héroe (usa tu constructor)
        HeroClass miHeroe = new HeroClass("Alex", 1, 100, 100, 0, 30, 10);

        // 3. Creamos la estructura para los enemigos
        ArrayList<HeroClass> horda = new ArrayList<>();

        // 4. ¿Cuántos enemigos vienen? (Entre 1 y 3)
        int numEnemigos = dado.nextInt(3) + 1;
        System.out.println("¡Alerta! Se acercan " + numEnemigos + " enemigos.");

        // Rellenamos la horda con un bucle creacion objeto horda luego individual orco que seria como Miheroe
        for (int i = 0; i < numEnemigos; i++) {
            // Enemigos más débiles que tú
            HeroClass orco = new HeroClass("Orco " + i, 1, 40, 40, 0, 15, 5);
            horda.add(orco);
        }

        // 5. ¡EL BUCLE DE COMBATE!
        // Condición: Mientras yo esté vivo Y queden enemigos en la lista
        while (miHeroe.getHealth() > 0 && horda.size() > 0) {
            System.out.println("\n--- NUEVO TURNO ---");

            // 1. TU ATAQUE (Siempre al primero de la fila)
            miHeroe.attack(horda.get(0));

            // 2. COMPROBAR MUERTE (Usamos horda.get(0) porque 'orco' no existe aquí)
            if (horda.get(0).getHealth() <= 0) {
                System.out.println("¡Has matado al orco!");
                horda.remove(0); // El siguiente orco pasa a ser el número 0
            }

            // 3. EL CONTRAATAQUE (Aquí es donde la 'i' cobra sentido)
            if (horda.size() > 0) {
                // Este bucle dice: "Desde el enemigo 0 hasta el último, que me peguen"
                for (int i = 0; i < horda.size(); i++) {
                    horda.get(i).attack(miHeroe);
                }
            }
        } // Fin del while
        // AQUÍ ES "AL ACABAR" LA LUCHA
        if (miHeroe.getHealth() > 0) { // Solo si sigues vivo tras la pelea

            // Tirada para la Poción (10%) [cite: 50]
            if (dado.nextInt(100) + 1 <= 10) {
                System.out.println("¡Victoria! Registrando los restos encuentras una poción.");
                miHeroe.drinkPotion();
            }

            // Tirada para el Descanso (0.1%)
            if (dado.nextInt(1000) + 1 == 1) {
                System.out.println("El bosque está tranquilo. Te permites un breve descanso.");
                miHeroe.rest();
            }
        }

        // 6. Final del juego objeto creacion objeto y el get curar porque atributo private
        if (miHeroe.getHealth() <= 0) {
            System.out.println("Has muerto... Fin del juego.");
        } else {
            System.out.println("¡Has sobrevivido a la horda!");
        }
    }
}