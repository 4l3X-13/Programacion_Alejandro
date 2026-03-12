package Tema7.Ficheros.EjerciciosB.Ejercicio2;

class Alumno {
    String nombre;
    double media;

    Alumno(String n, double m) {
        nombre = n;
        media = m;
    }

    public String toString() {
        return String.format("%s: %.2f", nombre, media);
    }
}