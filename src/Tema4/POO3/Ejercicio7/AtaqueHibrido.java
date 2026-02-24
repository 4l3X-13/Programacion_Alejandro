package Tema4.POO3.Ejercicio7;

public class AtaqueHibrido implements Ataque {

    @Override
    public void lanzar() {
        System.out.println("¡Imbuyendo la espada en energía para un golpe rúnico!");
    }

    @Override
    public int coste() {
        return 15 + 15;
    }

    @Override
    public int dañoInfligido() {
        return 40 + 40;
    }
}
