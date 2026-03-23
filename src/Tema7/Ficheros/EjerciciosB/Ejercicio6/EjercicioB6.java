package Tema7.Ficheros.EjerciciosB.Ejercicio6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjercicioB6 {
    public static void main(String[] args) throws Exception {
        String pi = new String(Files.readAllBytes(Paths.get("/home/alenavzaf/IdeaProjects/Programacion_Alejandro_GITHUB_COMPLETO/Archivos_De_Ficheros/pi-million.txt")));
        System.out.print("Introduce el número a buscar: ");
        String objetivo = new Scanner(System.in).nextLine();

        boolean encontrado = false;
        for (int i = 0; i <= pi.length() - objetivo.length(); i++) {
            int j = 0;
            while (j < objetivo.length() && pi.charAt(i + j) == objetivo.charAt(j)) j++;
            if (j == objetivo.length()) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El número aparece en pi");
        } else {
            System.out.println("El número no aparece en pi");
        }
    }
}