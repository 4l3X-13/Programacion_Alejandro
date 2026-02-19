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

    public void Guau(){
        System.out.println("Guau!!!!");
    }

    public tieneCalle getCalle() {
        return calle;
    }

    public void setCalle(tieneCalle calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "calle=" + calle +
                '}';
    }
}
