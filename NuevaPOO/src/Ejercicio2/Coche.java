package Ejercicio2;


public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(int precio, boolean motorEstaEncendido, double kmRecorridos, double gasolina, int kmPorLitro, double capacidadMaxGas, double capacidadReservaGas, int numPuertas) {
        super(precio, motorEstaEncendido, kmRecorridos, gasolina, kmPorLitro, capacidadMaxGas, capacidadReservaGas);
        this.numPuertas=numPuertas;
    }

    public Coche() {
        super(15000,
                false, 0, 0, 100, 60, 15);
        numPuertas=4;
    }


    public String toString() {
        return "El coche está " + (this.motorEstaEncendido ? "encendido" : "apagado")
                + ", tiene recorridos " + this.kmRecorridos
                + " km, tiene "
                + this.gasolina + "/" + this.capacidadMaxGas
                + " litros disponibles, gasta 1L de gasolina cada "
                + this.kmPorLitro + " km, y da el aviso de reserva cuando le quedan menos de "
                + this.capacidadReservaGas + "L";
    }

}

