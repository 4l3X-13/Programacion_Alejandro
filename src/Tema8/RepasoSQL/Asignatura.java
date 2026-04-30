package Tema8.RepasoSQL;

public class Asignatura {
    public String id;
    public String nombre;
    public int aula;

    public Asignatura(String id, String nombre, int aula) {
        this.id = id;
        this.nombre = nombre;
        this.aula = aula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", aula=" + aula +
                '}';
    }
}
