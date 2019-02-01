package banco.MiguelEspigaresRecio;

public class CuentaBancaria {
    private String titular;
    private int numeroCuenta, dineroCuenta, retiradaMaxima;
    private boolean cuentaBloqueada;

    public CuentaBancaria(String titular, int numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.dineroCuenta = 0;
        this.retiradaMaxima = 600;
        this.cuentaBloqueada = false;
    }

    public void ingresarDinero(int dinero) {
        if(this.cuentaBloqueada==true){
            System.out.println("No puedes realizar ingresos puesto que está bloqueada tu cuenta, utilice la opción Desbloquear" +
                    " cuenta");
        }
        if (dinero <= 0) {
            System.out.println("No puede ingresar 0 euros");
        } else {
            System.out.println("Ingreso de " + dinero+ " euros realizado con éxito");
            this.dineroCuenta += dinero;
        }

    }

    public void retirarDinero(int dinero) {
        if (this.cuentaBloqueada){
            System.out.println("No puede retirar dinero ya que su cuenta se encuentra bloqueada");
        }else{
            if (dinero <= 0) {
                System.out.println("No puede retirar 0 euros");
            } else if (dinero > 600) {
                System.out.println("No puede retirar más de 600 euros");
            } else {
                System.out.println("Retirada de " + dinero + " euros realizada con éxito");
                this.dineroCuenta -= dinero;
            }
        }

    }

    public void bloquearCuenta() {
        if (this.cuentaBloqueada){

        }else{
            if (this.dineroCuenta < 0) {
                System.out.println("Cuenta bloqueada");
                this.cuentaBloqueada = true;
            }
        }

    }

    public void desbloquearCuenta(int dinero) {
        if (this.cuentaBloqueada == true) {
            if (dinero == 0) {
                System.out.println("No puede ingresar 0 euros");
            } else if (dinero < this.dineroCuenta) {
                System.out.println("No puede realizar el ingreso puesto que la cuenta seguiriía bloqueada");
            } else {
                this.dineroCuenta += dinero;
                this.cuentaBloqueada = false;
                System.out.println("Cuenta desbloqueada con éxito");
            }
        }
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDineroCuenta() {
        return dineroCuenta;
    }

    public void setDineroCuenta(int dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }

    public int getRetiradaMaxima() {
        return retiradaMaxima;
    }

    public void setRetiradaMaxima(int retiradaMaxima) {
        this.retiradaMaxima = retiradaMaxima;
    }

    public boolean isCuentaBloqueada() {
        return cuentaBloqueada;
    }

    public void setCuentaBloqueada(boolean cuentaBloqueada) {
        this.cuentaBloqueada = cuentaBloqueada;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", dineroCuenta=" + dineroCuenta +
                ", retiradaMaxima=" + retiradaMaxima +
                ", cuentaBloqueada=" + cuentaBloqueada +
                '}';
    }
}
