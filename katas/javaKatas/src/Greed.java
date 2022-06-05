public class Greed {
    public static int greedy(int[] dice) {

        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        int six=0;

        int resultado=0;

        for (int i = 0; i < dice.length; i++) {
            if(dice[i]==1){
                one++;
            }else if(dice[i]==2){
                two++;
            }else if(dice[i]==3){
                three++;
            }else if(dice[i]==4){
                four++;
            }else if(dice[i]==5){
                five++;
            }else if(dice[i]==6){
                six++;
            }
        }

        if(one>=3){
            resultado+=1000;
            one-=3;
        } if(six>=3){
            resultado+=600;
        } if(five>=3){
            resultado+=500;
            five-=3;
        } if(four>=3){
            resultado+=400;
        } if(three>=3){
            resultado+=300;
        }  if(two>=3){
            resultado+=200;
        }
        if(one<3){
            resultado+=100*one;
        }if(one<5){
            resultado+=50*five;
        }

        return resultado;
    }
}
