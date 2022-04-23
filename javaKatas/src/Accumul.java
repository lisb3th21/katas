/**
 * Ejercicio que va de multiplicar caracteres por posicion poniendo el primer caracter en mayuscula
 * no sé como explicarlo aaaa
 */

public class Accumul {
    public static String accum(String s) {
        String result="";
        for(int i=0; i<s.length(); i++){
            for (int j = 0; j <= i; j++) {
                if(j==0){
                    result+=Character.toUpperCase(s.charAt(i));
                }else{
                    result+=Character.toLowerCase(s.charAt(i));
                }
                }
                result+="-";
            }
       
            result=result.substring(0, result.length()-1);
            return result;
        }

public static void main(String[] args) {
    System.out.println(accum("HbideVbxncC"));
}
    }
        
       

