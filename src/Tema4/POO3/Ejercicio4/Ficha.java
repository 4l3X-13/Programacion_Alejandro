package Tema4.POO3.Ejercicio4;

public abstract class Ficha {
    private int numero;
    private String titulo;

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void imprimirDetalles();

    @Override
    public String toString() {
        return "[" + numero + "] " + titulo;
    }
}
