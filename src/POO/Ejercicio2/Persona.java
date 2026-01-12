package POO.Ejercicio2;

public class Persona {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public static final int edadAdulta = 18;
    public static final int edadRetiro = 65;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void print() {
        System.out.println(nombre + " " + apellidos +
                " | DNI: " + dni +
                " | Edad: " + edad);
    }

    public boolean isAdult() {
        return edad >= edadAdulta;
    }

    public boolean isRetired() {
        return edad > edadRetiro;
    }

    public int ageDifference(Persona otra) {
        return Math.abs(this.edad - otra.edad);
    }

    public static boolean validarDNI(String dni) {
        return dni.matches("\\d{8}[A-Za-z]");
    }
}
