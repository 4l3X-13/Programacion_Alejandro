package Tema4.POO3.Ejercicio4;

public class Revista extends Ficha {
    private int numPublicacion;
    private int anio;

    public Revista(int numero, String titulo, int numPublicacion, int anio) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.anio = anio;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("REVISTA - " + toString() + " | Edición: " + numPublicacion + " | Año: " + anio);
    }
}
