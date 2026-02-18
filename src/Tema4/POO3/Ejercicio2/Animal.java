package Tema4.POO3.Ejercicio2;

public class Animal {
    private String nombre;
    private int edad;
    private String raza;
    private String color;

    public Animal(String nombre, int edad, String raza, String color) {
        this.nombre= nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }
    public Animal() {
        this("Akila",3,"Perro","blanco");
    }
}