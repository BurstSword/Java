package Carpeta1;

import Carpeta1.Entidades.Profesor;
import Carpeta1.Gestoras.GestoraDatos;
import Carpeta1.Gestoras.GestoraMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

//Clase Main que realiza el hilo principal del programa
public class Main {
    public static void main(String[] args) {
        //Variables del main
        int boton = 0;
        Scanner teclado = new Scanner(System.in);
        String nombre, dni;
        System.out.println("Introduzca su nombre");
        nombre = teclado.nextLine();

        do {
            System.out.println("Introduzca su DNI en formato xxxxxxxxL");
            dni = teclado.nextLine();

        } while (!dni.matches("^[0-9]{8}[A-Z]{1}"));

        Profesor profesor = new Profesor(14, dni, nombre);

        System.out.println("Este es usted");
        System.out.println(profesor.toString());
        //Bucle que controla la elección de opción del usuario
        do {
            do {
                try {
                    GestoraMenus.menuPrincipal();
                    boton = teclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe introducir un número de opción correcto");
                } finally {
                    teclado.nextLine();
                }

            } while (boton < 1 || boton > 5);

            //Switch encargado de realizar las opciones que se muestra en la clase GestoraMenus metodo menuPrincipal
            switch (boton) {

                case 1:

                    for (int i = 0; i < GestoraDatos.listaAlumnos.size(); i++) {
                        if (i < 2) {
                            System.out.println("Alumno de primero nº " + i);
                            System.out.println(GestoraDatos.listaAlumnos.get(i).getNombre());
                        } else {
                            System.out.println("Alumno de segundo nº " + i);
                            System.out.println(GestoraDatos.listaAlumnos.get(i).getNombre());
                        }

                    }
                    break;
                case 2:
                    int botonAlumno1 = -1;
                    do {
                        for (int i = 0; i < 2; i++) {

                            System.out.println("Alumno de primero nº " + i);
                            System.out.println(GestoraDatos.listaAlumnos.get(i).getNombre());

                        }
                        System.out.println("Elija el alumno correspondiente");
                        try {
                            botonAlumno1 = teclado.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Debe introducir un alumno existente");
                        } finally {
                            teclado.nextLine();
                        }
                    } while (botonAlumno1 < -1 || botonAlumno1 > 1);
                    System.out.println("Alumno seleccionado con éxito");
                    if (GestoraDatos.listaAlumnos.get(botonAlumno1).getNotas().size() < 3) {
                        System.out.println("Introduzca su nota");
                        Float nota;
                        nota = teclado.nextFloat();
                        GestoraDatos.listaAlumnos.get(botonAlumno1).getNotas().add(nota);
                        System.out.println("Nota añadida con éxito");
                    } else if (GestoraDatos.listaAlumnos.get(botonAlumno1).getNotas().size() > 3) {
                        System.out.println("No puede tener más de tres notas el alumno");
                    }

                    break;
                case 3:
                    int botonAlumno2 = -1;
                    do {
                        for (int i = 2; i < 4; i++) {

                            System.out.println("Alumno de segundo nº " + i);
                            System.out.println(GestoraDatos.listaAlumnos.get(i).getNombre());

                        }
                        System.out.println("Elija el alumno correspondiente");
                        try {
                            botonAlumno2 = teclado.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Debe introducir un alumno existente");
                        } finally {
                            teclado.nextLine();
                        }
                    } while (botonAlumno2 < 2 || botonAlumno2 > 3);
                    System.out.println("Alumno seleccionado con éxito");
                    if (GestoraDatos.listaAlumnos.get(botonAlumno2).getNotas().size() < 2) {
                        System.out.println("Introduzca la nota");
                        Float nota;
                        nota = teclado.nextFloat();
                        GestoraDatos.listaAlumnos.get(botonAlumno2).getNotas().add(nota);
                        System.out.println("Nota añadida con éxito");
                    } else if (GestoraDatos.listaAlumnos.get(botonAlumno2).getNotas().size() > 2) {
                        System.out.println("No puede tener más de dos notas el alumno");
                    }
                    break;
                case 4:
                    for (int i = 0; i < GestoraDatos.listaAlumnos.size(); i++) {
                        if (!GestoraDatos.listaAlumnos.get(i).getNotas().isEmpty()) {
                            System.out.println(GestoraDatos.listaAlumnos.get(i).getNombre() + " Tiene una media de " +
                                    GestoraDatos.listaAlumnos.get(i).calcularMedia(GestoraDatos.listaAlumnos.get(i).getNotas()));
                        }

                    }
                    System.out.println("Hecho");
                    break;
                case 5:
                    System.out.println("Saliendo del colegio");
                    break;
            }

        } while (boton != 5);
    }
}
