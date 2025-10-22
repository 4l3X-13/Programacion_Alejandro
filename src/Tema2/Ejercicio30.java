package Tema2;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("0. SUMA");
        System.out.println("1. RESTA");
        System.out.println("2. MULTIPLICACIÓN");
        System.out.println("3. DIVISIÓN O  PORCENTAJE");
        System.out.println("4. SALIR \n");

        System.out.println("Introduce una opción: ");

        int opcion = sc.nextInt();

        do {
            switch (opcion) {
                case 0:
                    System.out.println("--SUMA--");
                    System.out.println("Introduce el primer número: ");
                    int num1Sum = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int num2Sum = sc.nextInt();

                    int resultadoSum = num1Sum + num2Sum;
                    System.out.println(resultadoSum);

                    System.out.println("Elije otra opción: ");
                    opcion = sc.nextInt();
                    break;

                case 1:

                    System.out.println("--RESTA--");
                    System.out.println("Introduce el primer número: ");
                    int num1Res = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int num2Res = sc.nextInt();
                    if (num1Res < num2Res) {
                        System.out.println(" - - S I N T A X   E R R O R - - ");
                    } else {
                        int resultadoRes = num1Res - num2Res;
                        System.out.println(resultadoRes);
                    }

                    System.out.println("Elije otra opción: ");
                    opcion = sc.nextInt();
                    break;

                case 2:
                    System.out.println("--MULTIPLICACIÓN--");
                    System.out.println("Introduce el primer número: ");
                    int num1Mult = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int num2Mult = sc.nextInt();

                    int resultadoMult = num1Mult * num2Mult;
                    System.out.println(resultadoMult);
                    System.out.println("Elije otra opción: ");
                    opcion = sc.nextInt();
                    break;

                case 3:
                    System.out.println("--DIVISIÓN O PORCENTAJE--");

                    System.out.println("Elije si / o %");
                    char eleccion = sc.next().charAt(0);

                    switch (eleccion) {
                        case '/':
                            System.out.println("Introduce el primer número: ");
                            int num1Div = sc.nextInt();
                            System.out.println("Introduce el segundo número: ");
                            int num2Div = sc.nextInt();

                            if (num1Div > num2Div) {
                                int resultadoDiv = num1Div / num2Div;
                                System.out.println(resultadoDiv);
                            } else {
                                System.out.println(" - - S I N T A X   E R R O R - - ");
                            }
                            System.out.println("Elije otra opción: ");
                            opcion = sc.nextInt();

                            break;


                        case '%':
                            System.out.println("Introduce el primer número: ");
                            int num1Porc = sc.nextInt();
                            System.out.println("Introduce el segundo número: ");
                            int num2Porc = sc.nextInt();
                            if (num1Porc > num2Porc) {
                                int resultadoPorc = num1Porc % num2Porc;
                                System.out.println(resultadoPorc);
                            } else {
                                System.out.println(" - - S I N T A X   E R R O R - - ");
                            }
                            System.out.println("Elije otra opción: ");
                            opcion = sc.nextInt();

                            break;

                    }

                    break;


                case 4:
                    System.out.println(" SALIENDO DEL PROGRAMA ... :)");
                    break;
            }
        } while (opcion != 4);

    }
}
