package POO.ejercicioPrueba;

public class Persona {

    String nombre;
    int edad;
    final int edadDefecto = 0;


    public Persona() {
        nombre = "Alex";
        edad = 19;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("¡Hola!");
    }

    public void presentarme() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }

    public void saludarA(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    public static void showInfo() {
        System.out.println("Las personas tienen nombre y edad");

    }

    //------------------------------------------//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}

