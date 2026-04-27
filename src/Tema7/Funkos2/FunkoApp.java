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
                    System.out.println("MOSTRAR FUNKO MAS CARO: ");
                    mostrarFunkoMasCaro(listaFunkos);
                    break;
                case 5:
                    System.out.println("MOSTRAR MEDIA PRECIOS: ");
                    mostrarMediaPrecios(listaFunkos);
                    break;
                case 6:
                    System.out.println("MOSTRAR LOS FUNKOS POR MODELOS: ");
                    mostrarPorModelos(listaFunkos);
                    break;
                case 7:
                    System.out.println("MOSTRAR LOS FUNKOS DE 2023: ");
                    mostrarFunkos2023(listaFunkos);
                    break;
            }
        } while (opcion != 0);
    }

    //Lee un csv donde cada línea es un funko y los guarda en un arrayList<Funko>
    public static ArrayList<Funko> cargarFunkos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/alenavzaf/IdeaProjects/Programacion_Alejandro/src/Tema7/Funkos2/funkos.csv"));
        ArrayList<Funko> listaFunkos = new ArrayList<>();
        String linea;
        br.readLine(); //Consumimos la primera línea (cabecera)
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(","); //Guardamos en un array cada propiedad del funko
            String codigo = partes[0];
            String nombre = partes[1];
            String modelo = partes[2];
            double precio = Double.parseDouble(partes[3]);
            String fecha_lanzamiento = partes[4];
            listaFunkos.add(new Funko(codigo, nombre, modelo, precio, fecha_lanzamiento)); //Creamos el funko y lo añadimos al arrayList
        }
        br.close();
        return listaFunkos;
    }

    //Pide al usuario que escriba los parametros del funko que quiere añadir y lo añade a listaFunkos
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
        scan.nextLine();    //Para liberar el buffer
        System.out.println("Introduce la fecha de lanzamiento (AAAA-MM-DD): ");
        String fechaUsu = scan.nextLine();
        listaFunkos.add(new Funko(codigoUsu, nombreUsu, modeloUsu, precioUsu, fechaUsu));   //Crea un Funko con los parametros que ha puesto el usuario y lo añade a listaFunkos
    }

    //Pide al usuario el codigo del funko que quiere borrar y lo borra de listaFunkos
    public static void borrarfunko(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el código del Funko a borrar: ");
        String codigo = scan.nextLine();
        //removeIf recorre todos los elementos de un arrayList y si se da la condición después de ->, entonces elimina el elemento
        listaFunkos.removeIf(f -> f.getCode().equals(codigo));  //Quita el funko de la lista si el hay algun funko que tiene el mismo codigo que le ha puesto el usuario
    }

    //Printea toda la listaFunkos
    public static void mostrarTodosFunkos(ArrayList<Funko> listaFunkos) {
        for (Funko f : listaFunkos) System.out.println(f);
    }

    //Muestra el funko mas caro de listaFunkos
    public static void mostrarFunkoMasCaro(ArrayList<Funko> listaFunkos) {
        if (listaFunkos.isEmpty()) return;
        Funko caro = listaFunkos.get(0); //Coge el funko de la primera posicion como el mas caro (temporalmente)
        for (Funko f : listaFunkos) if (f.getPrecio() > caro.getPrecio()) caro = f; //Recorre toda la lista y si encuentra uno mas caro lo actualiza
        System.out.println("El más caro es: " + caro);
    }

    //Saca la media de todos los funkos de listaFunkos
    public static void mostrarMediaPrecios(ArrayList<Funko> listaFunkos) {
        double suma = 0;
        for (Funko f : listaFunkos) suma += f.getPrecio();  //Recorre listaFunkos y va sumando los precios y los pone en la variable suma

        double media;
        if(listaFunkos.isEmpty()){
            media = 0;  //Si listaFunkos esta vacia, devuelve de media 0
        }else{
            media = suma / listaFunkos.size(); //Si hay algo en listaFunkos, devuelve la media de listaFunkos
        }

        //System.out.println("Media de precios: " + (listaFunkos.isEmpty() ? 0 : suma / listaFunkos.size()));
        System.out.println("Media de precios:" + String.format("%.2f", media) + "€");
                                                    //Lo pasamos a String y el %.2f es para caparlo a solo 2 decimales.
    }

    //TODO: como indica en el enunciado
    //Filtra y muestra por modelos listaFunkos
    public static void mostrarPorModelos(ArrayList<Funko> listaFunkos) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el modelo: ");
        String modelo = scan.nextLine();
        for (Funko f : listaFunkos) if (f.getModelo().equalsIgnoreCase(modelo)) System.out.println(f);
        //Recorre listaFunkos comparando si hay algun modelo igual al que ha puesto el usuario para seguidamente mostrarlos por pantalla
    }

    //Muestra todos los funkos con el filtro del año de 2023
    public static void mostrarFunkos2023(ArrayList<Funko> listaFunkos) {
        for (Funko f : listaFunkos){
            if (f.getFecha_lanzamiento().startsWith("2023")) {
                System.out.println(f);
            }
        }
        //Recorre listaFunkos y si "Fecha_lanzamiento" empieza por 2023 muestra el funko
    }
}