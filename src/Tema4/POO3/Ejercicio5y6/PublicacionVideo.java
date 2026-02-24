package Tema4.POO3.Ejercicio5y6;

public class PublicacionVideo implements PublicacionConReaccion, AbrirPublicacion {
    private String resolucion;

    public PublicacionVideo(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void publicar() {
        System.out.println("[VIDEO] Publicando en " + resolucion);
    }

    @Override
    public void compartir() {
        System.out.println("[VIDEO] Compartiendo enlace del video.");
    }

    @Override
    public void abrir() {
        System.out.println("[VIDEO] Reproduciendo video...");
    }

    @Override
    public void comentar(String texto) {
        System.out.println("[COMENTARIO en Video]: " + texto);
    }
}
