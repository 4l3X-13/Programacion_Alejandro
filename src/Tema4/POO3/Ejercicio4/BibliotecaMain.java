package Tema4.POO3.Ejercicio4;

import java.util.ArrayList;

public class BibliotecaMain {
    public static void main(String[] args) {
        ArrayList<Ficha> inventario = new ArrayList<>();

        inventario.add(new Libro(101, "Cien años de soledad", "García Márquez", "Sudamericana"));
        inventario.add(new Revista(205, "National Geographic", 542, 2023));
        inventario.add(new DVD(309, "Inception", "Christopher Nolan", 2010, "Ciencia Ficción"));

        System.out.println("--- CATÁLOGO DE LA BIBLIOTECA ---");
        for (Ficha f : inventario) {
            f.imprimirDetalles();
        }
    }
}