package Tema7.Ficheros.EjerciciosB.Ejercicio3;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EjercicioB3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo origen: ");
        String archivoOrig = sc.nextLine();

        System.out.println("Introduce el nombre del archivo destino: ");
        String archivoDest = sc.nextLine();

        try {
            Scanner scanner = new Scanner(new File(archivoOrig));
            List<String> lineas = new ArrayList<>();
            while (scanner.hasNextLine()) {
                lineas.add(scanner.nextLine());
            }
            Collections.sort(lineas);
            PrintWriter out = new PrintWriter(archivoDest);
            for (String s : lineas) {
                out.println(s);
            }
            out.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}