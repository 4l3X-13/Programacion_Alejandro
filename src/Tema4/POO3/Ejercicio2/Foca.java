package Tema4.POO3.Ejercicio2;

public class Foca extends Animal {
    public boolean aplaude;


    public Foca(String nombre, int edad, String raza, String color, boolean aplaude) {
        super(nombre, edad, raza, color);
        this.aplaude = aplaude;
    }

    public Foca() {
        this("Mateo", 3, "Perro", "blanco", true);
    }

    public void Ough() {
        System.out.println("Ough!!!!");
    }

    public boolean isAplaude() {
        return aplaude;
    }

    public void setAplaude(boolean aplaude) {
        this.aplaude = aplaude;
    }

    @Override
    public String toString() {
        return "Foca{" +
                "aplaude=" + aplaude +
                '}';
    }
}