package Tema7.Ficheros.EjerciciosB.Ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class EjercicioB7 {
    public static void main(String[] args) throws IOException {
        File archivo = new File("/home/alenavzaf/IdeaProjects/Programacion_Alejandro_GITHUB_COMPLETO/Archivos_De_Ficheros/Libros/quijote_cervantes.txt");
        Scanner lector = new Scanner(archivo);

        int nLineas = 0;
        int nPalabras = 0;
        int nCaracteres = 0;
        HashMap<String, Integer> frecuencia = new HashMap<>();

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            nLineas++;
            nCaracteres += linea.length();

            String[] palabrasEnLinea = linea.toLowerCase().split(" ");
            for (String p : palabrasEnLinea) {
                p = p.replace(",", "").replace(".", "").replace(":", "").replace(";", "").trim();

                if (!p.isEmpty()) {
                    nPalabras++;
                    frecuencia.put(p, frecuencia.getOrDefault(p, 0) + 1);
                }
            }
        }
        lector.close();

        System.out.println("Lineas: " + nLineas);
        System.out.println("Palabras: " + nPalabras);
        System.out.println("Caracteres: " + nCaracteres);

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(frecuencia.entrySet());
        lista.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Las 10palabras mas comunes:");
        for (int i = 0; i < 10 && i < lista.size(); i++) {
            System.out.println(lista.get(i).getKey() + ": " + lista.get(i).getValue());
        }
    }
}