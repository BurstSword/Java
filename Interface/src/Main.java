import Entidades.Ganso;
import Entidades.Helicoptero;
import Entidades.Leon;

public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon();
        Ganso ganso = new Ganso();
        Helicoptero helicoptero = new Helicoptero();

        leon.correr();
        leon.desplazarse(0, 7);
        leon.comunicarse();


        ganso.despegar();
        ganso.volar();
        ganso.desplazarse(0, 7);
        ganso.aterrizar();
        ganso.correr();
        ganso.comunicarse();

        helicoptero.despegar();
        helicoptero.volar();
        helicoptero.desplazarse(0, 9);
        helicoptero.aterrizar();
    }
}
