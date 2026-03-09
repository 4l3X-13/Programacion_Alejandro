package REPASO.Exepciones;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Introduce un número (o -999 para terminar el progama): ");
                int valor = sc.nextInt();
                if (valor == -999) break;

                imprimePositivo(valor);
                imprimeNegativo(valor);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
        sc.close();
    }

    static void imprimePositivo(int p) throws Exception {
        if (p < 0) throw new Exception("El valor " + p + " no es un numero positivo");
        System.out.println("Positivo: " + p);
    }

    static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) throw new Exception("El valor " + n + " no es un numero negativo");
        System.out.println("Negativo: " + n);
    }
}