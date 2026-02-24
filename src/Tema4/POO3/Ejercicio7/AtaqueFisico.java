package Tema4.POO3.Ejercicio7;

public class AtaqueFisico implements Ataque {

    @Override
    public void lanzar() {
        System.out.println("¡Realizando un tajo con la espada!");
    }

    @Override
    public int coste() {
        return 10;
    }

    @Override
    public int dañoInfligido() {
        return 35;
    }
}
