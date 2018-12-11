package Coche;

public class Coche {
    private boolean motorEstaEncendido;
    private double kmRecorridos;
    private double gasolina;
    private int kmPorLitro;
    private double capacidadMaxGas;
    private double capacidadReservaGas;

    public Coche() {
        this.motorEstaEncendido = false;
        this.kmRecorridos = 0;
        this.gasolina = 0;
        this.kmPorLitro = 100;
        this.capacidadMaxGas = 60;
        this.capacidadReservaGas = 15;
    }

    public Coche(boolean motorEstaEncendido, double kmRecorridos, double gasolina, int kmPorLitro, double capacidadMaxGas, double capacidadReservaGas) {
        this.motorEstaEncendido = motorEstaEncendido;
        this.kmRecorridos = kmRecorridos;
        this.gasolina = gasolina;
        this.kmPorLitro = kmPorLitro;
        this.capacidadMaxGas = capacidadMaxGas;
        this.capacidadReservaGas = capacidadReservaGas;
    }

    /**
     * Esta función enciende el motor si está apagado, si no está apagado, no lo enciende porque no puede
     * Devuelve true si se ha podido encender el motor, en caso contrario, false
     * @return Boolean
     */
    public boolean encenderMotor() {
        boolean motorHaArrancado;

        if (this.motorEstaEncendido) {
            motorHaArrancado = false;

        } else {
            motorHaArrancado = true;
            this.motorEstaEncendido = true;
        }
        return motorHaArrancado;
    }

    /**
     * Esta función apaga el motor si está encendido, si no está encendido, no lo apaga porque no puede
     * Devuelve true si se ha podido apagar el motor, en caso contrario, false
     *
     * @return Boolean
     */
    public boolean apagarMotor() {
        boolean motorSeHaApagado;

        if (!this.motorEstaEncendido) {
            motorSeHaApagado = false;

        } else {
            motorSeHaApagado = true;
            this.motorEstaEncendido = false;
        }
        return motorSeHaApagado;
    }

    /**
     * Esta función baja la gasolina disponible en función de cuantos kilómetros vaya a rodar.
     * Devuelve -1 en caso de que no se haya podido rodar esos kilómetros porque no tiene nada de gasolina
     * Devuelve -2 en caso de que no tenga gasolina suficiente
     * Devuelve -3 en caso de que el coche esté apagado
     * Si se pueden rodar, devuelve la cantidad de gasolina restante
     *
     * @param kilometros Los kilómetros a rodar
     * @return double
     */
    public double rodarKilometros(double kilometros) {
        double ret;
        double litrosDeGasolinaConsumidos;

        if (!this.motorEstaEncendido) {
            ret = -3;
        }
        else if (this.gasolina == 0) {
            ret = -1;
        } else {
            litrosDeGasolinaConsumidos = kilometros / this.kmPorLitro;
            if (litrosDeGasolinaConsumidos > this.gasolina) {
                this.kmRecorridos += this.kmPorLitro * this.gasolina;
                this.gasolina = 0;
                ret = -2;

            } else {
                this.kmRecorridos += kilometros;
                this.gasolina -= litrosDeGasolinaConsumidos;
                ret = this.gasolina;
            }
        }
        return ret;
    }

    /**
     * Este procedimiento nos muestra el mensaje de que necesitamos echar gasolina si hemos llegado a la reserva
     * En caso contrario no nos muestra nada
     */
    public void avisoReserva() {
        if (this.gasolina < this.capacidadReservaGas) {
            System.out.println("Se encuentra usted en reserva, debería echar gasolina antes de recorrer "
                    + (this.gasolina / this.kmPorLitro) + " kilómetros");
        }
    }

    /**
     * Este procedimiento nos llena el depósito del coche con el valor máximo del tanque de gasolina
     */
    public void llenarDeposito() {
        this.gasolina = this.capacidadMaxGas;
    }

    @Override
    public String toString() {
        return "El coche está " +(this.motorEstaEncendido ? "encendido":"apagado")
                +", tiene recorridos " +this.kmRecorridos
                +" km, tiene "
                + this.gasolina+"/"+this.capacidadMaxGas
                +" litros disponibles, gasta 1L de gasolina cada "
                +this.kmPorLitro+" km, y da el aviso de reserva cuando le quedan menos de "
                +this.capacidadReservaGas+"L";
    }
}
