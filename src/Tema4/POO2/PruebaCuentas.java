/*package Tema4.POO.POO2;

import Tema4.POO.POO1.Ejercicio2.Persona;

import java.util.Scanner;

public class PruebaCuentas {
    private static Persona[] personas = new Persona[100];
    private static int totalPersonas = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            meter el menú en un  procedimeinto
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar Persona");
            System.out.println("2. Añadir Cuenta a Persona");
            System.out.println("3. Consultar Persona");
            System.out.println("4. Recibir Nómina");
            System.out.println("5. Pagar Recibo");
            System.out.println("6. Transferencia entre cuentas");
            System.out.println("7. Listar Morosos");
            System.out.println("0. Salir");
            System.out.print("Introduce la opción que quieres: ");
            opcion = sc.nextInt();

            procesarOpcion(opcion);

        } while (opcion != 0);
    }

    private static void procesarOpcion(int opcion) {
        Persona per;
        String iban;

        switch (opcion) {
            case 1:
                if (totalPersonas < personas.length) {
                    System.out.print("Introduce DNI: ");
                    personas[totalPersonas++] = new Persona(sc.next());
                    System.out.println("Persona registrada.");
                } else {
                    System.out.println("Base de datos llena.");
                }
                break;

            case 2:
                per = buscarPersona();
                if (per != null) {
                    System.out.print("Número de cuenta: ");
                    iban = sc.next();
                    System.out.print("Saldo inicial: ");
                    s = sc.nextDouble();
                    if (per.anyadirCuenta(new Cuenta(iban, s))) System.out.println("Cuenta añadida.");
                    else System.out.println("Error: Ya tiene 3 cuentas.");
                }
                break;

            case 3:
                per = buscarPersona();
                if (per != null) per.mostrarInfo();
                break;

            case 4:
                per = buscarPersona();
                if (per != null) {
                    System.out.print("Número de cuenta: ");
                    Cuenta cuent = per.getCuenta(sc.next());
                    if (cuent != null) {
                        System.out.print("Importe nómina: ");
                        cuent.recibirAbono(sc.nextDouble());
                    } else System.out.println("Cuenta no encontrada.");
                }
                break;

            case 5:
                per = buscarPersona();
                if (per != null) {
                    System.out.print("Número de cuenta: ");
                    Cuenta cuen = per.getCuenta(sc.next());
                    if (cuen != null) {
                        System.out.print("Importe recibo: ");
                        cuen.pagarRecibo(sc.nextDouble());
                    } else System.out.println("Cuenta no encontrada.");
                }
                break;

            case 6:
                realizarTransferencia();
                break;

            case 7:
                System.out.println("--- LISTA DE MOROSOS ---");
                for (int i = 0; i < totalPersonas; i++) {
                    llamarías al toString de persona
                    if (personas[i].esMorosa()) System.out.println("- DNI: " + personas[i].getDni());
                }
                break;

            case 0:
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    private static Persona buscarPersona() {
        System.out.print("DNI de la persona: ");
        String dniBusqueda = sc.next();
        for (int i = 0; i < totalPersonas; i++) {
            if (personas[i].getDni().equals(dniBusqueda)) return personas[i];
        }
        System.out.println("Persona no encontrada.");
        return null;
    }

    private static void realizarTransferencia() {
        System.out.println("DATOS ORIGEN:");
        Persona persona1 = buscarPersona();
        if (persona1 == null) return;
        System.out.print("IBAN origen: ");
        Cuenta cuenta1 = persona1.getCuenta(sc.next());

        System.out.println("DATOS DESTINO:");
        Persona persona2 = buscarPersona();
        if (persona2 == null) return;
        System.out.print("Número de cuenta destino: ");
        Cuenta cuenta2 = persona2.getCuenta(sc.next());

        if (cuenta1 != null && cuenta2 != null) {
            System.out.print("Cantidad a transferir: ");
            double cant = sc.nextDouble();
            cuenta1.pagarRecibo(cant);
            cuenta2.recibirAbono(cant);
            System.out.println("Transferencia completada.");
        } else {
            System.out.println("Error en las cuentas indicadas.");
        }
    }
}*/