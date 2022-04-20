public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        
        int time =(g*3600)/v2-v1;
        int h=time/3600;
        int min=(time%3600)/60;
        int s=time%60;
        int[] result={h, min, s};
        
System.out.println(h);
System.out.println(min);
System.out.println(s);
        return result;
    }

    public static void main(String[] args) {
        race(720, 850, 70);
    }
}