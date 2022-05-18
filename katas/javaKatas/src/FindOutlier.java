
public class FindOutlier{
    static int find(int[] integers){
        int contadorPar=0;
        int contadorImpar=0;
        int result=0;
        for(int i=0; i<integers.length; i++){
            if(integers[i]%2==0){
                contadorPar++;  
            }
        }

        for(int i=0; i<integers.length; i++){
            if(integers[i]%2!=0){
                contadorImpar++;  
            }
        }

        if(contadorImpar==1){
            for(int i=0; i<integers.length; i++){
                if(integers[i]%2!=0){
                    result=integers[i];  
                }
            }
        }else{
            for(int i=0; i<integers.length; i++){
                if(integers[i]%2==0){
                    result=integers[i];  
                }
            }
        }
    return result;
  }}