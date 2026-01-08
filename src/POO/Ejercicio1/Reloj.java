package POO.Ejercicio1;

public class Reloj {
    Reloj reloj = new Reloj();
    int hora;
    int minutos;
    int segundos;

    public Reloj() {
        this.reloj = reloj;
    }

    public void mostrar (){
        System.out.println(reloj);
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
