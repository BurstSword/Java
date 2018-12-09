package Biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Datos {
    private static Libro[] arrayL = {new Libro("Un monstruo viene a verme"), new Libro("La casa torcida")};
    private static Usuario[] arrayU = {new Usuario("Javier"), new Usuario("Carmen")};
    public static ArrayList<Libro> listaLibros = new ArrayList<>(Arrays.asList(arrayL));
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>(Arrays.asList(arrayU));
}
