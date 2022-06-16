import javax.tools.Diagnostic;

/**
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 */


public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int contador=0;
        String duplicado="";
      for (int i = 0; i < text.length(); i++) {
        char caracter=Character.toUpperCase(text.charAt(i));
        for (int j = 0; j < text.length(); j++) {
            if (Character.toUpperCase(caracter)==Character.toUpperCase(text.charAt(j)) && j!=i && duplicado.indexOf(caracter)==-1) {
                contador++;
                duplicado+= caracter;
            }
        }
      }
      return contador;
    }
  }