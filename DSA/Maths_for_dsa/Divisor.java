package DSA.Maths_for_dsa;

import java.util.ArrayList;
import java.util.List;

public class Divisor {
    public static List<Integer> divisor(int num){
        List<Integer> divisorList = new ArrayList<>();
        for( int i =1; i<=Math.sqrt(num) ; i++){
            if( num%i == 0 ){
                divisorList.add(i);
                if( i != num/i){
                    divisorList.add(num/i);
                }
            }

        }
        return divisorList;
    }
}
