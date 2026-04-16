package Tema7.AC1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    static void main() throws FileNotFoundException {
        int palabras = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("/home/alenavzaf/IdeaProjects/Programacion_Alejandro/src/Tema7/AC1/Ficheros/usuario.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                for (String palabra : linea.split(" ")) {
                    palabras ++;
                }
            }
            System.out.println("Tiene " + palabras + " palabras.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

