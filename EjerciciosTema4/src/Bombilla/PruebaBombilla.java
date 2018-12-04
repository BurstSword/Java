package Bombilla;

public class PruebaBombilla {
    public static void main(String[] args) {
        Bombilla bomb1 = new Bombilla();

        for (int i = 0; i <= 200; i++) {
            if (bomb1.isEncendida()) {
                bomb1.Apagar();
            } else {
                bomb1.Encender();
                bomb1.setContadorEncendido(bomb1.getContadorEncendido() + 1);
            }
            if (bomb1.getContadorEncendido() == 100) {
                bomb1.setFundida(true);
            }
        }

    }

}
