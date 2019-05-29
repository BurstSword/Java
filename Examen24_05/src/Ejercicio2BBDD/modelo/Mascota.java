package Ejercicio2BBDD.modelo;

public class Mascota {
    private int idMascota;
    private String tipo;
    private String nombre;
    private int edad;
    private String raza;
    private int anyoVacuna;

    public Mascota(int idMascota, String tipo, String nombre, int edad, String raza, int anyoVacuna) {
        this.idMascota = idMascota;
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.anyoVacuna = anyoVacuna;
    }

    public Mascota(){
        this.idMascota = 0;
        this.tipo = "";
        this.nombre = "";
        this.edad = 0;
        this.raza = "";
        this.anyoVacuna = 0;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnyoVacuna() {
        return anyoVacuna;
    }

    public void setAnyoVacuna(int anyoVacuna) {
        this.anyoVacuna = anyoVacuna;
    }
}
