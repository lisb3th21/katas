
/*
Complete the solution so that the function will break up camel casing, using a space between words.
*/


public class Solution {
    public static String camelCase(String input) {
        String solution="";
        for(int i=0; i<input.length(); i++){
            
            if(Character.isUpperCase(input.charAt(i))){
                solution+=" ";
            }solution+=input.charAt(i);             
        }
        return solution;
      }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCaseTest"));
        
    }
}
