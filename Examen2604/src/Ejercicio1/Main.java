package Ejercicio1;

import Ejercicio1.Gestoras.GestoraDatos;
import Ejercicio1.Gestoras.GestoraMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boton = -1, LibroOpcion = -1, RevistaOpcion = -1;
        Scanner teclado = new Scanner(System.in);
        boolean numeroCorrecto = false, libroCorrecto = false, RevistaCorrecta = false;
        do {
            do {
                try {
                    GestoraMenus.menu();
                    boton = teclado.nextInt();
                    numeroCorrecto = true;
                } catch (InputMismatchException i) {
                    System.out.println("Numero incorrecto");
                }
            } while (!numeroCorrecto && boton <= 0 || boton > 6);

            switch (boton) {
                case 1:
                    System.out.println("\nLibros:");
                    for (int i = 0; i < GestoraDatos.listaLib.size(); i++) {
                        System.out.println(i + " " + GestoraDatos.listaLib.get(i).toString());
                    }
                    System.out.println("\nRevistas");
                    for (int j = 0; j < GestoraDatos.listaRev.size(); j++) {
                        System.out.println(j + " " + GestoraDatos.listaRev.get(j).toString());
                    }
                    break;
                case 2:
                    do {
                        for (int i = 0; i < GestoraDatos.listaLib.size(); i++) {
                            System.out.println(i + " " + GestoraDatos.listaLib.get(i).toString());
                        }
                        try {
                            System.out.println("Elija el libro que quiera alquilar");
                            LibroOpcion = teclado.nextInt();
                            libroCorrecto = true;
                        } catch (InputMismatchException i) {
                            System.out.println("Numero incorrecto");
                        }
                    } while (!libroCorrecto && LibroOpcion > GestoraDatos.listaLib.size() - 1);
                    GestoraDatos.listaLib.get(LibroOpcion).prestarLibro();
                    LibroOpcion = -1;
                    break;
                case 3:
                    do {
                        for (int i = 0; i < GestoraDatos.listaLib.size(); i++) {
                            System.out.println(i + " " + GestoraDatos.listaLib.get(i).toString());
                        }
                        try {
                            System.out.println("Elija el libro que quiera devolver");
                            LibroOpcion = teclado.nextInt();
                            libroCorrecto = true;
                        } catch (InputMismatchException i) {
                            System.out.println("Numero incorrecto");
                        }
                    } while (!libroCorrecto && LibroOpcion > GestoraDatos.listaLib.size() - 1);
                    GestoraDatos.listaLib.get(LibroOpcion).recibirLibroDeVuelta();
                    LibroOpcion = -1;
                    break;
                case 4:
                    do {
                        for (int j = 0; j < GestoraDatos.listaRev.size(); j++) {
                            System.out.println(j + " " + GestoraDatos.listaRev.get(j).toString());
                        }
                        try {
                            System.out.println("Elija la revista que quiera leer");
                            RevistaOpcion = teclado.nextInt();
                            RevistaCorrecta = true;
                        } catch (InputMismatchException i) {
                            System.out.println("Numero incorrecto");
                        }
                    } while (!RevistaCorrecta && RevistaOpcion > GestoraDatos.listaRev.size() - 1);
                    GestoraDatos.listaRev.get(RevistaOpcion).leerRevista();
                    RevistaOpcion = -1;
                    break;
                case 5:
                    do {
                        for (int j = 0; j < GestoraDatos.listaRev.size(); j++) {
                            System.out.println(j + " " + GestoraDatos.listaRev.get(j).toString());
                        }
                        try {
                            System.out.println("Elija la revista que quiera dejar de leer");
                            RevistaOpcion = teclado.nextInt();
                            RevistaCorrecta = true;
                        } catch (InputMismatchException i) {
                            System.out.println("Numero incorrecto");
                        }
                    } while (!RevistaCorrecta && RevistaOpcion > GestoraDatos.listaRev.size() - 1);
                    GestoraDatos.listaRev.get(RevistaOpcion).devolverRevista();
                    RevistaOpcion = -1;
                    break;
                case 6:
                    System.out.println("Adiós");
                    break;
            }
        } while (boton != 6);
    }


}


