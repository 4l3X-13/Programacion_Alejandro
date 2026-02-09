package Tema5.EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner scan  = new Scanner(System.in);
        try{
            System.out.println("Introduce un valor entero:");
            int valor = scan.nextInt();
            System.out.println("Valor introducido " + valor);
        }catch(InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
        }
    }
}
