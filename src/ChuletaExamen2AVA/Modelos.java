package ChuletaExamen2AVA;

// ENUM: Conjunto de constantes fijas
enum Turno { MAÑANA, TARDE, NOCHE }

// CLASE ABSTRACTA: No se puede hacer 'new Persona()', sirve de molde
abstract class Persona {
    String nombre;
    int edad;

    // STATIC: Atributo que pertenece a la clase (contador global)
    static int contadorPersonas = 0;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++; // Cada vez que alguien herede e instancie, aumenta
    }

    // Método abstracto: Obliga a los hijos a implementarlo
    public abstract void presentarse();
}

// HERENCIA: Estudiante hereda de Persona
class Estudiante extends Persona {
    String carrera;
    Turno turnoActual = Turno.MAÑANA; // Uso del Enum

    public Estudiante(String nombre, int edad, String carrera) {
        // super(): Llama al constructor del padre (Persona)
        super(nombre, edad);
        this.carrera = carrera;
    }

    // Implementación obligatoria del método abstracto
    @Override
    public void presentarse() {
        System.out.println("Soy " + nombre + " y estudio " + carrera);
    }
}