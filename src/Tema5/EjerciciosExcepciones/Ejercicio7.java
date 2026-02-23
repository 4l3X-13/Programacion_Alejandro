package Tema5.EjerciciosExcepciones;

import Tema5.EjerciciosExcepciones.Ejercicio6.Gato;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        System.out.println("--- REGISTRO DE 5 GATOS VÁLIDOS ---");

        while (listaGatos.size() < 5) {
            try {
                System.out.println("\nDatos del gato #" + (listaGatos.size() + 1) + ":");

                System.out.print("Nombre (mín. 3 letras): ");
                String nombre = scanner.next();

                System.out.print("Edad: ");
                int edad = scanner.nextInt();

                Gato nuevoGato = new Gato(nombre, edad);
                listaGatos.add(nuevoGato);

                System.out.println("¡Gato añadido correctamente!");

            } catch (InputMismatchException e) {
                System.out.println("Error: La edad debe ser un número entero.");
                scanner.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n--- LISTADO FINAL DE GATOS ---");
        for (Gato g : listaGatos) {
            g.imprimir();
        }

        scanner.close();
    }
}