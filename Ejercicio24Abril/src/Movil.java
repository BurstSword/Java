public class Movil extends AparatosElectrónicos implements PantallaReparable {
    private boolean pantallaRota;

    public Movil(String marca, String modelo, int codigo, boolean estropeadoSoftware, boolean pantallaRota) {
        super(marca, modelo, codigo, estropeadoSoftware);
        this.pantallaRota = pantallaRota;
    }


    public void repararMovil() {
        if (!isEstropeadoSoftware()) {
            System.out.println("No tiene nada que reparar");
        } else {
            this.setEstropeadoSoftware(false);
        }
    }


    public boolean isPantallaRota() {
        return pantallaRota;
    }

    public void setPantallaRota(boolean pantallaRota) {
        this.pantallaRota = pantallaRota;
    }

    @Override
    public void repararPantalla() {
        if (!this.isPantallaRota()) {
            System.out.println("Su pantalla no necesita ser reparada");
        } else {
            this.pantallaRota = false;
            System.out.println("Reparado con éxito");
        }

    }

    @Override
    public void analizarPantalla() {
        System.out.println("Está rota");
    }

    @Override
    public void comprarPiezasPantalla() {
        System.out.println("Piezas compradas");
    }

    @Override
    public String toString() {
        return "El movil de la marca " + this.getMarca() + ", modelo " + this.getModelo() + " y codigo "
                + this.getCodigo() + " " + ((this.isPantallaRota()) ? " sufre una rotura de pantalla" : "tiene la pantalla en perfectas condiciones") +
                ((this.isEstropeadoSoftware()) ? " y su software no funciona" : " y no tiene ningún problema en su software");
    }
}
