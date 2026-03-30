package Tema7.AC1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/alenavzaf/IdeaProjects/Programacion_Alejandro_GITHUB_COMPLETO/src/Tema7/AC1/Ficheros/usuario.txt"))) {
            bw.write("Nombre: " + nombre);
            bw.newLine();
            bw.write("Edad: " + edad);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}

