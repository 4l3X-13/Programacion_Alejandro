package POO.Ejercicio2;

public class Persona2 {

    private String dni1;
    private String nombre1;
    private String apellidos1;
    private int edad1;
    private String dni2;
    private String nombre2;
    private String apellidos2;
    private int edad2;

    public static final int edadAdulta = 18;
    public static final int edadRetiro = 65;

    public void Persona1(String dni1, String nombre1, String apellidos1, int edad1) {
        this.dni1 = dni1;
        this.nombre1 = nombre1;
        this.apellidos1 = apellidos1;
        this.edad1 = edad1;
    }

    public void Persona2(String dni2, String nombre2, String apellidos2, int edad2) {
        this.dni2 = dni2;
        this.nombre2 = nombre2;
        this.apellidos2 = apellidos2;
        this.edad2 = edad2;
    }


    public String getDni1() {
        return dni1;
    }

    public void setDni1(String dni1) {
        this.dni1 = dni1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getApellidos1() {
        return apellidos1;
    }

    public void setApellidos1(String apellidos1) {
        this.apellidos1 = apellidos1;
    }

    public int getEdad1() {
        return edad1;
    }

    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }

    public String getDni2() {
        return dni2;
    }

    public void setDni2(String dni2) {
        this.dni2 = dni2;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellidos2() {
        return apellidos2;
    }

    public void setApellidos2(String apellidos2) {
        this.apellidos2 = apellidos2;
    }

    public int getEdad2() {
        return edad2;
    }

    public void setEdad2(int edad2) {
        this.edad2 = edad2;
    }

    public void mostrar() {
        System.out.println(nombre1 + " " + apellidos1 + " | DNI: " + dni1 + " | Edad: " + edad1);
    }

    public boolean isAdult() {
        return edad1 >= edadAdulta;
    }

    public boolean isRetired() {
        return edad1 > edadRetiro;
    }

    public int edadDiferente(Persona2 otra) {
        return Math.abs(this.edad1 - otra.edad1);
    }

    public static boolean validarDNI(String dni) {
        return dni.matches("\\d{8}[A-Za-z]");
    }
}
