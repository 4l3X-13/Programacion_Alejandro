package Tema4.POO3.Ejercicio4;

public class Libro extends Ficha {
    private String autor;
    private String editorial;

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("LIBRO - " + toString() + " | Autor: " + autor + " | Editorial: " + editorial);
    }
}
