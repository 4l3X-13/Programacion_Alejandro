package Tema4.POO3.Ejercicio1;

enum tipo{
    profesional,particular
}

public class Turismo extends Vehiculo {
    private int plazas;
    private tipo uso;

    public Turismo(String matricula, String modelo, String marca,String color, int plazas, tipo uso) {
        super(matricula,modelo,marca,color);
        this.plazas = plazas;
        this.uso = uso;
    }

    public Turismo(){
        this("3939a","laferrari","Ferrari","rojo",4,tipo.particular);
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public tipo getUso() {
        return uso;
    }

    public void setUso(tipo uso) {
        this.uso = uso;
    }
}
