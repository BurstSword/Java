package EjercicioHechoEstudiante;

public class Estudiante {
    // ---------------- Atributos de la clase ----------------
    private String nombre;
    private double notaMedia;

    // ---------------- Métodos de la clase ----------------

    //Método constructor
    public Estudiante(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    //Métodos Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    //Método toString:
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
    }
}