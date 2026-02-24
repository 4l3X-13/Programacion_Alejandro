package Tema4.POO3.Ejercicio4;

public class DVD extends Ficha {
    private String director;
    private int anio;
    private String tipo;

    public DVD(int numero, String titulo, String director, int anio, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("DVD - " + toString() + " | Director: " + director + " (" + anio + ") | Género: " + tipo);
    }
}
