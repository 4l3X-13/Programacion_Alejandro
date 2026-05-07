package Tema8.Actividades_AADD;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainPiloto {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║    GESTIÓN DE PILOTOS – F1 2006     ║");
        System.out.println("╚═════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            printMenu();
            int option = readInt("  Elige una opción: ");

            try {
                switch (option) {
                    case 1 -> createPilotFlow();
                    case 2 -> readPilotFlow();
                    case 3 -> readAllPilotsFlow();
                    case 4 -> updatePilotFlow();
                    case 5 -> deletePilotFlow();
                    case 6 -> PilotsCRUD.ShowPilotClassification();
                    case 7 -> PilotsCRUD.ShowBuildersClassification();
                    case 0 -> {
                        System.out.println("¡Hasta luego!");
                        running = false;
                    }
                    default -> System.out.println("⚠  Opción no válida. Elige entre 0 y 7.");
                }
            } catch (SQLException e) {
                // El error se muestra pero el menú sigue vivo
                System.err.println("✗ Error de base de datos: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("✗ Valor numérico inválido: " + e.getMessage());
            }
        }
        sc.close();
    }

    // ─── Menú ─────────────────────────────────────────────────────────────────

    private static void printMenu() {
        System.out.println("  1. Añadir piloto                   ");
        System.out.println("  2. Buscar piloto por ID            ");
        System.out.println("  3. Listar todos los pilotos        ");
        System.out.println("  4. Actualizar piloto               ");
        System.out.println("  5. Eliminar piloto                 ");
        System.out.println("  6. Clasificación mundial pilotos   ");
        System.out.println("  7. Clasificación constructores     ");
        System.out.println("  0. Salir                           ");
    }

    // ─── Flujos de cada opción ────────────────────────────────────────────────

    //Opción 1: pide datos al usuario y crea el piloto.
    private static void createPilotFlow() throws SQLException {
        System.out.println("\n── NUEVO PILOTO ──────────────────────");
        Piloto pilot = readPilotFromConsole(true);
        PilotsCRUD.CreatePilot(pilot);
    }

    //Opción 2: busca por ID y muestra el piloto si existe.

    private static void readPilotFlow() throws SQLException {
        int id = readInt("ID del piloto: ");
        Piloto pilot = PilotsCRUD.ReadPilot(id);
        if (pilot != null) {
            System.out.println("\n" + pilot);
        } else {
            System.out.println("⚠  No existe ningún piloto con ID " + id);
        }
    }

    //Opción 3: lista todos los pilotos.

    private static void readAllPilotsFlow() throws SQLException {
        List<Piloto> pilots = PilotsCRUD.ReadPilots();
        if (pilots.isEmpty()) {
            System.out.println("⚠  No hay pilotos en la base de datos.");
            return;
        }
        System.out.println("\n── PILOTOS (" + pilots.size() + ") ──────────────────────────");
        pilots.forEach(System.out::println);
    }

    //Opción 4: verifica que el piloto existe, pide nuevos datos y actualiza.

    private static void updatePilotFlow() throws SQLException {
        int id = readInt("ID del piloto a actualizar: ");
        Piloto existing = PilotsCRUD.ReadPilot(id);
        if (existing == null) {
            System.out.println("⚠  No existe ningún piloto con ID " + id);
            return;
        }
        System.out.println("Piloto actual → " + existing);
        System.out.println("Introduce los nuevos datos (ID no se puede cambiar):");
        Piloto updated = readPilotFromConsole(false);  // false = no pedimos ID
        updated.setDriverId(id);
        PilotsCRUD.UpdatePilot(updated);
    }

    //Opción 5: verifica que el piloto existe, pide confirmación y elimina.

    private static void deletePilotFlow() throws SQLException {
        int id = readInt("ID del piloto a eliminar: ");
        Piloto pilot = PilotsCRUD.ReadPilot(id);
        if (pilot == null) {
            System.out.println("⚠  No existe ningún piloto con ID " + id);
            return;
        }
        System.out.print("¿Eliminar a " + pilot.getForename() + " " + pilot.getSurname()
                + "? También se borrarán sus resultados. (s/n): ");
        String confirm = sc.nextLine().trim();
        if (confirm.equalsIgnoreCase("s")) {
            PilotsCRUD.DeletePilot(pilot);
        } else {
            System.out.println("Operación cancelada.");
        }
    }

    // ─── Helpers de consola ───────────────────────────────────────────────────

    private static Piloto readPilotFromConsole(boolean preguntaID) {
        int id = 0;
        if (preguntaID) {
            id = readInt("Driver ID    : ");
        }
        System.out.print("Código (ej: ALO): ");
        String code = sc.nextLine().trim();
        System.out.print("Nombre           : ");
        String fore = sc.nextLine().trim();
        System.out.print("Apellido         : ");
        String sur = sc.nextLine().trim();
        System.out.print("Nacimiento (YYYY-MM-DD): ");
        String dob = sc.nextLine().trim();
        System.out.print("Nacionalidad     : ");
        String nat = sc.nextLine().trim();
        System.out.print("URL Wikipedia    : ");
        String url = sc.nextLine().trim();

        return new Piloto(id, code, fore, sur, dob, nat, url);
    }


    private static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(sc.nextLine().trim());
    }
}