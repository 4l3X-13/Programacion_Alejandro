package POO.Ejercicio2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- PERSONA 1 -");
        System.out.print("Introduce el DNI: ");
        String dni1 = sc.nextLine();

        System.out.print("Introduce el nombre: ");
        String nombre1 = sc.nextLine();

        System.out.print("Introduce los apellidos: ");
        String apellidos1 = sc.nextLine();

        System.out.print("Introduce la edad: ");
        int edad1 = sc.nextInt();
        sc.nextLine();

        Persona persona1 = new Persona(dni1, nombre1, apellidos1, edad1);

        //--------------------------------------------------

        System.out.println("\n- PERSONA 2 -");
        System.out.print("DNI: ");
        String dni2 = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidos2 = sc.nextLine();

        System.out.print("Edad: ");
        int edad2 = sc.nextInt();

        Persona persona2 = new Persona(dni2, nombre2, apellidos2, edad2);

        //--------------------------------------------------

        persona1.print();
        System.out.println("¿Mayor de edad? " + persona1.isAdult());
        System.out.println("¿Jubilado? " + persona1.isRetired());

        persona2.print();
        System.out.println("¿Mayor de edad? " + persona2.isAdult());
        System.out.println("¿Jubilado? " + persona2.isRetired());

        System.out.println("Diferencia de edad: " + persona1.ageDifference(persona2));

        System.out.println("DNI persona 1 válido: " + Persona.validarDNI(dni1));
        System.out.println("DNI persona 2 válido: " + Persona.validarDNI(dni2));

        sc.close();
    }
}
