package Tema4.POO.POO1.Ejercicio2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos dos objetos distintos usando la MISMA clase
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        // Lectura Persona 1
        System.out.println("- PERSONA 1 -");
        System.out.print("Introduce el DNI: ");
        p1.setDni(sc.nextLine());
        System.out.print("Introduce el nombre: ");
        p1.setNombre(sc.nextLine());
        System.out.print("Introduce los apellidos: ");
        p1.setApellidos(sc.nextLine());
        System.out.print("Introduce la edad: ");
        p1.setEdad(sc.nextInt());
        sc.nextLine();

        // Lectura Persona 2
        System.out.println("\n- PERSONA 2 -");
        System.out.print("DNI: ");
        p2.setDni(sc.nextLine());
        System.out.print("Nombre: ");
        p2.setNombre(sc.nextLine());
        System.out.print("Apellidos: ");
        p2.setApellidos(sc.nextLine());
        System.out.print("Edad: ");
        p2.setEdad(sc.nextInt());

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        p1.mostrar();
        System.out.println("Es adulto: " + p1.isAdult());

        p2.mostrar();
        System.out.println("Es adulto: " + p2.isAdult());

        System.out.println("\nDiferencia de edad: " + p1.diferenciaEdad(p2));

        // Validación estática
        System.out.println("DNI 1 válido: " + Persona.validarDNI(p1.getDni()));
        System.out.println("DNI 2 válido: " + Persona.validarDNI(p2.getDni()));

        sc.close();
    }
}