package REPASO.Exepciones.Ejercicio7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionGatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        while (listaGatos.size() < 5) {
            try {
                System.out.print("\nIntroduce nombre del gato numero" + (listaGatos.size() + 1) + ": ");
                String nombre = sc.next();
                System.out.print("Introduce edad: ");
                int edad = sc.nextInt();

                listaGatos.add(new Gato(nombre, edad));
                System.out.println("Gato guardado correctamente");
            } catch (InputMismatchException e) {
                System.out.println("Error: La edad debe ser un número entero");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n--- Listado Final de Gatos ---");
        for (Gato gato : listaGatos) gato.imprimir();
        sc.close();
    }
}