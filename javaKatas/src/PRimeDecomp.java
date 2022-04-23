/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.
 */

/**
 * Demasiado lento pero funciona
 * Falta optimizar, seguro que haciendolo con un for va mejor pero va bien unU
 */

public class PRimeDecomp {
    

    public static String factors(int n) {
        String result= "";

        int contador=2;
        int i=0;

        do{
            if(n%contador==0){
                n/=contador;
                i++;
            }else{
                if(i>1){
                    result+="("+contador+"**"+i+")";                    
                }else if(i==1){
                    result+="("+contador+")"; 
                }contador++;i=0;
            }            
        }while(n>0);
        return result;
    }  
    public static void main(String[] args) {
        System.out.println(factors(7775460));
    }
}
