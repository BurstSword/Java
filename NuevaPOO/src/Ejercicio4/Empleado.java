package Ejercicio4;

abstract class Empleado {
    private int nomina;
    private String rangoSal;
    private int antig�edad;

    public Empleado(int nomina, String rangoSal, int antig�edad) {
        this.nomina = nomina;
        this.rangoSal = rangoSal;
        this.antig�edad = antig�edad;
    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public String getRangoSal() {
        return rangoSal;
    }

    public void setRangoSal(String rangoSal) {
        this.rangoSal = rangoSal;
    }

    public int getAntig�edad() {
        return antig�edad;
    }

    public void setAntig�edad(int antig�edad) {
        this.antig�edad = antig�edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nomina=" + nomina +
                ", rangoSal='" + rangoSal + '\'' +
                ", antig�edad=" + antig�edad +
                '}';
    }
}
