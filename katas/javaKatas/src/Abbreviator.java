import javax.swing.text.PlainDocument;

/**
 * The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.

Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or greater into an abbreviation, following these rules:

A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
The abbreviated version of the word should have the first letter, then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
 */



public class Abbreviator {
    public static String abbreviate(String string) {
        
        String resultado="";
        String palabra="";

        for (int i = 0; i < string.length(); i++) {
            
            if(string.charAt(i)==' ' || string.charAt(i)=='-' || i==string.length()-1){
                System.out.println(palabra);
                //System.out.println(string.charAt(i));
                if( i==string.length()-1){
                    resultado+=abreviado(palabra);
                }else{
                    resultado+=abreviado(palabra)+string.charAt(i);
                }               
                palabra="";
            }else{
                palabra+=string.charAt(i);
            } 
        }        
        return resultado;
      }


      /**
       * Método que abrevie la palabra 
       */
      public static String abreviado(String palabra){
          if(palabra.length()>3){
        return  palabra.charAt(0)+Integer.toString(palabra.length()-2)+palabra.charAt(palabra.length()-1);
          }else{
              return palabra;
          }
      }

      public static void main(String[] args) {
          System.out.println(abbreviate("me quiero morir"));
      }
}