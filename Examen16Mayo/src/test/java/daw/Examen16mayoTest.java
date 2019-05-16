package daw;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import org.junit.Test;


public class Examen16mayoTest {

    @Test
    public void isPalindrome(){
    String resultadoCorrecto = "-esta palabra es palindromo";
    String resultadoComprobado = Examen16mayo.isPalindrome("ana");
    assertThat(resultadoCorrecto, is(resultadoComprobado));
    }
    @Test
    public void isCapitalLetters(){
        String resultadoCorrecto = "-esta palabra no es mayuscula";
        String resultadoComprobado = Examen16mayo.isCapitalLetters("ana", "ANA");
        assertThat(resultadoCorrecto, is(resultadoComprobado));
    }
    @Test
    public void isEmail(){
        String resultadoCorrecto = "-esta palabra es email";
        String resultadoComprobado = Examen16mayo.isEmail("Miguel@gmail.com");
        assertThat(resultadoCorrecto, is(resultadoComprobado));
    }
}
