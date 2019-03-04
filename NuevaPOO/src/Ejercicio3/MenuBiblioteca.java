package Ejercicio3;

import java.util.Scanner;

public class MenuBiblioteca {
    public static void main(String[] args) {
        int boton, usuario, libro, contrasenaAdmin, seleccLibro, seleccUsuario;
        String nombreLibro, nombreUsuario;
        final int contrasena = 1234;


        Scanner teclado = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);
        do {
            do {
                GestoraMenus.mostrarMenu();
                boton = teclado.nextInt();
            } while (boton < 0 || boton > 7);

            switch (boton) {
                case 1:
                    if (Datos.listaUsuarios.size() == 0 || Datos.listaPublicaciones.size() == 0) {
                        System.out.println("Aqu� no hay nada que hacer");
                    } else {
                        System.out.println("�Qui�n eres?");
                        for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                            System.out.println(i + ". " + Datos.listaUsuarios.get(i).getNombreUsuario());
                        }
                        do {
                            System.out.println("\nEscriba el n�mero correspondiente a su nombre");
                            usuario = teclado.nextInt();
                        } while (usuario < 0 || usuario > Datos.listaUsuarios.size() - 1);
                        System.out.println("\nSeleccione la publicaci�n que quiera alquilar");
                        for (int i = 0; i < Datos.listaPublicaciones.size(); i++) {
                            System.out.println(i + ". " + Datos.listaPublicaciones.get(i).getNombreLibro());
                        }
                        do {
                            System.out.println("\nEscriba el n�mero correspondiente a la publicaci�n");
                            libro = teclado.nextInt();
                        } while (libro < 0 || libro > Datos.listaPublicaciones.size() - 1);
                        System.out.println(Datos.listaPublicaciones.get(libro).alquilarLibro(Datos.listaUsuarios.get(usuario).getID()) == 0 ? "Publicaci�n alquilada" : "Publicaci�n no disponible");

                    }
                    break;
                case 2:
                    if (Datos.listaPublicaciones.size() == 0) {
                        System.out.println("Aqu� no hay nada que hacer");
                    } else {
                        do {
                            System.out.println("Seleccione el libro que quiera devolver");
                            for (int i = 0; i < Datos.listaPublicaciones.size(); i++) {
                                System.out.println(i + ". " + Datos.listaPublicaciones.get(i).getNombreLibro());
                            }
                            libro = teclado.nextInt();
                        } while (libro < 0 || libro > Datos.listaPublicaciones.size() - 1);
                        System.out.println(Datos.listaPublicaciones.get(libro).devolverLibro() == 0 ? "Publicaci�n devuelta" : "La publicaci�n ya estaba devuelta de antes");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre con el que quiere darse de alta");
                    nombreUsuario = tecladoStr.nextLine();
                    Datos.listaUsuarios.add(new Usuario(nombreUsuario));
                    System.out.println("Usuario " + nombreUsuario + " registrado con �xito");
                    break;
                case 4:
                    System.out.println("Esta acci�n es s�lo para administradores, ingrese la contrase�a");
                    contrasenaAdmin = teclado.nextInt();
                    if (contrasenaAdmin == contrasena) {
                        System.out.println("Contrase�a correcta");
                        if (Datos.listaUsuarios.size() == 0) {
                            System.out.println("Aqu� no hay nada que hacer");
                        } else {
                            do {
                                System.out.println("Escriba el n�mero correspondiente a su usuario");
                                for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                                    System.out.println(i + ". " + Datos.listaUsuarios.get(i).getNombreUsuario());
                                }
                                seleccUsuario = teclado.nextInt();
                            } while (seleccUsuario < 0 || seleccUsuario > Datos.listaUsuarios.size());
                            if (!GestoraUsuarios.comprobarLibrosAlquilados(Datos.listaUsuarios.get(seleccUsuario).getID())) {
                                Datos.listaUsuarios.remove(seleccUsuario);
                                System.out.println("Usuario dado de baja con �xito");
                            } else {
                                System.out.println(Datos.listaUsuarios.get(seleccUsuario).getNombreUsuario() + " tiene alg�n libro por devolver");
                            }
                        }
                    } else {
                        System.out.println("Contrase�a incorrecta");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre de la publicaci�n que quiere donar");
                    nombreLibro = tecladoStr.nextLine();
                    Datos.listaPublicaciones.add(new Libro(nombreLibro));
                    System.out.println("Publicacion " + nombreLibro + " registrado con �xito");
                    break;
                case 6:
                    System.out.println("Esta acci�n es s�lo para administradores, ingrese la contrase�a");
                    contrasenaAdmin = teclado.nextInt();
                    if (Datos.listaPublicaciones.size() == 0) {
                        System.out.println("Aqu� no hay nada que hacer");
                    } else {
                        if (contrasenaAdmin == contrasena) {
                            System.out.println("Contrase�a correcta");
                            do {
                                System.out.println("Ingrese el n�mero de la publicaci�n que quiere dar de baja");
                                for (int i = 0; i < Datos.listaPublicaciones.size(); i++) {
                                    System.out.println(i + ". " + Datos.listaPublicaciones.get(i).getNombreLibro());
                                }
                                seleccLibro = teclado.nextInt();
                            } while (seleccLibro < 0 || seleccLibro > Datos.listaPublicaciones.size());
                            if (Datos.listaPublicaciones.get(seleccLibro).isDisponible()) {
                                Datos.listaPublicaciones.remove(seleccLibro);
                                System.out.println("Publicaci�n dada de baja con �xito");
                            } else {
                                System.out.println(Datos.listaPublicaciones.get(seleccLibro).toString());
                            }
                        } else {
                            System.out.println("Contrase�a incorrecta");
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                        System.out.println(Datos.listaUsuarios.get(i).getNombreUsuario());
                        for (int j = 0; j < Datos.listaPublicaciones.size(); j++) {
                            if (Datos.listaUsuarios.get(i).getID() == Datos.listaPublicaciones.get(j).getIDusuario()) {
                                System.out.println(" " + Datos.listaPublicaciones.get(j).getNombreLibro());
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo de la biblioteca");
                    break;
            }

        } while (boton != 0);
    }

}
