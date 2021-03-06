package Ejercicio4;

abstract class Empleado {
    private int nomina;
    private String rangoSal;
    private int antigŁedad;

    public Empleado(int nomina, String rangoSal, int antigŁedad) {
        this.nomina = nomina;
        this.rangoSal = rangoSal;
        this.antigŁedad = antigŁedad;
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

    public int getAntigŁedad() {
        return antigŁedad;
    }

    public void setAntigŁedad(int antigŁedad) {
        this.antigŁedad = antigŁedad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nomina=" + nomina +
                ", rangoSal='" + rangoSal + '\'' +
                ", antigŁedad=" + antigŁedad +
                '}';
    }
}
