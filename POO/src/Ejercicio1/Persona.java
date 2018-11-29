package Ejercicio1;

public class Persona {
    private String nombre;
    private int edad;
    private String colorPelo;
    private int peso;
    private int altura;


    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.colorPelo = "";
        this.peso = 0;
        this.altura = 0;

    }


    public Persona(String nNombre, int nEdad, String nColorPelo, int nPeso, int nAltura) {
        this.nombre = nNombre;
        this.edad = nEdad;
        this.colorPelo = nColorPelo;
        this.peso = nPeso;
        this.altura = nAltura;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
