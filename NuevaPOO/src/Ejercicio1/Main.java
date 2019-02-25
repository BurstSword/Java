package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona;

        persona = GestoraUsuarios.generarPersona();

        System.out.println(persona.toString());
    }
}
