import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        double zeroPercent = 0.0f, positivePercent = 0.0f, negativePercent = 0.0f;
        double zeroCount=0, positiveCount=0, negativeCount = 0;
                
        while (scanner.hasNext()){
            int element = scanner.nextInt();
            if (element == 0){
                zeroCount ++ ;
            }else if (element > 0){
                positiveCount ++ ;
            }else {
                negativeCount ++ ;
            }
        }
        
        zeroPercent = (double)(zeroCount/n);
        positivePercent = (double)(positiveCount/n);
        negativePercent = (double)(negativeCount/n);
            
        System.out.println(String.format("%06f", positivePercent));
        System.out.println(String.format("%06f", negativePercent));
        System.out.println(String.format("%06f", zeroPercent));
        
       
    }
}