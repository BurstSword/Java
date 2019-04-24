public class AparatosElectrónicos {
    private String marca, modelo;
    private int codigo;
    private boolean estropeadoSoftware;

    public AparatosElectrónicos(String marca, String modelo, int codigo, boolean estropeadoSoftware) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.estropeadoSoftware = estropeadoSoftware;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isEstropeadoSoftware() {
        return estropeadoSoftware;
    }

    public void setEstropeadoSoftware(boolean estropeadoSoftware) {
        this.estropeadoSoftware = estropeadoSoftware;
    }
}
