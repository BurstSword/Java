package Ejercicio1;

public class Persona {
    public String nombre;
    public int edad;
    public String colorPelo;
    public int peso;
    public int altura;

    public Persona() {


    }

    public static void Hablar(String Mensaje) {
        System.out.println(Mensaje);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", colorPelo='" + colorPelo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
