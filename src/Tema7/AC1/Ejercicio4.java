package Tema7.AC1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("dime la edad: ");
        int edad = sc.nextInt();

        Persona persona = new Persona(nombre, edad);
        Path dir = Paths.get("/home/alenavzaf/IdeaProjects/Programacion_Alejandro/src/Tema7/AC1/Ficheros/persona.dat");

        try (ObjectOutputStream ois = new ObjectOutputStream(
                new FileOutputStream(dir.toFile()))) {

            ois.writeObject(persona);
            System.out.println("Persona guardada correctamente");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}