package Tema7.AC1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    static void main() throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/alenavzaf/IdeaProjects/Programacion_Alejandro/src/Tema7/AC1/Ficheros/usuario.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
