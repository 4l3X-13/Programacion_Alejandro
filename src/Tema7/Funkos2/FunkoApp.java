package Tema7.Funkos2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<Funko> listaFunkos = cargarFunkos();
        int opcion = 0;
        do {
            System.out.println("\nMENÚ FUNKOS");
            System.out.println("1. AÑADIR FUNKO");
            System.out.println("2. BORRAR FUNKO");
            System.out.println("3. MOSTRAR TODOS LOS FUNKOS");
            System.out.println("4. MOSTRAR FUNKO MAS CARO");
            System.out.println("5. MOSTRAR MEDIA DE PRECIOS DE LOS FUNKOS");
            System.out.println("6. MOSTRAR LOS FUNKOS POR MODELOS");
            System.out.println("7. MOSTRAR LOS FUNKOS DE 2023");
            System.out.println("0. SALIR");
            System.out.print("Introduce la opción que quieras: ");
            opcion = scanner1.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("AÑADIR FUNKO: ");
                    anadirFunko(listaFunkos);
                    break;
                case 2:
                    System.out.println("BORRAR FUNKO: ");
                    borrarfunko(listaFunkos);
                    break;
                case 3:
                    System.out.println("MOSTRAR TODOS LOS FUNKOS: ");
                    mostrarTodosFunkos(listaFunkos);
                    break;
                case 4:
                    mostrarFunkoMasCaro(listaFunkos);
                    break;
                case 5:
                    mostrarMediaPrecios(listaFunkos);
                    break;
                case 6:
                    mostrarPorModelos(listaFunkos);
                    break;
                case 7:
                    mostrarFunkos2023(listaFunkos);
                    break;
            }
        } while (opcion != 0);
    }

    public static ArrayList<Funko> cargarFunkos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/alenavzaf/IdeaProjects/Programacion_Alejandro/src/Tema7/Funkos2/funkos.csv"));
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
            listaFunkos.add(new Funko(codigo, nombre, modelo, precio, fecha_lanzamiento));
        }
        br.close();
        return listaFunkos;
    }

    public static void anadirFunko(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el código del Funko: ");
        String codigoUsu = scan.nextLine();
        System.out.println("Introduce el nombre del Funko: ");
        String nombreUsu = scan.nextLine();
        System.out.println("Introduce el modelo del Funko: ");
        String modeloUsu = scan.nextLine();
        System.out.println("Introduce el precio del Funko: ");
        double precioUsu = scan.nextDouble();
        scan.nextLine();
        System.out.println("Introduce la fecha de lanzamiento (AAAA-MM-DD): ");
        String fechaUsu = scan.nextLine();
        listaFunkos.add(new Funko(codigoUsu, nombreUsu, modeloUsu, precioUsu, fechaUsu));
    }

    public static void borrarfunko(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el código del Funko a borrar: ");
        String codigo = scan.nextLine();
        listaFunkos.removeIf(f -> f.getCode().equals(codigo));
    }

    public static void mostrarTodosFunkos(ArrayList<Funko> listaFunkos) {
        for (Funko f : listaFunkos) System.out.println(f);
    }

    public static void mostrarFunkoMasCaro(ArrayList<Funko> listaFunkos) {
        if (listaFunkos.isEmpty()) return;
        Funko caro = listaFunkos.get(0);
        for (Funko f : listaFunkos) if (f.getPrecio() > caro.getPrecio()) caro = f;
        System.out.println("El más caro es: " + caro);
    }

    public static void mostrarMediaPrecios(ArrayList<Funko> listaFunkos) {
        double suma = 0;
        for (Funko f : listaFunkos) suma += f.getPrecio();
        System.out.println("Media de precios: " + (listaFunkos.isEmpty() ? 0 : suma / listaFunkos.size()));
    }

    public static void mostrarPorModelos(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el modelo: ");
        String modelo = scan.nextLine();
        for (Funko f : listaFunkos) if (f.getModelo().equalsIgnoreCase(modelo)) System.out.println(f);
    }

    public static void mostrarFunkos2023(ArrayList<Funko> listaFunkos) {
        for (Funko f : listaFunkos) if (f.getFecha_lanzamiento().startsWith("2023")) System.out.println(f);
    }
}
