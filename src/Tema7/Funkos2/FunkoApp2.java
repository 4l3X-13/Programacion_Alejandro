package Tema7.Funkos2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoApp2 {
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
            System.out.println("7. SERIALIZAR FUNKOS");
            System.out.println("8. MOSTRAR LOS FUNKOS DE 2023");
            System.out.println("0. SALIR");
            System.out.print("Introduce la opción que quieras: ");
            opcion = scanner1.nextInt();    // Leemos la opción que elige el usuario
            switch (opcion) {
                case 1:
                    System.out.println("AÑADIR FUNKO: ");
                    anadirFunko(listaFunkos);           // Llama al método que añade un funko a la lista
                    break;
                case 2:
                    System.out.println("BORRAR FUNKO: ");
                    borrarfunko(listaFunkos);           // Llama al método que borra un funko de la lista
                    break;
                case 3:
                    System.out.println("MOSTRAR TODOS LOS FUNKOS: ");
                    mostrarTodosFunkos(listaFunkos);    // Llama al método que imprime todos los funkos
                    break;
                case 4:
                    System.out.println("MOSTRAR FUNKO MAS CARO: ");
                    mostrarFunkoMasCaro(listaFunkos);   // Llama al método que muestra el funko más caro
                    break;
                case 5:
                    System.out.println("MOSTRAR MEDIA PRECIOS: ");
                    mostrarMediaPrecios(listaFunkos);   // Llama al método que calcula y muestra la media de precios
                    break;
                case 6:
                    System.out.println("MOSTRAR LOS FUNKOS POR MODELOS: ");
                    mostrarPorModelos(listaFunkos);     // Llama al método que filtra los funkos por modelo
                    break;

                case 7:
                    System.out.println("SERIALIZAR FUNKOS: ");
                    serializarFunkos(listaFunkos);
                    break;
                case 8:
                    System.out.println("MOSTRAR LOS FUNKOS DE 2023: ");
                    mostrarFunkos2023(listaFunkos);     // Llama al método que muestra los funkos del año 2023
                    break;
            }
        } while (opcion != 0);

        serializarFunkos(listaFunkos); // Al salir, guardamos el estado actual de la lista en el CSV
        System.out.println("¡Datos guardados correctamente en el CSV!");
    }

    // Lee un CSV donde cada línea es un funko y los guarda en un ArrayList<Funko>
    public static ArrayList<Funko> cargarFunkos() throws IOException {
        // Abrimos el archivo CSV con BufferedReader para leerlo línea a línea
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\alex\\IdeaProjects\\Programacion_Alejandro\\src\\Tema7\\Funkos2\\funkos.csv"));
        ArrayList<Funko> listaFunkos = new ArrayList<>();   // Creamos la lista vacía donde guardaremos los funkos
        String linea;                                        // Variable auxiliar para almacenar cada línea leída
        br.readLine();  // Consumimos la primera línea (cabecera) para no procesarla como un funko
        while ((linea = br.readLine()) != null) {           // Leemos línea a línea hasta llegar al final del archivo
            String[] partes = linea.split(",");             // Separamos cada campo del funko usando la coma como delimitador
            String codigo = partes[0];                      // El primer campo es el código del funko
            String nombre = partes[1];                      // El segundo campo es el nombre del funko
            String modelo = partes[2];                      // El tercer campo es el modelo del funko
            double precio = Double.parseDouble(partes[3]);  // El cuarto campo es el precio (lo convertimos a double)
            String fecha_lanzamiento = partes[4];           // El quinto campo es la fecha de lanzamiento
            listaFunkos.add(new Funko(codigo, nombre, modelo, precio, fecha_lanzamiento)); // Creamos el funko y lo añadimos a la lista
        }
        br.close();         // Cerramos el BufferedReader para liberar recursos
        return listaFunkos; // Devolvemos la lista con todos los funkos cargados
    }

    // Guarda el contenido actual de listaFunkos en el CSV, sobreescribiendo los datos anteriores
    public static void serializarFunkos(ArrayList<Funko> listaFunkos) {
        String ruta = "C:\\Users\\alex\\IdeaProjects\\Programacion_Alejandro\\src\\Tema7\\Funkos2\\funkos.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(listaFunkos);
        } catch (IOException exception) {
            System.out.println("Error al escribir el funko");
        }
        System.out.println("Funkos serializados correcamente.");
    }

    // Pide al usuario que escriba los parámetros del funko que quiere añadir y lo añade a listaFunkos
    public static void anadirFunko(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);  // Scanner local para leer los datos del nuevo funko
        System.out.println("Introduce el código del Funko: ");
        String codigoUsu = scan.nextLine();     // Leemos el código que introduce el usuario
        System.out.println("Introduce el nombre del Funko: ");
        String nombreUsu = scan.nextLine();     // Leemos el nombre que introduce el usuario
        System.out.println("Introduce el modelo del Funko: ");
        String modeloUsu = scan.nextLine();     // Leemos el modelo que introduce el usuario
        System.out.println("Introduce el precio del Funko: ");
        double precioUsu = scan.nextDouble();   // Leemos el precio que introduce el usuario (como double)
        scan.nextLine();                        // Consumimos el salto de línea que queda en el buffer tras nextDouble()
        System.out.println("Introduce la fecha de lanzamiento (AAAA-MM-DD): ");
        String fechaUsu = scan.nextLine();      // Leemos la fecha que introduce el usuario
        listaFunkos.add(new Funko(codigoUsu, nombreUsu, modeloUsu, precioUsu, fechaUsu)); // Creamos el funko con los datos del usuario y lo añadimos a la lista
    }

    // Pide al usuario el código del funko que quiere borrar y lo elimina de listaFunkos
    public static void borrarfunko(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);  // Scanner local para leer el código del funko a borrar
        System.out.println("Introduce el código del Funko a borrar: ");
        String codigo = scan.nextLine();        // Leemos el código introducido por el usuario
        // removeIf recorre todos los elementos del ArrayList y elimina aquellos que cumplan la condición lambda (->)
        //listaFunkos.removeIf(f -> f.getCode().equals(codigo)); // Elimina el funko cuyo código coincide con el introducido por el usuario
        //OTRA FORMA
        for (int i = 0; i < listaFunkos.size(); i++) {
            if (listaFunkos.get(i).getCode().equalsIgnoreCase(codigo)) {
                listaFunkos.remove(i);
                System.out.println("Funko borrado exitosamente!");
            }
            break;
        }

    }

    // Imprime por pantalla todos los funkos de listaFunkos
    public static void mostrarTodosFunkos(ArrayList<Funko> listaFunkos) {
        for (Funko f : listaFunkos) System.out.println(f); // Recorre la lista e imprime cada funko (usa su toString())
    }

    // Busca y muestra el funko más caro de listaFunkos
    public static void mostrarFunkoMasCaro(ArrayList<Funko> listaFunkos) {
        if (listaFunkos.isEmpty()) return;          // Si la lista está vacía, salimos sin hacer nada
        Funko caro = listaFunkos.get(0);            // Tomamos el primer funko como el más caro provisionalmente
        for (Funko f : listaFunkos)                 // Recorremos toda la lista comparando precios
            if (f.getPrecio() > caro.getPrecio())   // Si encontramos uno más caro que el actual "campeón"...
                caro = f;                           // ...lo actualizamos como el nuevo más caro
        System.out.println("El más caro es: " + caro); // Mostramos el funko más caro encontrado
    }

    // Calcula y muestra la media de precios de todos los funkos de listaFunkos
    public static void mostrarMediaPrecios(ArrayList<Funko> listaFunkos) {
        double suma = 0;
        for (int i = 0; i < listaFunkos.size(); i++) {
            suma += listaFunkos.get(i).getPrecio();
        }

        double media;
        if (listaFunkos.isEmpty()) {
            media = 0;  // Si la lista está vacía, la media es 0 (evitamos dividir entre 0)
        } else {
            media = suma / listaFunkos.size(); // Dividimos la suma total entre el número de funkos
        }

        // String.format("%.2f", media) convierte el double a String con solo 2 decimales
        System.out.println("Media de precios: " + String.format("%.2f", media) + "€");
    }

    // Filtra y muestra los funkos que coincidan con el modelo introducido por el usuario
    public static void mostrarPorModelos(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);  // Scanner local para leer el modelo buscado
        System.out.print("Introduce el modelo: ");
        String modelo = scan.nextLine();        // Leemos el modelo que introduce el usuario
        for (Funko f : listaFunkos)                                 // Recorremos toda la lista
            if (f.getModelo().equalsIgnoreCase(modelo))             // Si el modelo coincide (sin distinguir mayúsculas/minúsculas)...
                System.out.println(f);                              // ...mostramos ese funko
    }

    // Muestra todos los funkos cuya fecha de lanzamiento pertenezca al año 2023
    public static void mostrarFunkos2023(ArrayList<Funko> listaFunkos) {
        for (Funko f : listaFunkos) {                               // Recorremos toda la lista
            if (f.getFecha_lanzamiento().startsWith("2023")) {      // Si la fecha empieza por "2023"...
                System.out.println(f);                              // ...mostramos ese funko
            }
        }
    }
}