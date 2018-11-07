package boletin4;

public class Ejercicio5 {
    public static void main(String[] args) {
        int dimensionArray, sumatorio;
        int[] numeros;

        dimensionArray = Ejercicio5Funciones.pedirDimensionArray();
        numeros = Ejercicio5Funciones.cargarArray(dimensionArray);
        sumatorio = Ejercicio5Funciones.sumarValores(numeros);
        Ejercicio5Funciones.mostrarResultado(sumatorio);

        //Ejercicio5Funciones.mostrarResultado(Ejercicio5Funciones.sumarValores(Ejercicio5Funciones.cargarArray(Ejercicio5Funciones.pedirDimensionArray())));
    }
}
