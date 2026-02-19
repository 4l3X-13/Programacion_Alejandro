package Tema4.POO3.Ejercicio2;

enum Sexo {
    hembra, macho
}

public class Leon extends Animal {
    public Sexo sexo;

    public Leon(String nombre, int edad, String raza, String color, Sexo sexo) {
        super(nombre, edad, raza, color);
        this.sexo = sexo;
    }

    public Leon() {
        this("Mahula", 13, "Leon", "amarillo", Sexo.hembra);
    }

    public void Roar() {
        System.out.println("Roar!!!!");
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Leon{" +
                "sexo=" + sexo +
                '}';
    }
}