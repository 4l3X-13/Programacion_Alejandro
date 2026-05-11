package Tema7.Funkos2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Desserializar {
    static void main() {
        String ruta = "C:\\Users\\alex\\IdeaProjects\\Programacion_Alejandro\\src\\Tema7\\Funkos2\\funkos.ser";
        try {
            FileInputStream fileInput = new FileInputStream(ruta);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            ArrayList<Funko> listaFunkos = (ArrayList<Funko>) objectInput.readObject();
            for (int i = 0; i < listaFunkos.size(); i++) {
                System.out.println(listaFunkos.get(i).getNombre());
            }

        } catch (Exception e) {
            System.out.println("Error al abrir archivo");
        }
    }
}
