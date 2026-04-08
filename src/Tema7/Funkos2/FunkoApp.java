package Tema7.Funkos2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoApp {
    static void main() throws IOException {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<Funko> listaFunkos = cargarFunkos();
        int opcion = 0;
        do {
            System.out.println("MENÚ FUNKOS");
            System.out.println("1. AÑADIR FUNKO");
            System.out.println("2. BORRAR FUNKO");
            System.out.println("3. MOSTRAR TODOS LOS FUNKOS");
            System.out.println("4. MOSTRAR FUNKO MAS CARO");
            System.out.println("5. MOSTRAR MEDIA DE PRECIOS DE LOS FUNKOS");
            System.out.println("6. MOSTRAR LOS FUNKOS POR MODELOS");
            System.out.println("7. MOSTRAR LOS FUNKOS DE 2023");
            System.out.println("Introduce la opción que quieras: ");
            opcion = scanner1.nextInt();
            switch (opcion) {
                case 1:
                    anadirFunko(listaFunkos);
                    break;
                case 2:
                    mostrarFunko(listaFunkos);
                    break;


            }
        } while (opcion != 0);


    }

    public static ArrayList<Funko> cargarFunkos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\alecssss\\IdeaProjects\\Programacion_Alejandro\\src\\Tema7\\Funkos2\\funkos.csv"));
        ArrayList<Funko> listaFunkos = new ArrayList<>();
        String linea;
        br.readLine();
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            String codigo = partes[0];
            String nombre = partes[1];
            String modelo = partes[2];
            double precio = Double.parseDouble(partes[3]);
            String fecha_lanzamiento = partes[4];
            Funko funko = new Funko(codigo, nombre, modelo, precio, fecha_lanzamiento);
            listaFunkos.add(funko);
        }
        br.close();
        return listaFunkos;
    }

    public static void anadirFunko(ArrayList<Funko> listaFunkos) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("AÑADIR FUNKO:");
        System.out.println("Introduce el código del Funko: ");
        String codigoUsu = scan.nextLine();
        System.out.println("Introduce el nombre del Funko: ");
        String nombreUsu = scan.nextLine();
        System.out.println("Introduce el modelo del Funko: ");
        String modeloUsu = scan.nextLine();
        System.out.println("Introduce el precio del Funko: ");
        double precioUsu = scan.nextDouble();
        scan.nextLine();
        System.out.println("Introduce la fecha de lanzamiento del Funko: (AAAA-MM--DD)");
        String fechaUsu = scan.nextLine();
        Funko funko = new Funko(codigoUsu, nombreUsu, modeloUsu, precioUsu, fechaUsu);
        listaFunkos.add(funko);

    }

    public static void mostrarFunko(ArrayList<Funko> listaFunkos) {

        for (int i = 0; i < listaFunkos.size(); i++) {
            System.out.println(listaFunkos.get(i));
        }
    }
}
