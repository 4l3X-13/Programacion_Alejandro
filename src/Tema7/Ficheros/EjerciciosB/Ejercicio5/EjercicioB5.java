package Tema7.Ficheros.EjerciciosB.Ejercicio5;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EjercicioB5 {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("Diccionario"));
        try (BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))) {
            String palabra;
            while ((palabra = br.readLine()) != null) {
                if (!palabra.isEmpty()) {
                    char letra = Character.toUpperCase(palabra.charAt(0));
                    Files.writeString(Paths.get("Diccionario", letra + ".txt"), palabra + System.lineSeparator(),
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                }
            }
        }
    }
}

