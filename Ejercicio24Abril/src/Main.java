public class Main {
    public static void main(String[] args) {
        Movil movil = new Movil("Xiaomi", "Mi A1", 8347543, true, false);
        Portatil portatil = new Portatil("MSI", "Raider", 4350743, true, false);
        Movil movil2 = new Movil("Samsung", "Foldable", 6845665, false, true);

        //-----Movil 1-----//
        //Vamos a empezar por el movil
        System.out.println("\n"+movil.toString());
        //Reparamos su software
        movil.repararMovil();
        //Mostramos su estado otra vez
        System.out.println(movil.toString());
        //Y lo volvemos a intentar reparar para que nos diga que ya está reparado
        movil.repararMovil();

        //-----Portatil-----//
        //Seguimos con el portátil
        System.out.println("\n"+portatil.toString());
        //Reparamos su software en remoto
        portatil.repararEnRemoto();
        //Mostramos su estado
        System.out.println("\n"+portatil.toString());
        //Lo estropeamos y lo reparamos en persona esta vez
        portatil.setReparadoEnRemoto(false);
        portatil.repararPresencial();
        //Mostramos su estado otra vez
        System.out.println("\n"+portatil.toString());
        //Volvemos a intentar repararlo para que nos diga que ya está reparado
        portatil.repararPresencial();
        portatil.repararEnRemoto();


        //-----Movil 2-----//
        //Seguimos con el movil con la pantalla rota
        System.out.println("\n"+movil2.toString());
        //Analizamos la pantalla
        movil2.analizarPantalla();
        //Compramos las piezas necesarias
        movil2.comprarPiezasPantalla();
        //Reparamos su pantalla
        movil2.repararPantalla();
        //Mostramos su estado otra vez
        System.out.println("\n"+movil2.toString());
        //Lo volvemos a intentar reparar para que nos diga que no necesita ser reparado
        movil2.repararPantalla();


    }
}
