/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.
 */

public class PRimeDecomp {
    public static String factors(int n) {
        String result="";
        System.out.println("Aqui");
        int i=2;
        int contador=0;
         while(n>0){
             if(n%i==0){
                 n-=n/i;
                 contador++;
             }else{
                 result+="("+i+"**"+contador+")";

             }
             if(n==1){
                 System.exit(0);
             }
         }
        return result;
    }
    public static void main(String[] args) {
        
        System.out.println(factors(3));
    
        System.out.println("Aqui");
    }
}
