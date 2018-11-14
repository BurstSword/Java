package boletin4;

public class Ejercicio5SumaArray {
    public static void main(String[] args) {
        //Declaramos las variables del array, el número de la dimensión de la misma//
        // y dónde almacenaremos la suma de los valores del array//
        int dimensionArray, sumatorio;
        int[] numeros;

        //Hacemos las llamadas a los métodos para realizar el ejercicio//
        dimensionArray = Ejercicio5Funciones.pedirDimensionArray();
        numeros = Ejercicio5Funciones.cargarArray(dimensionArray);
        sumatorio = Ejercicio5Funciones.sumarValores(numeros);
        Ejercicio5Funciones.mostrarResultado(sumatorio);

        //Ejercicio5Funciones.mostrarResultado(Ejercicio5Funciones.sumarValores(Ejercicio5Funciones.cargarArray(Ejercicio5Funciones.pedirDimensionArray())));
    }
}
