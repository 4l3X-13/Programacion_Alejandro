package Tema4.POO.POO1.Ejercicio2;

import java.util.Scanner;

public class Persona {
    public static final int EDAD_ADULTA = 18;
    public static final int EDAD_RETIRO = 65;
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public static String validarDNI(String dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Scanner in = new Scanner(System.in);
        System.out.println("dime los numeros del DNI:");
        int numeroDNI = in.nextInt();
        System.out.println("dime la letra del DNI:");
        char letraDNI = in.next().toUpperCase().charAt(0);
        int resto = numeroDNI % 23;

        if (letras[resto] == letraDNI) {
            return "El DNI es correcto";
        } else {
            return "El DNI es incorrecto. La letra debería ser: " + letras[resto];
        }

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
        return edad >= EDAD_ADULTA;
    }

    public boolean isRetired() {
        return edad >= EDAD_RETIRO;
    }

    public int diferenciaEdad(Persona otra) {
        return Math.abs(this.edad - otra.getEdad());
    }
}
