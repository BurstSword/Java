package Biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Datos {
    private static Publicacion[] arrayP = {new Libro("Un monstruo viene a verme"), new Libro("La casa torcida"),
            new Revista("Vogue"), new Revista("Cosmopolitan")};
    private static Usuario[] arrayU = {new Usuario("Javier"), new Usuario("Carmen")};

    public static ArrayList<Publicacion> listaPublicaciones = new ArrayList<>(Arrays.asList(arrayP));
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>(Arrays.asList(arrayU));
}
