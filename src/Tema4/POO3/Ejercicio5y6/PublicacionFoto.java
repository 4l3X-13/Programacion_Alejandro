package Tema4.POO3.Ejercicio5y6;

public class PublicacionFoto implements PublicacionConReaccion, AbrirPublicacion {
    private String nombreArchivo;

    public PublicacionFoto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void publicar() {
        System.out.println("[FOTO] Subiendo: " + nombreArchivo);
    }

    @Override
    public void compartir() {
        System.out.println("[FOTO] Compartiendo imagen.");
    }

    @Override
    public void abrir() {
        System.out.println("[FOTO] Abriendo visor para: " + nombreArchivo);
    }

    @Override
    public void comentar(String texto) {
        System.out.println("[COMENTARIO en Foto]: " + texto);
    }
}
