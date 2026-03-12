package Tema7.Ficheros.EjerciciosB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioB1 {
    static void main() {
        int max = 0;
        int min = 99999999;

        try (BufferedReader br = new BufferedReader(new FileReader("/home/alenavzaf/IdeaProjects/Programacion_Alejandro_GITHUB_COMPLETO/Archivos_De_Ficheros/numeros.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (Integer.parseInt(linea) > max) {

                    max = Integer.parseInt(linea);
                } else if (Integer.parseInt(linea) < min) {
                    min = Integer.parseInt(linea);
                }
            }
            System.out.println("El maximo es:" + max + " y el minimo es:" + min);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
