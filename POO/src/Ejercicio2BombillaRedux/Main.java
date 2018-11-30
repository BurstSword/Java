

package Ejercicio2BombillaRedux;

public class Main {
    public static void main(String[] args) {
        Bombilla bomb1 = new Bombilla();


        if (bomb1.getEncendida()) {
            bomb1.Apagar();
        } else {
            bomb1.Encender();
        }
        System.out.println(bomb1.getEncendida());


    }


}
