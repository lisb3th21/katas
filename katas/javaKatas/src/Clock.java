/*
Clock shows h hours, m minutes and s seconds after midnight.

Your task is to write a function which returns the time since midnight in milliseconds.
*/

public class Clock {
    public static int Past(int h, int m, int s){
        int miliseconds=0;

        miliseconds+=(h*60*60*1000)+(m*60*1000)+s*1000;

        return miliseconds;
    }

    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));
    }
}

