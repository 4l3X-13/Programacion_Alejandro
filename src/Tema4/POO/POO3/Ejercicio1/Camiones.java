package Tema4.POO3.Ejercicio1;

enum Peligroso {
    peligroso, seguro
}

public class Camiones extends Vehiculo {
    private double pesoMax;
    private Peligroso esPeligroso;

    public Camiones(String matricula, String modelo, String marca, String color, double pesoMax, Peligroso esPeligroso) {
        super(matricula, modelo, marca, color);
        this.pesoMax = pesoMax;
        this.esPeligroso = esPeligroso;
    }

    public Camiones() {
        this("82844a","Benz","Mercedes","negro",400, Peligroso.peligroso);
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public Peligroso getEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(Peligroso esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    @Override
    public String toString() {
        return "Camiones{" +
                "pesoMax=" + pesoMax +
                ", esPeligroso=" + esPeligroso +
                '}';
    }
}
