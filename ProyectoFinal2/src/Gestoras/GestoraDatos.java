package Gestoras;


import java.util.ArrayList;

public class GestoraDatos {
    private static ArrayList<Integer> notas = new ArrayList<>();
    private static ArrayList<Integer> alumnos = new ArrayList<>();
    private static int generadorID = 0;
    private static int ID;

    public static void anadirNota(int nota) {
        notas.add(nota);
        ID = generadorID++;
        if (ID == alumnos.size()) {
            ID++;
        }
        alumnos.add(ID);
    }

    public static void cambiarNota(int ID, int nota) {
        notas.set(ID, nota);
    }

    public static boolean mostrarIDyNota() {
        boolean existe;
        if (!notas.isEmpty()) {
            for (int i = 0; i < notas.size(); i++) {
                for (int j = 0; i < notas.size(); j++) {
                    System.out.println("ID " + alumnos.get(j) + " Nota: " + notas.get(i));
                }
            }
            existe=true;
        }else{
            System.out.println("No hay notas registradas");
            existe=false;
        }
        return existe;
    }

    public static void EliminarNotayAlumno(int ID){
        notas.remove(ID);
        alumnos.remove(ID);
    }
}
