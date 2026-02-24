package Tema4.POO3.Ejercicio7;

public class AtaqueMagico implements Ataque {

    @Override
    public void lanzar() {
        System.out.println("¡Lanzando una bola de fuego mágica!");
    }

    @Override
    public int coste() {
        return 20;
    }

    @Override
    public int dañoInfligido() {
        return 50;
    }
}