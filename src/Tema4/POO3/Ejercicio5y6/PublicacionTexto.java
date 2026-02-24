package Tema4.POO3.Ejercicio5y6;

public class PublicacionTexto implements PublicacionConReaccion {
    private String contenido;

    public PublicacionTexto(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void publicar() {
        System.out.println("[TEXTO] Publicando: " + contenido);
    }

    @Override
    public void compartir() {
        System.out.println("[TEXTO] Compartiendo texto en el muro.");
    }

    @Override
    public void comentar(String texto) {
        System.out.println("[COMENTARIO en Texto]: " + texto);
    }
}
