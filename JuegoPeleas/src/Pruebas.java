import Datos.AlmacenArmas;
import Entidades.Guerrero;
import Entidades.Monstruo;
import Gestoras.GestoraDado;
import Gestoras.GestoraGuerrero;
import Gestoras.GestoraMonstruo;
import Utilidades.Utilidades;


public class Pruebas {
    public static void main(String[] args) {

        //Primero comprobamos que el dado sea ejecute con éxito

        GestoraDado.lanzarDado();

        //Comprobaremos que el guerrero y el monstruo se genere con éxito, introduciendo sus nombre por teclado y viendo su
        //método toString
        System.out.println("\nCreamos el guerrero introduciendo su nombre por teclado, y comprobamos que se ha creado correctamente");
        Guerrero guerrero = GestoraGuerrero.generarGuerrero("Palisa");
        System.out.println("\n" + guerrero.toString());

        //Ahora veamos si el monstruo se genera con los valores correctamente
        System.out.println("\nCreamos el monstruo introduciendo su nombre por teclado, y comprobamos que se ha creado correctamente");
        Monstruo monstruo = GestoraMonstruo.generarMonstruo("Patata");
        System.out.println("\n" + monstruo.toString());

        //Ahora veamos si el guerrero y el monstruo reciben bien el daño, en el caso del guerrero en el escudo y en la vida
        System.out.println("\nMostramos el guerrero antes del ataque");
        System.out.println("\n" + guerrero.toString());
        guerrero.recibirDanoEscudo(15);
        guerrero.recibirDano(13);
        System.out.println("\nVolvemos a mostrar al guerrero después de restarle el daño");
        System.out.println("\n" + guerrero.toString());

        //Haremos lo mismo ahora con el monstruo
        System.out.println("\n Mostramos el monstruo antes del ataque");
        System.out.println("\n" + monstruo.toString());
        monstruo.recibirDano(32);
        System.out.println("\n" + monstruo.toString());
        //Comprobamos que las utilidades funcionen correctamente (Puede que no funcionen bien ejecutadas aquí)
        System.out.println("\nEsperamos 1.2 segundos");
        Utilidades.esperar();

        System.out.println("\nEsperamos 0.15 segundos");
        Utilidades.esperarFin();

        System.out.println("\nMostramos el mensaje de fin del combate letra a letra");
        Utilidades.finalCombate();

        //Veamos que el ArrayList está inicializado correctamente y con los objetos correctamente instanciados
        AlmacenArmas.mostrarArrayListArmas();
    }
}
