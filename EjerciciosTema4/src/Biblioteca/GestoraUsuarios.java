package Biblioteca;

public class GestoraUsuarios {
    public static boolean comprobarLibrosAlquilados(int IDUsuario) {
        boolean tieneLibrosAlquilados = false;
        for (int j = 0; j < Datos.listaLibros.size() && !tieneLibrosAlquilados; j++) {
            if (Datos.listaLibros.get(j).getIDusuario() == IDUsuario) {
                tieneLibrosAlquilados = true;
            }
        }

        return tieneLibrosAlquilados;
    }
}
