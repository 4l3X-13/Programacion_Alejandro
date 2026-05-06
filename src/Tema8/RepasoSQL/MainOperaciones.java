package Tema8.RepasoSQL;

import java.util.List;
import java.util.Scanner;

public class MainOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 9;
        while (opcion != 0) {
            System.out.println("que quieres hacer?");
            System.out.println("0. salir \n1. ver la lista de las asignaturas \n2. ver los estudiantes de una casa \n3. buscar la mascota por la persona \n4. ver el número de estudiantes por casa \n5. Insertar una nueva asignatura \n6. Modificar el aula de una asignatura ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n 1");

                    Operaciones op = new Operaciones();

                    List<Asignatura> asignaturas = op.obtenerAsignaturas();

                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.println(asignaturas.get(i));
                    }
                    break;
                case 2:
                    System.out.println("\n 2");

                    Operaciones b = new Operaciones();
                    System.out.println("De que casa quieres hacer una consulta?");
                    String casa = sc.nextLine();
                    b.estudiantesPorCasa(casa);
                    break;
                case 3:
                    System.out.println("\n 3");

                    Operaciones c = new Operaciones();
                    System.out.println("De que persona quieres buscar su mascota?");
                    String persona = sc.nextLine();
                    c.mascotaDeUnEstudianteEspecifico(persona);
                    break;
                case 4:
                    System.out.println("\n 4");

                    Operaciones d = new Operaciones();
                    d.NumeroEstudiantesPorCasa();
                    break;
                case 5:
                    System.out.println("\n 5");
                    Operaciones e = new Operaciones();
                    System.out.println("id de la asignatura");
                    int id = sc.nextInt();
                    System.out.println("nombre de la asignatura");
                    String nombre2 = sc.next();
                    sc.nextLine();
                    System.out.println("aula de la asignatura");
                    String aula2 = sc.nextLine();
                    System.out.println("Es oblidatoria? true or false");
                    boolean esOblidatoria = sc.nextBoolean();
                    e.insertarAsignatura(id, nombre2, aula2, esOblidatoria);
                    break;
                case 6:
                    System.out.println("\n 6");
                    Operaciones f = new Operaciones();
                    System.out.println("id de la asignatura");
                    id = sc.nextInt();
                    System.out.println("nueva aula de la asignatura");
                    aula2 = sc.nextLine();
                    f.modificarAsignatura(id, aula2);
                    break;
                case 7:
                    System.out.println("\n 7");
                    Operaciones g = new Operaciones();
                    System.out.println("id de la asignatura para eliminar");
                    id = sc.nextInt();
                    g.eliminarAsignatura(id);
                    break;
            }
        }
        System.out.println("Saliendo...");

    }
}
