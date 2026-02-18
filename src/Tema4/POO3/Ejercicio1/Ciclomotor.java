package Tema4.POO3.Ejercicio1;

public class Ciclomotor extends Vehiculo {
    private int cilindrada;
    private boolean necesitaCarnet;

    public Ciclomotor(String matricula, String modelo, String marca, String color, int cilindrada,boolean necesitaCarnet) {
        super(matricula, modelo, marca, color);
        this.cilindrada = cilindrada;
        this.necesitaCarnet = necesitaCarnet;
    }

    public Ciclomotor() {
        this("7362e","knucklehead","Harley Davidson","negra",240, true);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isNecesitaCarnet() {
        return necesitaCarnet;
    }

    public void setNecesitaCarnet(boolean necesitaCarnet) {
        this.necesitaCarnet = necesitaCarnet;
    }

    @Override
    public String toString() {
        return "Ciclomotor{" +
                "cilindrada=" + cilindrada +
                ", necesitaCarnet=" + necesitaCarnet +
                '}';
    }
}