package Ejercicio2;

public abstract class Vehiculo {
    protected int precio;
    protected boolean motorEstaEncendido;
    protected double kmRecorridos;
    protected double gasolina;
    protected final int kmPorLitro;
    protected final double capacidadMaxGas;
    protected final double capacidadReservaGas;

    public Vehiculo(int precio, boolean motorEstaEncendido, double kmRecorridos, double gasolina, int kmPorLitro, double capacidadMaxGas, double capacidadReservaGas) {
        this.precio = precio;
        this.motorEstaEncendido = motorEstaEncendido;
        this.kmRecorridos = kmRecorridos;
        this.gasolina = gasolina;
        this.kmPorLitro = kmPorLitro;
        this.capacidadMaxGas = capacidadMaxGas;
        this.capacidadReservaGas = capacidadReservaGas;
    }

    public Vehiculo() {
        this.precio = 0;
        this.motorEstaEncendido = false;
        this.kmRecorridos = 0;
        this.gasolina = 0;
        this.kmPorLitro = 0;
        this.capacidadMaxGas = 0;
        this.capacidadReservaGas = 0;
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
     * Devuelve -3 en caso de que el vehículo esté apagado
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
        } else if (this.gasolina == 0) {
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
     * Este procedimiento nos llena el depósito del vehículo con el valor máximo del tanque de gasolina
     */
    public void llenarDeposito() {
        this.gasolina = this.capacidadMaxGas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isMotorEstaEncendido() {
        return motorEstaEncendido;
    }

    public void setMotorEstaEncendido(boolean motorEstaEncendido) {
        this.motorEstaEncendido = motorEstaEncendido;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public int getKmPorLitro() {
        return kmPorLitro;
    }

    public double getCapacidadMaxGas() {
        return capacidadMaxGas;
    }

    public double getCapacidadReservaGas() {
        return capacidadReservaGas;
    }


}


