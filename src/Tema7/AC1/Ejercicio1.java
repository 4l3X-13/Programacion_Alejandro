package Tema7.AC1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/alenavzaf/IdeaProjects/Programacion_Alejandro_GITHUB_COMPLETO/src/Tema7/AC1/Ficheros/usuario.txt"))) {


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

