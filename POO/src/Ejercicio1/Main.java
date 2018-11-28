package Ejercicio1;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Persona Pers1 = new Persona();
        Persona Pers2 = new Persona();


        Pers1.nombre = "María";
        Pers1.edad = 20;
        Pers1.colorPelo = "Castaño";
        Pers1.peso = 54;
        Pers1.altura = 163;


        Pers2.nombre = "Fran";
        Pers2.edad = 30;
        Pers2.colorPelo = "Rubio";
        Pers2.peso = 80;
        Pers2.altura = 173;

        Pers1.Hablar("María dice hola");
        Pers2.Hablar("Fran dice adiós");
        System.out.println(Pers1.toString());
        System.out.println(Pers2.toString());
    }


}