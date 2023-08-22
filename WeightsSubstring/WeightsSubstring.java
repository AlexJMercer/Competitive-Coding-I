import java.util.*;

public class WeightsSubstring {
   public static void main(String[] args) {
    String str = "asbcaa";                        // String str="asbcaa";
    int k = 19;                                   // k represents the maximum weight of the substring
    int sum = 0, count = 0, i, j;
    
    for(i = 0; i < str.length(); i++){
        sum = 0;
        for(j = i; j < str.length(); j++){
            sum = sum +  str.charAt(j) - 'a' + 1;
            if(sum <= k)
                count++;
        }
    }
    System.out.print(count);
   }
}
