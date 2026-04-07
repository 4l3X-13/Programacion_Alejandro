package Tema7.Funkos;

import java.io.*;
import java.util.*;

public class FunkoApp {
    private ArrayList<Funko> listaFunkos = new ArrayList<>();
    private final String ARCHIVO_CSV = "funkos.csv";
    private final String ARCHIVO_BIN = "funkos.dat";


    public void loadFunkos() {
        listaFunkos.clear();
        try (Scanner sc = new Scanner(new File(ARCHIVO_CSV))) {
            if (sc.hasNextLine()) sc.nextLine(); // Saltamos el encabezado
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] datos = linea.split(",");
                Funko f = new Funko(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]), datos[4]);
                listaFunkos.add(f);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo CSV.");
        }
    }

    public void saveFunkos() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO_CSV))) {
            pw.println("COD,NOMBRE,MODELO,PRECIO,FECHA");
            for (Funko f : listaFunkos) {
                pw.println(f.getCode() + "," + f.getNombre() + "," + f.getModelo() + "," + f.getPrecio() + "," + f.getFecha());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en CSV: " + e.getMessage());
        }
    }


    public void guardarBinario() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_BIN))) {
            oos.writeObject(listaFunkos);
        } catch (IOException e) {
            System.out.println("Error al serializar.");
        }
    }

    public void cargarBinario() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_BIN))) {
            listaFunkos = (ArrayList<Funko>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No se pudo cargar el archivo binario.");
        }
    }


    public void addFunko(Funko f) {
        listaFunkos.add(f);
    }

    public void deleteFunko(String code) {
        for (int i = 0; i < listaFunkos.size(); i++) {
            if (listaFunkos.get(i).getCode().equalsIgnoreCase(code)) {
                listaFunkos.remove(i);
                break;
            }
        }
    }

    public void mostrarTodos() {
        for (Funko f : listaFunkos) {
            System.out.println(f);
        }
    }

    public void mostrarMasCaro() {
        if (listaFunkos.isEmpty()) return;
        Funko caro = listaFunkos.get(0);
        for (Funko f : listaFunkos) {
            if (f.getPrecio() > caro.getPrecio()) {
                caro = f;
            }
        }
        System.out.println("El Funko más caro es: " + caro);
    }

    public void mostrarMediaPrecio() {
        if (listaFunkos.isEmpty()) return;
        double suma = 0;
        for (Funko f : listaFunkos) {
            suma += f.getPrecio();
        }
        System.out.println("La media de precio es: " + (suma / listaFunkos.size()));
    }

    public void mostrarPorModelos() {
        ArrayList<String> modelos = new ArrayList<>();
        for (Funko f : listaFunkos) {
            if (!modelos.contains(f.getModelo())) {
                modelos.add(f.getModelo());
            }
        }
        for (String m : modelos) {
            System.out.println("Modelo: " + m);
            for (Funko f : listaFunkos) {
                if (f.getModelo().equals(m)) {
                    System.out.println(" - " + f.getNombre());
                }
            }
        }
    }

    public void mostrarFunkos2023() {
        System.out.println("Funkos del año 2023:");
        for (Funko f : listaFunkos) {
            if (f.getFecha().contains("2023")) {
                System.out.println(f);
            }
        }
    }
}