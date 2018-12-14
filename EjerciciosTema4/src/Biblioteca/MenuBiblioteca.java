package Biblioteca;

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
                    if (Datos.listaUsuarios.size() == 0 || Datos.listaLibros.size() == 0) {
                        System.out.println("Aquí no hay nada que hacer");
                    } else {
                        System.out.println("¿Quién eres?");
                        for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                            System.out.println(i + ". " + Datos.listaUsuarios.get(i).getNombreUsuario());
                        }
                        do {
                            System.out.println("Escriba el número correspondiente a su nombre");
                            usuario = teclado.nextInt();
                        } while (usuario < 0 || usuario > Datos.listaUsuarios.size() - 1);
                        System.out.println("Seleccione el libro que quiera alquilar");
                        for (int i = 0; i < Datos.listaLibros.size(); i++) {
                            System.out.println(i + ". " + Datos.listaLibros.get(i).getNombreLibro());
                        }
                        do {
                            System.out.println("Escriba el número correspondiente al libro");
                            libro = teclado.nextInt();
                        } while (libro < 0 || libro > Datos.listaLibros.size() - 1);
                        System.out.println(Datos.listaLibros.get(libro).alquilarLibro(Datos.listaUsuarios.get(usuario).getID()) == 0 ? "Libro alquilado" : "Libro no disponible");

                    }
                    break;
                case 2:
                    if (Datos.listaLibros.size() == 0) {
                        System.out.println("Aquí no hay nada que hacer");
                    } else {
                        do {
                            System.out.println("Seleccione el libro que quiera devolver");
                            for (int i = 0; i < Datos.listaLibros.size(); i++) {
                                System.out.println(i + ". " + Datos.listaLibros.get(i).getNombreLibro());
                            }
                            libro = teclado.nextInt();
                        } while (libro < 0 || libro > Datos.listaLibros.size() - 1);
                        System.out.println(Datos.listaLibros.get(libro).devolverLibro() == 0 ? "Libro devuelto" : "El libro ya estaba devuelto de antes");
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
                            System.out.println("Aquí no hay nada que hacer");
                        } else {
                            do {
                                System.out.println("Escriba el número correspondiente a su usuario");
                                for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                                    System.out.println(i + ". " + Datos.listaUsuarios.get(i).getNombreUsuario());
                                }
                                seleccUsuario=teclado.nextInt();
                            }while(seleccUsuario<0 || seleccUsuario>Datos.listaUsuarios.size());
                            if(!GestoraUsuarios.comprobarLibrosAlquilados(Datos.listaUsuarios.get(seleccUsuario).getID())) {
                                Datos.listaUsuarios.remove(seleccUsuario);
                                System.out.println("Usuario dado de baja con éxito");
                            }else{
                                System.out.println(Datos.listaUsuarios.get(seleccUsuario).getNombreUsuario()+" tiene algún libro por devolver");
                            }
                        }
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del libro que quiere donar");
                    nombreLibro = tecladoStr.nextLine();
                    Datos.listaLibros.add(new Libro(nombreLibro));
                    System.out.println("Libro " + nombreLibro + " registrado con éxito");
                    break;
                case 6:
                    System.out.println("Esta acción es sólo para administradores, ingrese la contraseña");
                    contrasenaAdmin = teclado.nextInt();
                    if (Datos.listaLibros.size() == 0) {
                        System.out.println("Aquí no hay nada que hacer");
                    } else {
                        if (contrasenaAdmin == contrasena) {
                            System.out.println("Contraseña correcta");
                            do {
                                System.out.println("Ingrese el número del libro que quiere dar de baja");
                                for (int i = 0; i < Datos.listaLibros.size(); i++) {
                                    System.out.println(i + ". " + Datos.listaLibros.get(i).getNombreLibro());
                                }
                                seleccLibro = teclado.nextInt();
                            } while (seleccLibro < 0 || seleccLibro > Datos.listaLibros.size());
                            if (Datos.listaLibros.get(seleccLibro).isDisponible()) {
                                Datos.listaLibros.remove(seleccLibro);
                                System.out.println("Libro dado de baja con éxito");
                            } else {
                                System.out.println(Datos.listaLibros.get(seleccLibro).toString());
                            }
                        } else {
                            System.out.println("Contraseña incorrecta");
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < Datos.listaUsuarios.size(); i++) {
                        System.out.println(Datos.listaUsuarios.get(i).getNombreUsuario());
                        for (int j = 0; j < Datos.listaLibros.size(); j++) {
                            if (Datos.listaUsuarios.get(i).getID() == Datos.listaLibros.get(j).getIDusuario()) {
                                System.out.println(" " + Datos.listaLibros.get(j).getNombreLibro());
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