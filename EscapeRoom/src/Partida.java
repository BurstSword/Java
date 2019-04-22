public class Partida {
    private String nombreEquipo;
    private int Tiempo;
    private String itinerario;

    public Partida(String nombreEquipo, int tiempo, String itinerario) {
        this.nombreEquipo = nombreEquipo;
        this.Tiempo = tiempo;
        this.itinerario = itinerario;
    }


    public void itinerarioFacil(){
        this.itinerario="Facil";
    }

    public void itinerarioDificil(){
        this.itinerario="Dificil";
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int tiempo) {
        Tiempo = tiempo;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }
}
