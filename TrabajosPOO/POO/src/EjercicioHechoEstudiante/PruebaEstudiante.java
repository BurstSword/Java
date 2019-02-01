package EjercicioHechoEstudiante;

public class PruebaEstudiante {

    //Método constructor
    public PruebaEstudiante() {

    }

    //Método main
    public static void main(String args[])   {
        //Creo al estudiante nº1 y le doy valor a su nombre:
        Estudiante estudiante1 = new Estudiante("Pepe", 0.0);

        //Muestro el estado actual del objeto, para ello, llamo al método toString:
        System.out.println("Estado del objeto al crearlo: " + estudiante1.toString());

        //Si durante el programa necesitara cambiar el valor del atributo "notaMedia" del objeto "estudiante1" tendría que utilizar el setNotaMedia:
        estudiante1.setNotaMedia(8);

        //Muestro el estado actual del objeto, para ello, llamo al método toString:
        System.out.println("Estado del objeto al modificar la nota: " + estudiante1.toString());
    }


}