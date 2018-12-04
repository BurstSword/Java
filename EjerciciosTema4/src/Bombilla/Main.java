package Bombilla;

public class Main {
    public static void main(String[] args) {
        PruebaBombilla bomb1 = new PruebaBombilla();
        int contEncender = 0;


        for (int i = 0; i <= 200; i++) {
            if (bomb1.getEncendida()) {
                bomb1.Apagar();
            } else {
                bomb1.Encender();
                contEncender++;
            }
            if (contEncender == 100) {
                bomb1.setFundida(true);
            }
        }

        System.out.println(bomb1.getFundida());
    }
}
