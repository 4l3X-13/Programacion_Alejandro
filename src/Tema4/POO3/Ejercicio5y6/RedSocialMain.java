package Tema4.POO3.Ejercicio5y6;

import java.util.ArrayList;

public class RedSocialMain {
    public static void main(String[] args) {
        ArrayList<PublicacionConReaccion> muro = new ArrayList<>();

        muro.add(new PublicacionTexto("¡Mi primer post con comentarios!"));
        muro.add(new PublicacionFoto("paisaje.png"));
        muro.add(new PublicacionVideo("720p"));

        System.out.println("=== RED SOCIAL CON REACCIONES ===\n");

        for (PublicacionConReaccion p : muro) {
            p.publicar();
            p.comentar("¡Qué buen contenido!"); // Probamos el nuevo método
            p.compartir();

            if (p instanceof AbrirPublicacion) {
                ((AbrirPublicacion) p).abrir();
            }

            System.out.println("-----------------------------------");
        }
    }
}
