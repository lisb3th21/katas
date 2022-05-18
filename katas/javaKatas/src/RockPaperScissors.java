/**
 * va de piedra papel o tijeras xD
 */

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        String result="";

            if(p1.equals(p2)){
                result="Draw!";
            }else{
            switch (p1) {
            case "paper":
                if(p2.equalsIgnoreCase("scissors")){
                    result="Player 2 won!";
                }else{
                    result="Player 1 won!";
                }
            break;
            case "scissors":
            if(p2.equalsIgnoreCase("rock")){
                result="Player 2 won!";
            }else{
                result="Player 1 won!";
            }
            break;
            case "rock":
            if(p2.equalsIgnoreCase("paper")){
                result="Player 2 won!";
            }else{
                result="Player 1 won!";
            }
            break;
            default:
                break;
            }
            
        }
        return result;
      }
      public static void main(String[] args) {
          System.out.println(rps("rock", "paper"));
      }
}
