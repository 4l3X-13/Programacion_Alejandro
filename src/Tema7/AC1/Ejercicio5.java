package Tema7.AC1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio5 {
    public static void main(String[] args) {

        Path ruta = Paths.get("/home/alenavzaf/IdeaProjects/Programacion_Alejandro/src/Tema7/AC1/Ficheros/persona.dat");

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ruta.toFile()))) {

            Persona persona = (Persona) ois.readObject();

            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

