package comandas.MiguelEspigaresRecio;

public class Camarero {
    private String comanda;
    private boolean comandaLista;

    public Camarero(String comanda) {
        this.comanda = comanda;
        this.comandaLista = false;
    }


    public String getComanda() {
        return comanda;
    }

    public void setComanda(String comanda) {
        this.comanda = comanda;
    }
}
