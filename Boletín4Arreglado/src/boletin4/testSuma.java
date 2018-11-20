package boletin4;

import org.junit.Test;
import org.junit.Assert;

public class testSuma {
    @Test
    public void test() {


        //Comprobamos que la función esMultiploDe2 devuelve true cuando realmente el número es un múltiplo de 2
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe2(8));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe2(2));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe2(4));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe2(6));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe2(-10));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe2(-12));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe2(-2));


        //Comprobamos que la función esMultiploDe2 devuelve false cuando realmente el número no es múltiplo de 2
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe2(3));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe2(5));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe2(7));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe2(9));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe2(-11));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe2(-13));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe2(-15));


        //Comprobamos que la función esMultiploDe5 devuelve true cuando realmente el número es un múltiplo de 5
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe5(5));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe5(10));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe5(15));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe5(20));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe5(-25));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe5(-30));
        Assert.assertTrue(Ejercicio3Multiplos.esMultiploDe5(-35));


        //Comprobamos que la función esMultiploDe5 devuelve false cuando realmente el número no es múltiplo de 5
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(3));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(7));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(8));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(9));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(11));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(-12));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(-13));
        Assert.assertFalse(Ejercicio3Multiplos.esMultiploDe5(-424));


        //Comprobamos que la funcion suma devuelve correctamente el valor de la suma
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            for (int j = Integer.MIN_VALUE; j < Integer.MAX_VALUE; j++) {
                Assert.assertEquals(i + j, Ejercicio1Suma.suma(i, j));
            }
        }


        Assert.assertEquals(2 + 3, Ejercicio1Suma.suma(2, 3));
        Assert.assertEquals(5 + 3, Ejercicio1Suma.suma(5, 3));
        Assert.assertEquals(7 + 3, Ejercicio1Suma.suma(7, 3));
        Assert.assertEquals(-9 + 3, Ejercicio1Suma.suma(-9, 3));
        Assert.assertEquals(-11 + 3, Ejercicio1Suma.suma(-11, 3));
        Assert.assertEquals(-13 + 3, Ejercicio1Suma.suma(-13, 3));


        //Comprobamos que la función Ejercicio5Funciones.sumarValores sume los valores correctamente del Array
        Assert.assertEquals(1 + 2 + 3 + 4 + 5, Ejercicio5Funciones.sumarValores(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(1 + 7 + 3 + 4 + 5, Ejercicio5Funciones.sumarValores(new int[]{1, 7, 3, 4, 5}));
        Assert.assertEquals(1 + 9 + 3 + 4 + 5, Ejercicio5Funciones.sumarValores(new int[]{1, 9, 3, 4, 5}));
        Assert.assertEquals(1 + 23 + 3 + 4 + 5, Ejercicio5Funciones.sumarValores(new int[]{1, 23, 3, 4, 5}));


        //Comprobamos que la función Ejercicio4Signo.comprobarSigno devuelve el signo correcto según tu fecha de nacimiento
        Assert.assertEquals("Sagitario", Ejercicio4Signo.comprobarSigno(new String[]{"23", "11"}));
        Assert.assertEquals("Libra", Ejercicio4Signo.comprobarSigno(new String[]{"2", "10"}));
        Assert.assertEquals("Leo", Ejercicio4Signo.comprobarSigno(new String[]{"12", "8"}));
        Assert.assertEquals("Acuario", Ejercicio4Signo.comprobarSigno(new String[]{"15", "2"}));


        //Comprobamos que la función Ejercicio4Signo.comprobarSigno devuelve el signo correcto según tu fecha de nacimiento
        Assert.assertNotEquals("Cáncer", Ejercicio4Signo.comprobarSigno(new String[]{"23", "11"}));
        Assert.assertNotEquals("Capricornio", Ejercicio4Signo.comprobarSigno(new String[]{"2", "10"}));
        Assert.assertNotEquals("Piscis", Ejercicio4Signo.comprobarSigno(new String[]{"12", "8"}));
        Assert.assertNotEquals("Géminis", Ejercicio4Signo.comprobarSigno(new String[]{"15", "2"}));
    }
}
