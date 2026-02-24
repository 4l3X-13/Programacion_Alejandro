package Tema4.POO3.Ejercicio5;

import java.util.ArrayList;


interface Publicacion {
    void publicar();

    void compartir();
}

interface AbrirPublicacion {
    void abrir();
}


class PublicacionTexto implements Publicacion {
    private String contenido;

    public PublicacionTexto(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void publicar() {
        System.out.println("[TEXTO] Publicando estado: " + contenido);
    }

    @Override
    public void compartir() {
        System.out.println("[TEXTO] Compartiendo texto en el perfil.");
    }
}

class PublicacionFoto implements Publicacion, AbrirPublicacion {
    private String nombreArchivo;

    public PublicacionFoto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void publicar() {
        System.out.println("[FOTO] Subiendo imagen: " + nombreArchivo);
    }

    @Override
    public void compartir() {
        System.out.println("[FOTO] Enviando imagen por mensaje privado.");
    }

    @Override
    public void abrir() {
        System.out.println("[FOTO] Abriendo visor de imagen para: " + nombreArchivo);
    }
}

class PublicacionVideo implements Publicacion, AbrirPublicacion {
    private String resolucion;

    public PublicacionVideo(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void publicar() {
        System.out.println("[VIDEO] Publicando video en calidad " + resolucion);
    }

    @Override
    public void compartir() {
        System.out.println("[VIDEO] Generando enlace de descarga del video.");
    }

    @Override
    public void abrir() {
        System.out.println("[VIDEO] Iniciando reproductor multimedia en " + resolucion);
    }
}


public class RedSocial {
    public static void main(String[] args) {
        ArrayList<Publicacion> muro = new ArrayList<>();

        muro.add(new PublicacionTexto("¡Hoy es un gran día para programar!"));
        muro.add(new PublicacionFoto("vacaciones.jpg"));
        muro.add(new PublicacionVideo("1080p"));

        System.out.println("=== SIMULADOR DE RED SOCIAL ===\n");

        for (Publicacion p : muro) {
            p.publicar();
            p.compartir();

            if (p instanceof AbrirPublicacion) {
                ((AbrirPublicacion) p).abrir();
            }

            System.out.println("-----------------------------------");
        }
    }
}