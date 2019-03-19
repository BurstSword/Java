
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Datos.AlmacenArmas;
import Entidades.Arma;

public class CombateMain {
    public static void main(String[] args) {

        int opcion = ControlEntradaTeclado.controlNumero();

        switch (opcion) {

            case 1://Crear personaje
                ControlEntradaTeclado.crearGuerrero();
                ControlEntradaTeclado.crearMonstruo();
                break;
            case 2: //Luchar

                break;
            case 3: //Lanzar dado

                break;

        }
    }
}


