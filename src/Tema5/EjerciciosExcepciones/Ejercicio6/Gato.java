package Tema5.EjerciciosExcepciones.Ejercicio6;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3) {
            throw new Exception("Error: El nombre '" + nombre + "' es demasiado corto (mínimo 3 caracteres).");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("Error: La edad " + edad + " no puede ser negativa.");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Gato [Nombre: " + nombre + ", Edad: " + edad + "]");
    }
}