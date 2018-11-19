public class TestModulo1 {
    @Test
    public void sumaPositivos() {
        System.out.println("Sumando dos números positivos ...");
        Suma S = new Suma(2, 3);
        assertTrue(S.sumar() == 5);
    }
}
