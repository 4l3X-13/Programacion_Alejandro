package POO.Ejercicio2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- PERSONA 1 -");
        Persona2 persona21 = new Persona2();
        System.out.print("Introduce el DNI: ");
        persona21.setDni1(sc.next());
        System.out.print("Introduce el nombre: ");
        persona21.setNombre1(sc.next());

        System.out.print("Introduce los apellidos: ");
        persona21.setApellidos1(sc.next());
        System.out.print("Introduce la edad: ");
        persona21.setEdad1(sc.nextInt());
        sc.nextLine();


        //--------------------------------------------------//

        System.out.println("\n- PERSONA 2 -");
        Persona2 persona2 = new Persona2();
        System.out.print("DNI: ");
        persona2.setDni2(sc.next());

        System.out.print("Nombre: ");
        persona2.setNombre2(sc.next());


        System.out.print("Apellidos: ");
        persona2.setApellidos2(sc.next());

        System.out.print("Edad: ");
        persona2.setEdad2(sc.nextInt());

        //---------------------------------------------------//

        System.out.println("\n");
        persona21.mostrar();
        System.out.println("¿Mayor de edad? " + persona21.isAdult());
        System.out.println("¿Jubilado? " + persona21.isRetired());
        System.out.println("\n");

        persona2.mostrar();
        System.out.println("¿Mayor de edad? " + persona2.isAdult());
        System.out.println("¿Jubilado? " + persona2.isRetired());
        System.out.println("\n");

        System.out.println("Diferencia de edad: " + persona21.edadDiferente(persona2));
        System.out.println("\n");

        System.out.println("DNI persona 1 válido: " + Persona2.validarDNI(persona21.getDni1()));
        System.out.println("DNI persona 2 válido: " + Persona2.validarDNI(persona2.getDni1()));

        sc.close();
    }
}
