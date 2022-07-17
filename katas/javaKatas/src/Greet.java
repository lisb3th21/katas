import java.util.Scanner;

public class Greet {
    public static String greet(String name)
  {
    return "Hello, " +name+" how are you doing today?";
  }



  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    System.out.println("Cuál es tu nombre?");

    String nombre = input.nextLine();

    System.out.println(greet(nombre));


  }
}
