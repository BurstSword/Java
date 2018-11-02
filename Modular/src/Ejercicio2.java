public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 obtNomb = new Ejercicio2();
        String apellido = " Montes";
        String NombreApell;


        NombreApell = obtNomb.obtenerNombreCompleto(apellido);
        System.out.println("¡Hola " + NombreApell + "!");
    }

    String obtenerNombreCompleto(String apellidoRecib) {
        String nombre;
        nombre = "Veigar" + apellidoRecib;
        return nombre;
    }
}
