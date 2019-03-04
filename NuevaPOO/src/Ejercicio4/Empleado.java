package Ejercicio4;

abstract class Empleado {
    private int nomina;
    private String rangoSal;
    private int antigüedad;

    public Empleado(int nomina, String rangoSal, int antigüedad) {
        this.nomina = nomina;
        this.rangoSal = rangoSal;
        this.antigüedad = antigüedad;
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

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nomina=" + nomina +
                ", rangoSal='" + rangoSal + '\'' +
                ", antigüedad=" + antigüedad +
                '}';
    }
}
