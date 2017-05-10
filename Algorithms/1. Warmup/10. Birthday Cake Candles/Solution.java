import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxHeight = 0, ans = 0, currentNumber;
        
        for(int height_i=0; height_i < n; height_i++){
            currentNumber = in.nextInt();
            if (currentNumber > maxHeight){
                maxHeight = currentNumber;
                ans = 1;
            }else if (currentNumber == maxHeight){
                ans ++ ;
            }
        }

        System.out.println(ans);
    }
}