package Tema8.RepasoSQL;

public class Asignatura {

    private int idAsignatura;
    private String nombre;
    private String aula;
    private Boolean obligatoria;

    public Asignatura() {
    }

    public Asignatura(int idAsignatura, String nombre, String aula, Boolean obligatoria) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.aula = aula;
        this.obligatoria = obligatoria;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "idAsignatura=" + idAsignatura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}