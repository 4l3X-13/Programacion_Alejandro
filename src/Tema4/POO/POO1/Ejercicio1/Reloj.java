package Tema4.POO.POO1.Ejercicio1;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    private boolean es24h;

    public void mostrar() {
        System.out.println("Son las " + hora + "h " + minutos + "minutos y " + segundos + "segundos");
    }

    @Override
    public String toString() {
        return "Son las " + hora + "h " + minutos + " minutos y " + segundos + " segundos :)";
    }
    public void setHora(int hora) {
        if (es24h) {
            if (hora >= 0 && hora <= 24) {
                this.hora = hora;
            } else {
                System.out.println("Hora errónea en formato 24h");
            }
        } else {
            if (hora >= 1 && hora <= 12) {
                this.hora = hora;
            } else {
                System.out.println("Hora errónea en formato 12h");
            }
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos erróneos");
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos erróneos");
        }
    }

    public void setEs24h(boolean es24h) {
        this.es24h = es24h;
    }



}
