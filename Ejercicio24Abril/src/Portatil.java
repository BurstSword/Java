public class Portatil extends AparatosElectrónicos {
    private boolean reparadoEnRemoto;

    public Portatil(String marca, String modelo, int codigo, boolean estropeadoSoftware, boolean reparadoEnRemoto) {
        super(marca, modelo, codigo, estropeadoSoftware);
        this.reparadoEnRemoto = reparadoEnRemoto;
    }

    public void repararEnRemoto() {
        if (!isEstropeadoSoftware()) {
            System.out.println("No tiene nada que reparar");
        } else {
            System.out.println("Reparado con exito");
            this.reparadoEnRemoto = true;
            this.setEstropeadoSoftware(false);
        }
    }

    public void repararPresencial() {
        if (!isEstropeadoSoftware()) {
            System.out.println("No tiene nada que reparar");
        } else {
            System.out.println("Reparado con exito");
            this.reparadoEnRemoto = false;
            this.setEstropeadoSoftware(false);
        }
    }


    public boolean isReparadoEnRemoto() {
        return reparadoEnRemoto;
    }

    public void setReparadoEnRemoto(boolean reparadoEnRemoto) {
        this.reparadoEnRemoto = reparadoEnRemoto;
    }

    @Override
    public String toString() {
        return "El portatil de la marca " + this.getMarca() + ", modelo " + this.getModelo() + " y codigo "
                + this.getCodigo() + " " +
                ((this.isEstropeadoSoftware()) ? "tiene un problema en su software" : " no tiene ningún problema en su software") +
                ((this.isReparadoEnRemoto()) ? " y ha sido reparado en remoto" : " y no ha sido reparado en remoto");
    }
}
