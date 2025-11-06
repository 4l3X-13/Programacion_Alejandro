package SimulacroExamen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" M E N Ú ");
        System.out.println("(a) Aprobados y suspendidos.");
        System.out.println("(b) Billetes a Madrid");
        System.out.println("(c) Salir");
        System.out.println("Introduce que opción quieres escoger: ");


        String opcion = sc.nextLine();
        switch (opcion) { //--------------------------Aprobados y suspendidos-----------------------------------//
            case "a" :
                System.out.println("Aprobados y suspendidos.");
                System.out.println("Cuantas notas quieres introducir?");
                int numMax = sc.nextInt();
                int contador1 = 0;
                int contadorAprob = 0;
                int contadorSusp = 0;
                do {
                    System.out.println("Introduce una nota:");
                    double nota = sc.nextDouble();
                    if (nota > 10 && nota < 0) {
                        System.out.println("Nota invalida, introducela otra vez");
                        nota = sc.nextDouble();
                    } else if (nota >= 5) {
                        contadorAprob++;
                        contador1++;
                    } else {
                        contadorSusp++;
                        contador1++;
                    }

                } while (contador1 < numMax);
                if (contadorAprob > contadorSusp) {
                    System.out.println("\n Hay mas aprobados que suspendidos.");

                } else {
                    System.out.println("\n Hay mas suspendidos que aprobados.");
                }

                break;

//--------------------------------------------------------------Billetes a Madrid------------------------------------------------------//
            case "b":
                System.out.println("Billetes a Madrid.");
                int tarifEst = 32;
                System.out.println("Introduzca el número de personas que van a viajar: ");
                int numPers = sc.nextInt();
                int contador2 = 0;
                int total = 0;
                System.out.println("Entrando a la elección de billetes...");
                do {
                    System.out.println("\n Introduce tu edad: ");
                    int edad = sc.nextInt();
                    if (edad >= 65) {
                        int tarif65 = tarifEst - (tarifEst * 10) / 100;
                        System.out.println("Gracias por su compra Sr/Sra su precio es de " + tarif65 + "€");
                        total = total + tarif65;
                    } else if (edad >= 12 && edad <= 15) {
                        int tarif12 = tarifEst - (tarifEst * 8) / 100;
                        System.out.println("Gracias por tu compra tu precio es de " + tarif12 + "€");
                        total = total + tarif12;
                    } else if (edad >= 4 && edad <= 11) {
                        int tarif4 = tarifEst - (tarifEst * 35) / 100;
                        System.out.println("Gracias por tu compra tu precio es de " + tarif4 + "€");
                        total = total + tarif4;
                    } else if (edad < 4 & edad > 0) {
                        System.out.println("Este pasajero va gratis.");
                        tarifEst = 0;
                    } else if (edad < 0) {
                        System.out.println("Edad introducida incorrecta, vuelva a introducirla:");
                        edad = sc.nextInt();
                    }else{
                        total= total + tarifEst;
                        System.out.println("Gracias por tu compra tu precio es de " + tarifEst + "€");

                    }
                    contador2++;
                } while (contador2 < numPers);
                System.out.println("El precio total del viaje son " + total + " €");

                break;
//--------------------------------------------------------------------------Salir del programa...------------------------------------------//

            case "c":
                System.out.println("Saliendo del programa...");
                break;
        }

    }
}
