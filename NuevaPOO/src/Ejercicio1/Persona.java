
package Ejercicio1;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;


public class Persona {
    private String nombre;
    private String DNI;
    private String fechaNacimiento;
    private String nombreUsuario;
    private String claveAcceso;
    private boolean mayorEdad;


    public Persona(String nombre, String DNI, String fechaNacimiento, String nombreUsuario, String claveAcceso, boolean mayorEdad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreUsuario = nombreUsuario;
        this.claveAcceso = claveAcceso;
        this.mayorEdad = mayorEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public static String generarNombreUsuario(String nombreYApellidos) {
        String nombreUser;
        nombreYApellidos = nombreYApellidos.toUpperCase();
        String[] codigos = nombreYApellidos.split(" ");

        nombreUser = codigos[1].substring(0, 3) + codigos[2].substring(0, 3) + codigos[0].substring(0, 3);

        return nombreUser;
    }

    public static String generarClaveAcceso() {
        String[] simbolos = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
        int medida = 10;
        Random random = null;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder(medida);
        for (int i = 0; i < medida; i++) {
            int indiceAleatorio = random.nextInt(simbolos.length);
            sb.append(simbolos[indiceAleatorio]);
        }
        return sb.toString();
    }

    public static boolean esMayorEdad(String fechaNac) {
        boolean mayor18;
        String[] fecha = fechaNac.split("/");
        int dia, mes, anho;
        dia = Integer.parseInt(fecha[2]);
        mes = Integer.parseInt(fecha[1]);
        anho = Integer.parseInt(fecha[0]);
        GregorianCalendar fechaNa = new GregorianCalendar(anho, mes, dia);
        Calendar fechaActual = Calendar.getInstance();


        int years = fechaActual.get(Calendar.YEAR) - fechaNa.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNa.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNa.get(Calendar.DAY_OF_MONTH);

        if (months < 0
                || (months == 0 && days < 0)) {
            years--;
        }
        if (years >= 18) {
            mayor18 = true;
        } else {
            mayor18 = false;
        }
        return mayor18;

    }

    @Override
    public String toString() {
        return "\nUsuario " + nombre + " con nombre de usuario " + nombreUsuario + ", nacido el " + fechaNacimiento + " y con DNI " + DNI + (mayorEdad ? " siendo mayor de edad" : "siendo menor de edad") +
                " ha sido registrado con éxito." +
                "\nSu clave de acceso ha sido generada aleatoriamente y es la siguiente: " + claveAcceso;
    }
}

