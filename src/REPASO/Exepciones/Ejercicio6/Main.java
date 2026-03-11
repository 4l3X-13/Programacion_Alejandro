package REPASO.Exepciones.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        try {
            Gato g1 = new Gato("Gatillo", 3);
            g1.imprimir();
            g1.setEdad(-5); // Lanza excepción
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Gato g2 = new Gato("Ab", 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}