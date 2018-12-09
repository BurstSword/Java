package Biblioteca;

public class PruebaBiblioteca {
    public static void main(String[] args) {



        System.out.println("\nVamos a hacer que el usuario 1 alquile el libro 1");
        System.out.println(Datos.listaLibros.get(0).alquilarLibro(1));
        System.out.println(Datos.listaLibros.get(0).toString());

        System.out.println("\nVamos a hacer que el usuario 2 alquile el libro 2");
        System.out.println(Datos.listaLibros.get(1).alquilarLibro(2));
        System.out.println(Datos.listaLibros.get(1).toString());

        System.out.println("\nVamos a hacer que el usuario 1 alquile el libro 2 y no podrá");
        System.out.println(Datos.listaLibros.get(1).alquilarLibro(1));
        System.out.println(Datos.listaLibros.get(0).toString());

        System.out.println("\nVamos a hacer que el usuario 2 alquile el libro 1 y no podrá");
        System.out.println(Datos.listaLibros.get(0).alquilarLibro(2));
        System.out.println(Datos.listaLibros.get(1).toString());

        System.out.println("\nVamos a hacer que el usuario 1 devuelva el libro 1");
        System.out.println(Datos.listaLibros.get(0).devolverLibro());
        System.out.println(Datos.listaLibros.get(0).toString());

        System.out.println("\nVamos a hacer que el usuario 2 devuelva el libro 2");
        System.out.println(Datos.listaLibros.get(1).devolverLibro());
        System.out.println(Datos.listaLibros.get(1).toString());

        System.out.println("\nVamos a hacer que el usuario 1 devuelva el libro 1");
        System.out.println(Datos.listaLibros.get(0).devolverLibro());
        System.out.println(Datos.listaLibros.get(0).toString());

        System.out.println("\nVamos a hacer que el usuario 2 devuelva el libro 2");
        System.out.println(Datos.listaLibros.get(1).devolverLibro());
        System.out.println(Datos.listaLibros.get(1).toString());

        System.out.println("\nVamos a hacer que el usuario 1 alquile el libro 1 y el 2");
        System.out.println(Datos.listaLibros.get(0).alquilarLibro(1));
        System.out.println(Datos.listaLibros.get(1).alquilarLibro(1));
        System.out.println(Datos.listaLibros.get(0).toString());
        System.out.println(Datos.listaLibros.get(1).toString());

        //Datos.listaLibros.add(new Libro("El último caso de Hércules Poirot"));

    }
}
