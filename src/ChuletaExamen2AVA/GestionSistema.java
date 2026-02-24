package ChuletaExamen2AVA;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionSistema {
    public static void main(String[] args) {
        // 1. ARRAYLIST: Lista dinámica de objetos
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // 2. CREACIÓN DE OBJETOS: Instanciamos usando 'new'
        // Creamos un Estudiante (que hereda de Persona)
        Estudiante est1 = new Estudiante("Carlos", 20, "Matemáticas");
        listaPersonas.add(est1);

        // 3. EXCEPCIONES: Bloque try-catch para evitar errores en tiempo de ejecución
        try {
            System.out.println("Accediendo al tercer elemento...");
            // Esto lanzará una excepción porque la lista solo tiene 1 elemento (índice 0)
            Persona p = listaPersonas.get(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("⚠️ Error: Intentaste acceder a un índice que no existe.");
        } finally {
            System.out.println("ℹ️ Finalizando chequeo de lista.\n");
        }

        // 4. COLECCIONES (HashMap): Almacén Clave-Valor
        // Guardamos a los estudiantes por su ID (String)
        HashMap<String, Estudiante> mapaEstudiantes = new HashMap<>();
        mapaEstudiantes.put("ID100", est1);

        if (mapaEstudiantes.containsKey("ID100")) {
            System.out.println("Estudiante encontrado en HashMap: " + mapaEstudiantes.get("ID100").nombre);
        }
    }
}
