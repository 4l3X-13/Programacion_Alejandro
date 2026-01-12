package POO.Ejercicio2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce tu DNI: ");
        String dni = sc.nextLine();
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
    }
}
