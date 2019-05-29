package Ejercicio2BBDD.controlador;

import Ejercicio2BBDD.modelo.MascotaDAOImplementacion;
import Ejercicio2BBDD.vista.MostrarVista;

public class ControladorClinica {

    public void controlarMenu() {
        int opcion;
        MostrarVista mostrarVista = new MostrarVista();
        MascotaDAOImplementacion mascotaDAOImplementacion = new MascotaDAOImplementacion();
        do {
            opcion = mostrarVista.mostrarMenu();
            switch (opcion) {
                case 1:
                    mascotaDAOImplementacion.insertarMascota(mostrarVista.introducirMascota());
                    break;
                case 2:
                    mostrarVista.mostrarMascotas(mascotaDAOImplementacion.mostrarMascotas());
                    break;
                case 3:
                    mostrarVista.mostrarMascotas(mascotaDAOImplementacion.mostrarMascotasOrdenadas());
                case 4:
                    mostrarVista.mostrarMascotaNecesitaVacuna(mascotaDAOImplementacion.mostrarMascotaNecesitaVacuna(mostrarVista.introducirID(mascotaDAOImplementacion.mostrarMascotas())));
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }

        } while (opcion != 5);

    }
}
