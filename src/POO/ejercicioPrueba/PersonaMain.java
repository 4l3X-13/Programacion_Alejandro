package POO.ejercicioPrueba;

public class PersonaMain {

    public static void main(String[] args){
        Persona persona = new Persona();

        persona.nombre = "Ana";
        persona.edad = 35;

        persona.saludar();
        persona.presentarme();
        persona.saludarA("Ximo");

    }
}