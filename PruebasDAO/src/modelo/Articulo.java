package modelo;

public class Articulo {
   private int id_articulo;
   private String nombre;
   private double importe;
   private double descuento;

    public Articulo(int id_articulo, String nombre, double importe, double descuento) {
        this.id_articulo = id_articulo;
        this.nombre = nombre;
        this.importe = importe;
        this.descuento = descuento;
    }

    public Articulo(){

    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
