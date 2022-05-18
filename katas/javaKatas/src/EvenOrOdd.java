public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String result;
        //Place code here
        if(number%2==0){
            result="Even";
        }else{
            result="Odd";
        }
        return result;
    }
   public static void main(String[] args) {
        
        System.out.println(even_or_odd(6));
        System.out.println(even_or_odd(7));
        System.out.println(even_or_odd(0));;
        System.out.println(even_or_odd(-1));
   } 
}
