package Tema4.POO3.Ejercicio2;



public class Gato extends  Animal {
    public int vidas;


    public Gato(String nombre, int edad, String raza, String color) {
       super(nombre,edad,raza,color);

    }
    public Gato() {
        this("Akila",3,"Perro","blanco");
    }