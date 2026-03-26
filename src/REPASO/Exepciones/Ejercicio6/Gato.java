package REPASO.Exepciones.Ejercicio6;

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
        if (nombre == null || nombre.length() < 3)
            throw new Exception("Error, el nombre debe tener al menos 3 caracteres");
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) throw new Exception("Error, la edad no puede ser menor a 0");
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Gato -> Nombre: " + nombre + ", edad: " + edad);
    }
}