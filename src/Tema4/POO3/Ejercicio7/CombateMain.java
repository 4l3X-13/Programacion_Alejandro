package Tema4.POO3.Ejercicio7;

import java.util.ArrayList;

public class CombateMain {
    public static void main(String[] args) {
        ArrayList<Ataque> habilidades = new ArrayList<>();

        habilidades.add(new AtaqueMagico());
        habilidades.add(new AtaqueFisico());
        habilidades.add(new AtaqueHibrido());

        System.out.println("=== INICIO DEL TURNO ===\n");

        for (Ataque a : habilidades) {
            a.lanzar();
            System.out.println("Coste: " + a.coste() + " puntos");
            System.out.println("Daño: " + a.dañoInfligido());
            System.out.println("-------------------------");
        }
    }
}