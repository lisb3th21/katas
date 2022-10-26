import java.util.ArrayList;

/**
 * ValidParentheses
 */
public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        int contador=0;
            for (int i = 0; i < parens.length() ; i++) {
                if (parens.charAt(i)== '(') contador++;
                if (parens.charAt(i)== ')') contador--; 
                if (contador<0) return false; 
            }  
        return contador==0 ;
    }

    public static void main(String[] args) {
        System.out.println(validParentheses("32423(sgsdg)"));
        
    }
}