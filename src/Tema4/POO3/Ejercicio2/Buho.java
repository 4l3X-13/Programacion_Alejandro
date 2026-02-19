package Tema4.POO3.Ejercicio2;

enum GiroCabeza {
    G180, G270
}

public class Buho extends Animal {
    public GiroCabeza giro;

    public Buho(String nombre, int edad, String raza, String color, GiroCabeza giro) {
        super(nombre, edad, raza, color);
        this.giro = giro;
    }

    public Buho() {
        this("Dani", 20, "Nival", "Blanco", GiroCabeza.G270);
    }

    public void hootHoot() {
        System.out.println("¡Hoot Hoot!");
    }
}