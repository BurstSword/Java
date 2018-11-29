package Ejercicio2Redux;

public class Main {
    public static void main(String[] args) {
        Bombilla bomb1 = new Bombilla(false);


        if (bomb1.getEncendida()){
            bomb1.Apagar();
        }
        else{
            bomb1.Encender();
        }
        System.out.println(bomb1.getEncendida());
    }

}
