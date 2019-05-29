package Ejercicio2BBDD.vista;

import Ejercicio2BBDD.modelo.Mascota;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MostrarVista {
    private Scanner teclado;

    public MostrarVista() {

    }

    public int mostrarMenu() {
        int opcion = -1;
        System.out.println("Bienvenido a la clinica veterinaria");
        System.out.println("1. Insertar nueva mascota");
        System.out.println("2. Mostrar todas las mascotas");
        System.out.println("3. Mostrar todas las mascotas ordenadas por edad");
        System.out.println("4. Consultar si una mascota concreta necesita una vacuna");
        System.out.println("5. Salir");

        teclado = new Scanner(System.in);
        do {


            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Numero incorrecto");
            }
        } while (opcion < 1 || opcion > 5);

        return opcion;
    }

    public void mostrarMascotas(ArrayList<Mascota> mascotas) {

        for (Mascota mascota : mascotas) {
            System.out.println("ID: " + mascota.getIdMascota());
            System.out.println("Tipo: " + mascota.getTipo());
            System.out.println("Nombre: " + mascota.getNombre());
            System.out.println("Edad: " + mascota.getEdad());
            System.out.println("Raza: " + mascota.getRaza());
            System.out.println("Anyo Vacuna: " + mascota.getAnyoVacuna());
            System.out.println("-------------------------------------------");

        }
    }

    public void mostrarMascotaNecesitaVacuna(Mascota mascota) {
        if (mascota != null) {
            System.out.println(mascota.getNombre() + " necesita vacunarse");
        }else{
            System.out.println("Tu mascota no necesita vacunarse");
        }
    }

    public int introducirID(ArrayList<Mascota> mascotas) {
        int id = -1;
        do {
            try {
                System.out.println("Introduzca el ID de su animal");
                id = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ID incorrecto");
            }
        } while (id < 1 || id > mascotas.size());


        return id;
    }

    public Mascota introducirMascota() {
        String tipo, nombre, raza;
        int edad = 0, anyoVacuna = 0;
        boolean correcto = true;
        Mascota mascota = new Mascota();
        System.out.println("Introduce el tipo del animal");
        tipo = teclado.next();
        System.out.println("Introduce el nombre del animal");
        nombre = teclado.next();
        System.out.println("Introduce la edad del perro");
        do {
            try {
                edad = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un numero");
                correcto = false;
            }

        } while (!correcto);
        System.out.println("Introduce la raza");
        raza = teclado.next();

        correcto = true;
        System.out.println("Introduce el anio de vacunacion");
        do {
            try {
                anyoVacuna = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un numero");
                correcto = false;
            }

        } while (!correcto);

        mascota.setNombre(nombre);
        mascota.setAnyoVacuna(anyoVacuna);
        mascota.setRaza(raza);
        mascota.setTipo(tipo);
        mascota.setEdad(edad);

        return mascota;
    }
}
