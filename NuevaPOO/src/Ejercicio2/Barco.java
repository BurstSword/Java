package Ejercicio2;

public class Barco extends Vehiculo {


    public Barco(int precio, boolean motorEstaEncendido, double kmRecorridos, double gasolina, int kmPorLitro, double capacidadMaxGas, double capacidadReservaGas) {
        super(precio, motorEstaEncendido, kmRecorridos, gasolina, kmPorLitro, capacidadMaxGas, capacidadReservaGas);
    }

    public Barco() {
        super(35000, false, 0, 0, 250, 1000, 150);
    }

    public String toString() {
        return "El barco está " + (this.motorEstaEncendido ? "encendido" : "apagado")
                + ", tiene recorridos " + this.kmRecorridos
                + " km, tiene "
                + this.gasolina + "/" + this.capacidadMaxGas
                + " litros disponibles, gasta 1L de gasolina cada "
                + this.kmPorLitro + " km, y da el aviso de reserva cuando le quedan menos de "
                + this.capacidadReservaGas + "L";
    }


}
