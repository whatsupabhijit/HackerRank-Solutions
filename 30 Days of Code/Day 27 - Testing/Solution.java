import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {

        //We are going to write 5 test cases. 4 randomly generated. 1 manual edge cases.
        System.out.println("5");        
        
        for (int i = 0; i < 4; i++){
            //Math.random() method returns a random number between 0.0 and 0.999.
            //So, you multiply it by 200, so upper limit becomes 0.0 to 199.8 when you add 3, it becomes 3.0 to 199.8, 
            //now when you truncate to int, you get 3 to 200.
            //As in our case 3 <= n <= 200 so below 
            int n = (int )(Math.random() * 200 + 3);
        
            //similarly for 1 <= k <= n
            int k = (int) (Math.random() * n  + 1) ;
            
            System.out.println(n + " " + k);
            
            // for each n genearate arrival number in range -10^3 <= a <= +10^3. But for real example lets say
            //  -5 <= a <= 5. i.e. students are maximum 5 minutes late or at least 5 minutes early to class.
            for(int j = 1; j <= n; j++){
                int a = (int) (Math.random() * 5 - 5);
                System.out.print(a + " ");
                if (j == n)
                    System.out.println();
            }
        }
        System.out.println("3 3");
        System.out.println("-1 -3 0 2");
    }    
}