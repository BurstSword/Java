package pruebaSucesiones;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TestGauss {
    private static ArrayList<Integer> listaGauss = new <Integer>ArrayList<Integer>();

    public TestGauss() {
        listaGauss.add(1);
        listaGauss.add(3);
        listaGauss.add(6);
        listaGauss.add(10);
        listaGauss.add(15);
        listaGauss.add(21);
        listaGauss.add(28);
        listaGauss.add(36);
        listaGauss.add(45);
        listaGauss.add(55);
        listaGauss.add(66);
        listaGauss.add(78);
        listaGauss.add(91);
        listaGauss.add(105);
        listaGauss.add(120);
        listaGauss.add(136);
        listaGauss.add(153);
        listaGauss.add(171);
        listaGauss.add(190);
        listaGauss.add(210);
    }

    @Test
    public void GaussIt1() {
        int resultadoCorrecto = listaGauss.get(0);
        int resultadoCalculado = Gauss.GaussIt(1);
        assertThat(resultadoCalculado, is(resultadoCorrecto));
    }

    @Test
    public void GaussIt20() {
        int resultadoCorrecto = listaGauss.get(19);
        int resultadoCalculado = Gauss.GaussIt(20);
        assertThat(resultadoCalculado, is(resultadoCorrecto));
    }

    @Test
    public void GaussItBucle() {
        for (int i = 0; i < 20; i++) {
            int resultadoCorrecto = listaGauss.get(i);
            int resultadoCalculado = Gauss.GaussIt(i + 1);
            assertThat(resultadoCalculado, is(resultadoCorrecto));
        }
    }

    @Test
    public void GaussRec1() {
        int resultadoCorrecto = listaGauss.get(0);
        int resultadoCalculado = Gauss.GaussRec(1);
        assertThat(resultadoCalculado, is(resultadoCorrecto));
    }

    @Test
    public void GaussRec20() {
        int resultadoCorrecto = listaGauss.get(19);
        int resultadoCalculado = Gauss.GaussRec(20);
        assertThat(resultadoCalculado, is(resultadoCorrecto));
    }

    @Test
    public void GaussRecBucle() {
        for (int i = 0; i < 20; i++) {
            int resultadoCorrecto = listaGauss.get(i);
            int resultadoCalculado = Gauss.GaussRec(i + 1);
            assertThat(resultadoCalculado, is(resultadoCorrecto));
        }
    }

    @Test
    public void GaussForm1() {

        int resultadoCorrecto = listaGauss.get(0);
        int resultadoCalculado = Gauss.GaussForm(1);
        assertThat(resultadoCalculado, is(resultadoCorrecto));

    }

    @Test
    public void GaussForm20() {

        int resultadoCorrecto = listaGauss.get(19);
        int resultadoCalculado = Gauss.GaussForm(20);
        assertThat(resultadoCalculado, is(resultadoCorrecto));

    }

    @Test
    public void GaussFormBucle() {
        for (int i = 0; i < 20; i++) {
            int resultadoCorrecto = listaGauss.get(i);
            int resultadoCalculado = Gauss.GaussForm(i + 1);
            assertThat(resultadoCalculado, is(resultadoCorrecto));
        }
    }

    @Test
    public void GaussConListaBucle() {
        for (int i = 0; i < 20; i++) {
            int resultadoCorrecto = listaGauss.get(i);
            int resultadoCalculado = Gauss.gaussConLista(i + 1);
            assertThat(resultadoCalculado, is(resultadoCorrecto));
        }
    }

    @Test
    public void GaussConLista1() {

            int resultadoCorrecto = listaGauss.get(0);
            int resultadoCalculado = Gauss.gaussConLista(1);
            assertThat(resultadoCalculado, is(resultadoCorrecto));

    }

    @Test
    public void GaussConLista20() {

            int resultadoCorrecto = listaGauss.get(19);
            int resultadoCalculado = Gauss.gaussConLista(20);
            assertThat(resultadoCalculado, is(resultadoCorrecto));

    }

}
