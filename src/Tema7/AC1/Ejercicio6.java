package Tema7.AC1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        Path ruta = Paths.get("/home/alenavzaf/IdeaProjects/Programacion_Alejandro/src/Tema7/AC1/Ficheros/personas.dat");
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Alex", 19));
        lista.add(new Persona("Noah", 19));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta.toFile()))) {
            oos.writeObject(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta.toFile()))) {
            ArrayList<Persona> listaLeida = (ArrayList<Persona>) ois.readObject();
            for (Persona p : listaLeida) {
                System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}