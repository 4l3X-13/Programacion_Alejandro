package Tema4.POO3.Ejercicio2;


public class Gato extends Animal {
    public int vidas;


    public Gato(String nombre, int edad, String raza, String color, int vidas) {
        super(nombre, edad, raza, color);
        this.vidas = vidas;
    }

    public Gato() {
        this("Garfield", 1, "Gato", "naranja", 7);
    }


    public void miau(){
        System.out.println("Miau!!!!");
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "vidas=" + vidas +
                '}';
    }
}
