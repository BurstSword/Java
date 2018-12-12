package Biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Datos {
    private static Libro[] arrayL = {new Libro("Un monstruo viene a verme"), new Libro("La casa torcida"),
            new Libro("El Señor de los Anillos"), new Libro("Artemis Fowl"), new Libro("Teo va al parque")};
    private static Usuario[] arrayU = {new Usuario("Javier"), new Usuario("Carmen"), new Usuario ("María"),
            new Usuario("Isabel"), new Usuario("David")};

    public static ArrayList<Libro> listaLibros = new ArrayList<>(Arrays.asList(arrayL));
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>(Arrays.asList(arrayU));
}
