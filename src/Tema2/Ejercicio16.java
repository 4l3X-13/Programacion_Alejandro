package Tema2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una letra (D o E): ");
        String letra = sc.nextLine();

        if (letra.equalsIgnoreCase("D")) {
            System.out.println("La letra que has puesto ha sido la ´D´, convirtiendo euros a dolares: ");
            System.out.println("Introduce los euros que quieras: ");
            double euros1 = sc.nextDouble();
            double dollar1 = euros1 * 1.16;
            System.out.println(euros1 + " euros son igual a " + dollar1 + " dolares.");

        } else if (letra.equalsIgnoreCase("E")) {
            System.out.println("La letra que has puesto ha sido la ´E´, convirtiendo dolares a euros: ");
            System.out.println("Introduce los dolares que quieras: ");
            double dollar2 = sc.nextDouble();
            double euros2 = dollar2 * 0.86;
            System.out.println(dollar2 + " dolares son igual a " + euros2 + " euros.");
        } else {
            System.out.println("Carácter no válida. Solo se admite D o E.");
        }
    }
}
