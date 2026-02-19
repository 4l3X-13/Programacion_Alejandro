package Tema4.POO3.Ejercicio2;

enum tieneCalle{
    deCalle, deCasa;
}

public class Perro extends Animal {
    public tieneCalle calle;


    public Perro(String nombre, int edad, String raza, String color, tieneCalle calle) {
        super(nombre, edad, raza, color);
        this.calle = tieneCalle.deCalle;
    }

    public Perro() {
        this("Akila", 3, "Perro", "blanco", tieneCalle.deCasa);
    }
}
