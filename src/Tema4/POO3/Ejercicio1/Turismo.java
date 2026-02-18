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
}
