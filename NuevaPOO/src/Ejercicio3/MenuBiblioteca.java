package Ejercicio3;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class MenuBiblioteca {
    public static void main(String[] args) {
        int boton, usuario, libro, contrasenaAdmin, seleccLibro, seleccUsuario, eleccionReviLibro;
        String nombrePublicacion, nombreUsuario;
        final int contrasena = 1234;


        Scanner teclado = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);
        do {
            do {
                GestoraMenus.mostrarMenu();
                boton = teclado.nextInt();
            } while (boton < 0 || boton > 8);

            switch (boton) {
                case 1:
                    if (Datos.listaUsuarios.size() == 0 || Datos.listaPublicaciones.size() == 0) {
                        System.out.println("Aquí no hay nada que hacer");
                    } else {
                        System.out.println("¿Quién eres?");
                        for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                            System.out.println(i + ". " + Datos.listaUsuarios.get(i).getNombreUsuario());
                        }
                        do {
                            System.out.println("\nEscriba el número correspondiente a su nombre");
                            usuario = teclado.nextInt();
                        } while (usuario < 0 || usuario > Datos.listaUsuarios.size() - 1);
                        System.out.println("\nSeleccione la publicación que quiera alquilar");
                        for (int i = 0; i < Datos.listaPublicaciones.size(); i++) {
                            System.out.println(i + ". " + Datos.listaPublicaciones.get(i).getNombreLibro());
                        }
                        do {
                            System.out.println("\nEscriba el número correspondiente a la publicación");
                            libro = teclado.nextInt();
                        } while (libro < 0 || libro > Datos.listaPublicaciones.size() - 1);
                        System.out.println(Datos.listaPublicaciones.get(libro).alquilarPublicacion(Datos.listaUsuarios.get(usuario).getID()) == 0 ? "Publicación alquilada" : "Publicación no disponible");
                        Datos.listaUsuarios.get(usuario).anadirFecha(Calendar.DAY_OF_MONTH, Calendar.MONTH);
                    }
                    break;
                case 2:
                    if (Datos.listaPublicaciones.size() == 0) {
                        System.out.println("Aquí no hay nada que hacer");
                    } else {
                        do {
                            System.out.println("Seleccione la publicación que quiera devolver");
                            for (int i = 0; i < Datos.listaPublicaciones.size(); i++) {
                                System.out.println(i + ". " + Datos.listaPublicaciones.get(i).getNombreLibro());
                            }
                            libro = teclado.nextInt();
                        } while (libro < 0 || libro > Datos.listaPublicaciones.size() - 1);
                        System.out.println(Datos.listaPublicaciones.get(libro).devolverPublicacion() == 0 ? "Publicación devuelta" : "La publicación ya estaba devuelta de antes");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre con el que quiere darse de alta");
                    nombreUsuario = tecladoStr.nextLine();
                    Datos.listaUsuarios.add(new Usuario(nombreUsuario));
                    System.out.println("Usuario " + nombreUsuario + " registrado con éxito");
                    break;
                case 4:
                    System.out.println("Esta acción es sólo para administradores, ingrese la contraseña");
                    contrasenaAdmin = teclado.nextInt();
                    if (contrasenaAdmin == contrasena) {
                        System.out.println("Contraseña correcta");
                        if (Datos.listaUsuarios.size() == 0) {
                            System.out.println("Aquí  no hay nada que hacer");
                        } else {
                            do {
                                System.out.println("Escriba el número correspondiente a su usuario");
                                for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                                    System.out.println(i + ". " + Datos.listaUsuarios.get(i).getNombreUsuario());
                                }
                                seleccUsuario = teclado.nextInt();
                            } while (seleccUsuario < 0 || seleccUsuario > Datos.listaUsuarios.size());
                            if (!GestoraUsuarios.comprobarLibrosAlquilados(Datos.listaUsuarios.get(seleccUsuario).getID())) {
                                Datos.listaUsuarios.remove(seleccUsuario);
                                System.out.println("Usuario dado de baja con éxito");
                            } else {
                                System.out.println(Datos.listaUsuarios.get(seleccUsuario).getNombreUsuario() + " tiene algún libro por devolver");
                            }
                        }
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre de la publicación que quiere donar e indique si es una revista o un libro");
                    do {
                        System.out.println("1. Revista");
                        System.out.println("2. Libro");
                        eleccionReviLibro = teclado.nextInt();
                    } while (eleccionReviLibro < 1 || eleccionReviLibro > 2);
                    if (eleccionReviLibro == 1) {
                        nombrePublicacion = tecladoStr.nextLine();
                        Datos.listaPublicaciones.add(new Revista(nombrePublicacion));
                        System.out.println("Revista " + nombrePublicacion + " registrada con éxito");
                    } else {
                        nombrePublicacion = tecladoStr.nextLine();
                        Datos.listaPublicaciones.add(new Libro(nombrePublicacion));
                        System.out.println("Libro " + nombrePublicacion + " registrado con éxito");
                    }
                    break;
                case 6:
                    System.out.println("Esta acción es sólo para administradores, ingrese la contraseña");
                    contrasenaAdmin = teclado.nextInt();
                    if (Datos.listaPublicaciones.size() == 0) {
                        System.out.println("Aquí no hay nada que hacer");
                    } else {
                        if (contrasenaAdmin == contrasena) {
                            System.out.println("Contraseña correcta");
                            do {
                                System.out.println("Ingrese el número de la publicación que quiere dar de baja");
                                for (int i = 0; i < Datos.listaPublicaciones.size(); i++) {
                                    System.out.println(i + ". " + Datos.listaPublicaciones.get(i).getNombreLibro());
                                }
                                seleccLibro = teclado.nextInt();
                            } while (seleccLibro < 0 || seleccLibro > Datos.listaPublicaciones.size());
                            if (Datos.listaPublicaciones.get(seleccLibro).isDisponible()) {
                                Datos.listaPublicaciones.remove(seleccLibro);
                                System.out.println("Publicación dada de baja con éxito");
                            } else {
                                System.out.println(Datos.listaPublicaciones.get(seleccLibro).toString());
                            }
                        } else {
                            System.out.println("Contraseña incorrecta");
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
                case 8:

                    System.out.println("¿Quién eres?");
                    for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                        System.out.println(i + ". " + Datos.listaUsuarios.get(i).getNombreUsuario());
                    }
                    do {
                        System.out.println("\nEscriba el número correspondiente a su nombre");
                        usuario = teclado.nextInt();

                    } while (usuario > Datos.listaUsuarios.size() - 1);
                    if (Datos.listaUsuarios.get(usuario).getListaFecha().isEmpty()) {
                        System.out.println("No tiene libros alquilados");
                    } else {


                        for (int j = 0; j < Datos.listaPublicaciones.size(); j++) {
                            if (Datos.listaUsuarios.get(usuario).getID() == Datos.listaPublicaciones.get(j).getIDusuario()) {
                                for(int i=0; i<1;i++)
                                System.out.println(Datos.listaPublicaciones.get(j).getNombreLibro() + Datos.listaUsuarios.get(usuario).getListaFecha().get(i));
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
