package POO.Ejercicio1;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();

        reloj.setEs24h(true);
        reloj.setHora(23);
        reloj.setMinutos(45);
        reloj.setSegundos(23);

        System.out.println(reloj);
    }
}
