package Tema5.EjerciciosColecciones1.Ejercicio2;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

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

    @Override
    public String toString() {
        return "Usuario:" + "nombre=" + nombre + ", edad=" + edad;
    }
}
