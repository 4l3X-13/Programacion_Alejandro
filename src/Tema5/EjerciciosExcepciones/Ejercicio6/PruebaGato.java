package Tema5.EjerciciosExcepciones.Ejercicio6;

public class PruebaGato {
    public static void main(String[] args) {

        try {
            System.out.println("--- Intento 1: Gato válido ---");
            Gato miGato = new Gato("Pelusa", 5);
            miGato.imprimir();

            System.out.println("\n--- Intento 2: Cambiar nombre a uno corto ---");
            miGato.setNombre("Bo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n--- Intento 3: Crear gato con edad negativa ---");
            Gato gatoError = new Gato("Salem", -2);
            gatoError.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n--- Intento 4: Crear gato con nombre corto ---");
            Gato gatoAnonimo = new Gato("Oz", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
