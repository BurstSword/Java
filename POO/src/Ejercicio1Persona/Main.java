package Ejercicio1Persona;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Persona Pers1 = new Persona();
        Persona Pers2 = new Persona();
        //Persona Pers3 = new Persona("Óscar", 19, "Negro", 50, 180);

        Pers1.setNombre("María");
        Pers1.setEdad(20);
        Pers1.setColorPelo("Castaño");
        Pers1.setPeso(54);
        Pers1.setAltura(163);


        Pers2.setNombre("Fran");
        Pers2.setEdad(30);
        Pers2.setColorPelo("Rubio");
        Pers2.setPeso(80);
        Pers2.setAltura(180);


        Pers1.Hablar("María dice hola");
        Pers2.Hablar("Fran dice adiós");
        System.out.println(Pers1.toString());
        System.out.println(Pers2.toString());
        //System.out.println(Pers3.toString());

        if (Pers1.getAltura()>Pers2.getAltura()){
            System.out.println(Pers1.toString());
        }
        else{
            System.out.println(Pers2.toString());
        }
    }


}