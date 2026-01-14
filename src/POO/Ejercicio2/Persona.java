package POO.Ejercicio2;

public class Persona {

    private String dni;
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

    public void setDni(String dni) {
        this.dni = dni;
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

    public void mostrar() {
        System.out.println(nombre + " " + apellidos + " | DNI: " + dni + " | Edad: " + edad);
    }

    public boolean isAdult() {
        return edad >= edadAdulta;
    }

    public boolean isRetired() {
        return edad > edadRetiro;
    }

    public int edadDiferente(Persona otra) {
        return Math.abs(this.edad - otra.edad);
    }

    public static boolean validarDNI(String dni) {
        return dni.matches("\\d{8}[A-Za-z]");
    }

    public static boolean validarDNI2(String dni) {
        if (dni == null || dni.length() != 9) {
            return false;
        }

        for (int i = 0; i < 8; i++) {
            char caracter = dni.charAt(i);
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }

        char ultimoCaracter = dni.charAt(8);
        if (!Character.isLetter(ultimoCaracter)) {
            return false;
        }

        return true;
    }
}
