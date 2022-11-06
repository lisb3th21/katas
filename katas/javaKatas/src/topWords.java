import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class topWords {
    public static List<String> top3(String s) {
        String[] lista;
        lista = s.split("[ .,\n ]+");
            for (int i=0; i<s.length(); i++){

            }
System.out.println(lista);
        for (String string : lista) {
            System.out.println(string);
        }
Arrays.sort(lista);
System.out.println(lista);
for (String string : lista) {
    System.out.println(string);
}
        return null;
    }

    public static void main(String[] args) {
        top3("hola\nsaad que tal.dddd,dddd");
    }
}
