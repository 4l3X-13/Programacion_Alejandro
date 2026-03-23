package Tema7.Ficheros.EjerciciosB.Ejercicio4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EjercicioB4 {
    static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingresa el número de nombres deseas generar: ");
        int numNom = scan.nextInt();
        scan.nextLine();
        System.out.println("Introduce el nombre del archivo de destino:");
        String usa_nombres = scan.nextLine();
        PrintWriter out = new PrintWriter(new FileWriter(usa_nombres, true));
        List<String> listaNombres = Files.readAllLines(Paths.get("Archivos De Ficheros/usa_nombres.txt"));
        List<String> listaApellidos = Files.readAllLines(Paths.get("Archivos De Ficheros/usa_apellidos.txt"));
        for (int i = 0; i < numNom; i++) {
            String nombreRandom = listaNombres.get(rand.nextInt(listaNombres.size()));
            String apellidoRandom = listaApellidos.get(rand.nextInt(listaApellidos.size()));
            out.println(nombreRandom + " " + apellidoRandom);
        }
        out.close();
    }
}
