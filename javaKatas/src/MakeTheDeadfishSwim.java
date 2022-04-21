/**
 * Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.
 */

public class MakeTheDeadfishSwim {
    public static int[] parse(String data) {
        int contador=0;
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i)=='o'){
                contador++;
            }
        }
        int[] result=new int[contador];

        int value=0;
        int espacios=0;
        for(int i=0; i<data.length(); i++){
            if(data.charAt(i)=='i'){
                value++;
            }else if(data.charAt(i)=='d'){
                value--;
            }else if(data.charAt(i)=='s'){
                value= (int)Math.pow(value, 2);
            }else if(data.charAt(i)=='o'){
                result[espacios]=value;
                espacios++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(parse("iiisdoso"));
    }
}
