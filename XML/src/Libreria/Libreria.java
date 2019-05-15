package Libreria;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "libreria")
@XmlType(propOrder = {"nombre", "libros"})
public class Libreria {
    private String nombre;
    private ArrayList<Libro> libros;

    public Libreria(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public Libreria() {
        this.nombre = "";
        this.libros = new ArrayList<>();
    }

    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElementWrapper(name = "libros")
    @XmlElement(name = "libro")
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
