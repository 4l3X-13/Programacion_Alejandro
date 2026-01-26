package POO.POO1.Ejercicio2;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public static final int EDAD_ADULTA = 18;
    public static final int EDAD_RETIRO = 65;

    public Persona() {}

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void mostrar() {
        System.out.println(nombre + " " + apellidos + " | DNI: " + dni + " | Edad: " + edad);
    }

    public boolean isAdult() {
        return edad >= EDAD_ADULTA;
    }

    public boolean isRetired() {
        return edad >= EDAD_RETIRO;
    }

    public int diferenciaEdad(Persona otra) {
        return Math.abs(this.edad - otra.getEdad());
    }

    public static boolean validarDNI(String dni) {
        return dni != null && dni.matches("\\d{8}[A-Za-z]");
    }
}