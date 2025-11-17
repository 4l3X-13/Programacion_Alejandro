package Tema3.ProgramacionModular1;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("TABLAS DE MULTIPLICAR");
        numMult();
    }

    public static void numMult() {
        for (int num = 1; num <= 10; num++) {
            System.out.println("\nTABLA DEL " + num);

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
