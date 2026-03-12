package Tema7.Ficheros.EjerciciosB.Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioB2 {
    public static void main(String[] args) {
        List<Alumno> lista = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("/home/alenavzaf/IdeaProjects/Programacion_Alejandro_GITHUB_COMPLETO/Archivos_De_Ficheros/alumnos_notas.txt"))) {
            while (sc.hasNextLine()) {
                String[] datos = sc.nextLine().split(" ");
                String nombreCompleto = datos[0] + " " + datos[1];
                double suma = 0;
                for (int i = 2; i < datos.length; i++) suma += Double.parseDouble(datos[i]);
                lista.add(new Alumno(nombreCompleto, suma / (datos.length - 2)));
            }
            lista.sort((a1, a2) -> Double.compare(a2.media, a1.media));
            lista.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        }
    }
}
