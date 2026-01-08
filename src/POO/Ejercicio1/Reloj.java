package POO.Ejercicio1;

public class Reloj {
    int hora;
    int minutos;
    int segundos;
    boolean es24h;

    public Reloj() {
    }

    public void mostrar() {
        System.out.println("Son las " + hora + "h " + minutos + "minutos y " + segundos + "segundos");
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (es24h == true) {
            if (hora > 0 && hora < 24) {
                this.hora = hora;
            } else {
                System.out.println("Hora errónea");
            }
        } else {
            if (hora > 0 && hora < 12) {
                this.hora = hora;
            } else {
                hora = hora - 12;
                this.hora = hora;
            }
        }
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

    public boolean isEs24h() {
        return es24h;
    }

    public void setEs24h(boolean es24h) {
        this.es24h = es24h;
    }
}
