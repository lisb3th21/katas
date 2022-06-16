import java.util.ArrayList;
import java.util.List;

/**
 * This problem takes its name by arguably the most important event in the life of the ancient historian Josephus: according to his tale, he and his 40 soldiers were trapped in a cave by the Romans during a siege.

Refusing to surrender to the enemy, they instead opted for mass suicide, with a twist: they formed a circle and proceeded to kill one man every three, until one last man was left (and that it was supposed to kill himself to end the act).

Well, Josephus and another man were the last two and, as we now know every detail of the story, you may have correctly guessed that they didn't exactly follow through the original idea.

You are now to create a function that returns a Josephus permutation, taking as parameters the initial array/list of items to be permuted as if they were in a circle and counted out every k places until none remained.
 */

public class Josephus {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> nueva = new ArrayList<>();
        int contador=0;
        while (items.size()>0) {
            
            
        }
        return nueva;
    }

    public static <T> void main(String[] args) {
        List<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);

        items.add(4);

        items.add(5);
        items.add(6);
        items.add(7);

        System.out.println(josephusPermutation(items, 3));

    }
    
}
