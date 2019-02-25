package Ejercicio1;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class GestoraUsuarios {
    private static String nombre;
    private static String DNI;
    private static String fechaNacimiento;
    private static String nombreUsuario;
    private static String claveAcceso;
    private static boolean mayoriaEdad;
    private static Scanner teclado = new Scanner(System.in);


    public static Persona generarPersona() {
        boolean dniCorrecto, nombreCorrecto, fechaCorrecta;
        String nombreYApellidos, dni, fechaNac;
        System.out.println("<---Bienvenido al registro--->");

        do {
            System.out.println("\nIntroduzca su nombre apellidos separados por espacios");
            nombreYApellidos = teclado.nextLine();
            nombreCorrecto = nombreYApellidos.matches("^([A-Za-z������������]{0}?[A-Za-z������������']+[\\s])+([A-Za-z������������]{0}?[A-Za-z������������'])+[\\s]?([A-Za-z������������]{0}?[A-Za-z������������'])?$");
        } while (!nombreCorrecto);

        nombreYApellidos = nombreYApellidos.toUpperCase();
        String[] codigos = nombreYApellidos.split(" ");
        nombre = codigos[0];
        nombreUsuario = Persona.generarNombreUsuario(nombreYApellidos);
        try {
            claveAcceso = Persona.generarClaveAcceso();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("\nIntroduzca su DNI en formato nnnnnnnnL");
            dni = teclado.nextLine();
            dniCorrecto = Comprobaciones.comprobarDNI(dni);
        } while (!dniCorrecto);
        DNI = dni;

        do {
            System.out.println("\nIntroduce tu fecha de nacimiento en formato yyyy/mm/dd");
            fechaNac = teclado.nextLine();
            fechaCorrecta = Comprobaciones.comprobarFecha(fechaNac);
        } while (!fechaCorrecta);

        fechaNacimiento = fechaNac;
        mayoriaEdad = Persona.esMayorEdad(fechaNac);
        return new Persona(nombre, DNI, fechaNacimiento, nombreUsuario, claveAcceso, mayoriaEdad);
    }

}
