package Tema7.Funkos2;

public class Funko {
    private String code;
    private String nombre;
    private String modelo;
    private double precio;
    private String fecha_lanzamiento;

    public Funko(String code, String nombre, String modelo, double precio, String fecha_lanzamiento) {
        this.code = code;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    @Override
    public String toString() {
        return code + ", " + nombre + ", " + modelo + ", " + precio + ", " + fecha_lanzamiento;
    }
}
