package Tema7.Ficheros.EjerciciosB.Ejercicio3;

import java.io.IOException;
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
            //Escribe contenido al fichero, borrando todo lo que haya
            Files.writeString(filePath, "Aquí escribo borrando todo el contendio anterior");
            //Escribe contenido al fichero, añadiendolo al final del mismo
            Files.writeString(filePath, "Aquí escribo añadiendo al final", StandardOpenOption.APPEND);

            //Verify file content
            String content = Files.readString(filePath);

            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
