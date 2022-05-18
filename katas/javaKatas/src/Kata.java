public class Kata {
    public static int min(int[] list) {
        
        int min=list[0];
        for(int i=1; i<list.length; i++){
            if(min>list[i]){
                min=list[i];
            }
        }
        return min;
        }
      public static int max(int[] list) {
        int max=list[0];
        for(int i=0; i<list.length; i++){
            if(max>list[i++]){
                max=list[i];
            }
        }
        return max;
      } 

      public static void main(String[] args) {
          System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
          System.out.println(min(new int[]{42, 54, 65, 87, 0}));
          System.out.println(max(new int[]{4,6,2,1,9,63,-134,566}));
          System.out.println(max(new int[]{5}));
      }
}
