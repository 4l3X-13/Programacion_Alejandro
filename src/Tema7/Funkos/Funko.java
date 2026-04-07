package Tema7.Funkos;

public class Funko implements java.io.Serializable {
    private String cod, nombre, modelo;
    private double precio;
    private String fecha;

    public Funko(String cod, String nombre, String modelo, double precio, String fecha) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }
}