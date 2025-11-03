package SimulacroExamen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" DIFERENCIA HORARIA:");
        System.out.println("Donde vives?");
        System.out.println("a) España");
        System.out.println("b) Japón");
        String opcion = sc.nextLine();
        switch (opcion) {
            case "a"://-----------------------------------------------------ESPAÑA-----------------------------------//
                System.out.println("Vives en ESPAÑA");
                boolean terminar1 = false;
                do {
                    System.out.println("Introduce que dia de la semana es: \n 1. Lunes \n 2. Martes \n 3. Miercoles \n 4. Jueves \n 5. Viernes \n 6. Sábado \n 7. Domingo");
                    int diaSemEsp = sc.nextInt();
                    if (diaSemEsp > 7 && diaSemEsp <= 0) {
                        System.out.println("Día de la semana invalido, introducelo otra vez: ");
                        diaSemEsp = sc.nextInt();
                    }
                    System.out.println("Introduce las horas:");
                    int horasEsp = sc.nextInt();
                    if (horasEsp > 24 && horasEsp < 0) {
                        System.out.println("Hora incorrecta, introducela otra vez: ");
                        horasEsp = sc.nextInt();
                    }
                    System.out.println("Introduce los minutos: ");
                    int minutosEsp = sc.nextInt();
                    if (minutosEsp > 60 && minutosEsp < 0) {
                        System.out.println("Minutos incorrectos, introducelos otra vez:");
                        minutosEsp = sc.nextInt();
                    }
                    int horasJap = horasEsp + 8;
                    int minutosJap = minutosEsp;
                    int diaSemJap = diaSemEsp;
                    if (horasJap >= 24) {
                        horasJap = horasJap - 24;
                        diaSemJap = diaSemEsp + 1;
                    }
                    if (diaSemJap > 7) {
                        diaSemJap = 1;
                    }
                    System.out.println("\n Entonces, si los datos introducidos son correctos, la hora y el dia de la semana en Japón serían los siguientes: ");
                    System.out.println("Es día:");
                    if (diaSemJap == 1) {
                        System.out.println("Lunes");
                    } else if (diaSemJap == 2) {
                        System.out.println("Martes");
                    } else if (diaSemJap == 3) {
                        System.out.println("Miércoles");
                    } else if (diaSemJap == 4) {
                        System.out.println("Jueves");
                    } else if (diaSemJap == 5) {
                        System.out.println("Viernes");
                    } else if (diaSemJap == 6) {
                        System.out.println("Sábado");
                    } else if (diaSemJap == 7) {
                        System.out.println("Domingo");
                    }
                    System.out.println("Y la hora es:");
                    System.out.println(horasJap + ":" + minutosJap);


                    System.out.println("Quieres terminar1?");
                    System.out.println("1. Si   2. No");
                    int opciTerm = sc.nextInt();
                    if (opciTerm == 1) {
                        terminar1 = false;
                    } else if (opciTerm == 2) {
                        terminar1 = true;
                    } else {
                        System.out.println("Opción no válida... vuelve a introducir la opción");
                        opciTerm = sc.nextInt();
                    }
                } while (terminar1 = true);
                break;


            case "b"://----------------------------------------------------------------JAPON---------------------------------------//
                System.out.println("Vives en Japon");
                boolean terminar2 = false;
                do {
                    System.out.println("Introduce que dia de la semana es: \n 1. Lunes \n 2. Martes \n 3. Miercoles \n 4. Jueves \n 5. Viernes \n 6. Sábado \n 7. Domingo");
                    int diaSemJap = sc.nextInt();
                    if (diaSemJap > 7 && diaSemJap <= 0) {
                        System.out.println("Día de la semana invalido, introducelo otra vez: ");
                        diaSemJap = sc.nextInt();
                    }
                    System.out.println("Introduce las horas:");
                    int horasJap = sc.nextInt();
                    if (horasJap > 24 && horasJap < 0) {
                        System.out.println("Hora incorrecta, introducela otra vez: ");
                        horasJap = sc.nextInt();
                    }
                    System.out.println("Introduce los minutos: ");
                    int minutosJap = sc.nextInt();
                    if (minutosJap > 60 && minutosJap < 0) {
                        System.out.println("Minutos incorrectos, introducelos otra vez:");
                        minutosJap = sc.nextInt();
                    }
                    int horasEsp = horasJap - 8;
                    int minutosEsp = minutosJap;
                    int diaSemEsp = diaSemJap;
                    if (horasEsp <= 0) {
                        horasEsp = horasEsp + 24;
                        diaSemEsp = diaSemJap - 1;
                    }
                    if (diaSemEsp > 7) {
                        diaSemEsp = 1;
                    } else if (diaSemEsp<1) {
                        diaSemEsp = 7;
                    }
                    System.out.println("\n Entonces, si los datos introducidos son correctos, la hora y el dia de la semana en España serían los siguientes: ");
                    System.out.println("Es día:");
                    if (diaSemEsp == 1) {
                        System.out.println("Lunes");
                    } else if (diaSemEsp == 2) {
                        System.out.println("Martes");
                    } else if (diaSemEsp == 3) {
                        System.out.println("Miércoles");
                    } else if (diaSemEsp == 4) {
                        System.out.println("Jueves");
                    } else if (diaSemEsp == 5) {
                        System.out.println("Viernes");
                    } else if (diaSemEsp == 6) {
                        System.out.println("Sábado");
                    } else if (diaSemEsp == 7) {
                        System.out.println("Domingo");
                    }
                    System.out.println("Y la hora es:");
                    System.out.println(horasEsp + ":" + minutosEsp);


                    System.out.println("Quieres terminar1?");
                    System.out.println("1. Si   2. No");
                    int opciTerm = sc.nextInt();
                    if (opciTerm == 1) {
                        terminar2 = false;
                    } else if (opciTerm == 2) {
                        terminar2 = true;
                    } else {
                        System.out.println("Opción no válida... vuelve a introducir la opción");
                        opciTerm = sc.nextInt();
                    }
                } while (terminar2 = true);

                break;
        }

    }
}
