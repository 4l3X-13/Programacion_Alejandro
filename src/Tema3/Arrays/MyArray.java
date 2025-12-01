package Tema3.Arrays;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numeros2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("1. Imprimir el array");
        System.out.println("2. Número máximo del array");
        System.out.println("3. Número mínimo del array");
        System.out.println("4. Media del array");
        System.out.println("5. Comprobar si un elemento existe");
        System.out.println("6. Suma de dos vectores");
        System.out.println("7. Resta de dos vectores");
        System.out.println("8. Producto escalar");
        System.out.println("9. Función invertir el array");
        System.out.println("10. Procedimiento invertir el array");
        System.out.println("11. Comprobar si el array es capicúa");
        System.out.println("12. Introducir dos vectores y hacer todas las operaciones anteriores");

        System.out.print("Introduce una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                imprimir(numeros);
                break;

            case 2:
                System.out.println("Máximo: " + maxArray(numeros));
                break;

            case 3:
                System.out.println("Mínimo: " + minArray(numeros));
                break;

            case 4:
                System.out.println("Media: " + media(numeros));
                break;

            case 5:
                System.out.print("Introduce el número a buscar: ");
                int elemento = sc.nextInt();
                if (elementExis(numeros, elemento)) {
                    System.out.println("El elemento SÍ existe.");
                } else {
                    System.out.println("El elemento NO existe.");
                }
                break;

            case 6:
                int[] suma = sumaVectores(numeros, numeros2);
                imprimir(suma);
                break;

            case 7:
                int[] resta = restaVectores(numeros, numeros2);
                imprimir(resta);
                break;

            case 8:
                int escalar = productoEscalar(numeros, numeros2);
                System.out.println("Producto escalar: " + escalar);
                break;

            case 9:
                int[] invertido = invertir(numeros);
                imprimir(invertido);
                break;

            case 10:
                invertirA(numeros);
                imprimir(numeros);
                break;

            case 11:
                boolean capicua = esCapicua(numeros);
                if (capicua) {
                    System.out.println("El array ES capicúa.");
                } else {
                    System.out.println("El array NO es capicúa.");
                }
                break;

            case 12:
                Scanner sc2 = new Scanner(System.in);

                System.out.print("Introduce el tamaño del primer vector: ");
                int n = sc2.nextInt();
                int[] vector1 = new int[n];
                System.out.println("Introduce los elementos del primer vector:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Elemento " + i + ": ");
                    vector1[i] = sc2.nextInt();
                }

                System.out.print("¿Quieres introducir un segundo vector? (s/n): ");
                String respuesta = sc2.next();
                int[] vector2 = null;
                if (respuesta.equalsIgnoreCase("s")) {
                    vector2 = new int[n];
                    System.out.println("Introduce los elementos del segundo vector:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento " + i + ": ");
                        vector2[i] = sc2.nextInt();
                    }
                }

                int opcionInterna;
                do {
                    System.out.println("\n--- MENÚ DE OPERACIONES CON LOS VECTORES ---");
                    System.out.println("1. Imprimir vector 1");
                    System.out.println("2. Máximo de vector 1");
                    System.out.println("3. Mínimo de vector 1");
                    System.out.println("4. Media de vector 1");
                    System.out.println("5. Comprobar si un elemento existe en vector 1");
                    if (vector2 != null) {
                        System.out.println("6. Suma de vectores");
                        System.out.println("7. Resta de vectores");
                        System.out.println("8. Producto escalar");
                    }
                    System.out.println("9. Invertir vector 1 (función)");
                    System.out.println("10. Invertir vector 1 (procedimiento)");
                    System.out.println("11. Comprobar si vector 1 es capicúa");
                    System.out.println("0. Salir del menú de vectores");
                    System.out.print("Elige una opción: ");
                    opcionInterna = sc2.nextInt();

                    switch (opcionInterna) {
                        case 1:
                            imprimir(vector1);
                            break;
                        case 2:
                            System.out.println("Máximo: " + maxArray(vector1));
                            break;
                        case 3:
                            System.out.println("Mínimo: " + minArray(vector1));
                            break;
                        case 4:
                            System.out.println("Media: " + media(vector1));
                            break;
                        case 5:
                            System.out.print("Introduce el número a buscar: ");
                            int elem = sc2.nextInt();
                            if (elementExis(vector1, elem)) {
                                System.out.println("El elemento SÍ existe.");
                            } else {
                                System.out.println("El elemento NO existe.");
                            }
                            break;
                        case 6:
                            if (vector2 != null) {
                                imprimir(sumaVectores(vector1, vector2));
                            } else {
                                System.out.println("No hay segundo vector.");
                            }
                            break;
                        case 7:
                            if (vector2 != null) {
                                imprimir(restaVectores(vector1, vector2));
                            } else {
                                System.out.println("No hay segundo vector.");
                            }
                            break;
                        case 8:
                            if (vector2 != null) {
                                System.out.println("Producto escalar: " + productoEscalar(vector1, vector2));
                            } else {
                                System.out.println("No hay segundo vector.");
                            }
                            break;
                        case 9:
                            imprimir(invertir(vector1));
                            break;
                        case 10:
                            invertirA(vector1);
                            imprimir(vector1);
                            break;
                        case 11:
                            if (esCapicua(vector1)) {
                                System.out.println("El vector ES capicúa.");
                            } else {
                                System.out.println("El vector NO es capicúa.");
                            }
                            break;
                        case 0:
                            System.out.println("Saliendo del menú de vectores...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } while (opcionInterna != 0);
                break;


            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void imprimir(int[] numeros) {
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int maxArray(int[] numeros) {
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max) max = n;
        }
        return max;
    }

    public static int minArray(int[] numeros) {
        int min = numeros[0];
        for (int n : numeros) {
            if (n < min) min = n;
        }
        return min;
    }

    public static double media(int[] numeros) {
        int suma = 0;
        for (int n : numeros) suma += n;
        return (double) suma / numeros.length;
    }

    public static boolean elementExis(int[] numeros, int elemento) {
        for (int n : numeros) if (n == elemento) return true;
        return false;
    }

    public static int[] sumaVectores(int[] numeros1, int[] numeros2) {
        int[] resultado = new int[numeros1.length];
        for (int i = 0; i < numeros1.length; i++)
            resultado[i] = numeros1[i] + numeros2[i];
        return resultado;
    }

    public static int[] restaVectores(int[] numeros1, int[] numeros2) {
        int[] resultado = new int[numeros1.length];
        for (int i = 0; i < numeros1.length; i++)
            resultado[i] = numeros1[i] - numeros2[i];
        return resultado;
    }

    public static int productoEscalar(int[] numeros, int[] numeros2) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++)
            resultado += numeros[i] * numeros2[i];
        return resultado;
    }

    public static int[] invertir(int[] numeros) {
        int[] invertido = new int[numeros.length];
        for (int i = 0, j = numeros.length - 1; i < numeros.length; i++, j--)
            invertido[i] = numeros[j];
        return invertido;
    }

    public static void invertirA(int[] numeros) {
        int inicio = 0, fin = numeros.length - 1;
        while (inicio < fin) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temp;
            inicio++;
            fin--;
        }
    }

    public static boolean esCapicua(int[] numeros) {
        int inicio = 0, fin = numeros.length - 1;
        while (inicio < fin) {
            if (numeros[inicio] != numeros[fin]) return false;
            inicio++;
            fin--;
        }
        return true;
    }


}
