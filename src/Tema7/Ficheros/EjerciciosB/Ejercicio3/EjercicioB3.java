package Tema7.Ficheros.EjerciciosB.Ejercicio3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EjercicioB3 {
    static void main() {
        String fileName = "usa_personas_sorted.txt";
        String fileName1 = "/home/alenavzaf/IdeaProjects/Programacion_Alejandro_GITHUB_COMPLETO//src/Tema7/Ficheros/EjerciciosB/Ejercicio3/usa_personas_sorted.txt";
        Path filePath = Paths.get("usa_personas_sorted.txt");

        try {
            //De esta manera cada vez que escribimos, se machaca toda la info que había dentro del fichero
            FileWriter file = new FileWriter("usa_personas_sorted.txt");
            //De esta manera, lo estamos AÑADIENDO al final del fichero
            FileWriter fileAppend = new FileWriter("usa_personas_sorted.txt", true);

            BufferedWriter output = new BufferedWriter(file);
            BufferedWriter outputAppend = new BufferedWriter(fileAppend);
            // Escribimos el String en el fichero
            //Escribimos
            output.write("escribimos con Buffered");
            outputAppend.write("añadimos con Buffered");
            // Cerramos el writer
            output.close();
            outputAppend.close();
            //Leemos

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
