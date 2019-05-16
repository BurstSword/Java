package daw;

/**
 * Clase encargada de comprobar si una palabra es un palindromo, si esta en minuscula,
 * si esta en mayuscula o si es un email
 */
public class Examen16mayo {
    public static void main(String[] args) {
        checkString("ANA");
    }

    /**
     * Metodo que se encarga de recibir una cadena y mediante llamadas a los distintos metodos comprobamos si
     * es un palindromo, esta en minusculas, en mayusculas o es un email
     *
     * @param stringToCheck La cadena a comprobar
     */
    public static void checkString(String stringToCheck) {
        System.out.println("Comprobando \"" + stringToCheck + "\":");
        //Comprobar palindromo

        System.out.println(isPalindrome(stringToCheck));
        // Mail
        System.out.println(isEmail(stringToCheck));

        System.out.println(isCapitalLetters(stringToCheck, stringToCheck.toUpperCase()));

        isLowerCase(stringToCheck);
    }

    /**
     * Metodo que comprueba si una cadena esta en minusculas o no
     * @param stringToCheck Cadena a comprobar
     */
    public static void isLowerCase(String stringToCheck) {
        String stringToCheckLowerCase = stringToCheck.toLowerCase();
        boolean lowerCase = stringToCheck.equals(stringToCheckLowerCase);

        if (lowerCase) {
            System.out.println("-esta palabra es minuscula");
        } else {
            System.out.println("-esta palabra no es minuscula");
        }
    }

    /**
      Comprobamos si una cadena esta escrita en mayusculas o no

     * @param stringToCheck La cadena a comprobar si esta en mayusculas
     * @param stringToCheckCapitalLetters La cadena en mayusculas para comprobar si es mayusculas o no
     * @return Nos devuelve el resultado de comprobar si es un email o no
     */
    public static String isCapitalLetters(String stringToCheck, String stringToCheckCapitalLetters) {
        boolean capitalLetter = stringToCheck.equals(stringToCheckCapitalLetters);

        String result;
        if (capitalLetter) {
            result = "-esta palabra es mayuscula";
        } else {
            result = "-esta palabra no es mayuscula";
        }
        return result;
    }

    /**
     * Metodo que comprueba si una cadena es un email o no
     *
     * @param stringToCheck La cadena a comprobar
     * @return Devuelve el resultado de que es un email si la cadena resulta ser un email, de lo contrario devuelve como
     * resultado que la cadena no es un email
     */
    public static String isEmail(String stringToCheck) {
        String emailPattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(emailPattern);
        java.util.regex.Matcher m = p.matcher(stringToCheck);
        boolean mail = m.matches();

        String result;
        if (mail) {
            result = "-esta palabra es email";
        } else {
            result = "-esta palabra no es email";
        }

        return result;
    }

    /**
     * Comprobamos si una cadena es un palindromo o no
     *
     *@param stringToCheck La cadena a comprobar
     *@return Nos devuelve si el resultado de la comprobacion es que efectivamente es un palindromo, o que no lo sea
     */
    public static String isPalindrome(String stringToCheck) {
        char[] stringToCheckCharacterArray = stringToCheck.toCharArray();
        boolean pal = true;
        int positionFromTheBeginning = 0;
        int positionFromTheEnd = stringToCheckCharacterArray.length - 1;
        while (positionFromTheEnd > positionFromTheBeginning) {
            if (stringToCheckCharacterArray[positionFromTheBeginning] != stringToCheckCharacterArray[positionFromTheEnd]) {
                pal = false;
            }
            ++positionFromTheBeginning;
            --positionFromTheEnd;
        }
        String result;
        if (pal) {
            result = "-esta palabra es palindromo";
        } else {
            result = "-esta palabra no es palindromo";
        }

        return result;
    }
}

