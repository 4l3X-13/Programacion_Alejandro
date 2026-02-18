package Tema4.POO3.Ejercicio1;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private String color;

    public Vehiculo(String matricula, String modelo, String marca, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
