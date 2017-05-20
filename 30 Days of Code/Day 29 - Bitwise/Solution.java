import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            
            //Logic: when k is odd ---------> (k-1) | k => k
            //       But when k is even ----> maximum can be reached only when (K - 1) | K is <= n
            //example: if k is 11 then -----> (11 - 1) | 11 ==> gives 11
            //       example: if is is 10 --> (10 - 1) | 10 ==> gives 11 which is k+1, so maximum which is less than k is k-2
            if ((k-1 | k) <= n) 
                System.out.println(k-1);
            else
                System.out.println(k-2);

        }
    }
}