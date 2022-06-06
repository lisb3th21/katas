import javax.swing.text.PlainDocument;


public class Abbreviator {
    public static String abbreviate(String string) {
        String resultado="";
        String palabra="";
        for (int i = 0; i < string.length(); i++) {
            if(i==string.length()-1 || " -_'.;:,][1234567890".indexOf(string.charAt(i))!=-1){
                if( i==string.length()-1){
                    resultado+=abreviado(palabra+=string.charAt(string.length()-1));
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

      public static String abreviado(String palabra){
          if(palabra.length()>3){
        return  palabra.charAt(0)+Integer.toString(palabra.length()-2)+palabra.charAt(palabra.length()-1);
          }else{
              return palabra;
          }
      }

      public static void main(String[] args) {
          System.out.println(abbreviate("sits-sits; mat, a"));
      }
}