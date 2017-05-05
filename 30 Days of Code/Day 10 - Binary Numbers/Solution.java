import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Map<Integer, Integer> maxOne = new HashMap<Integer, Integer>();
        maxOne.put(1,0);
        
        int count = 0, curr;
       
        while (n != 0){
            curr = n % 2;
            if (curr == 0){
                if (count > maxOne.get(1))
                    maxOne.put(1, count);
                count = 0;
            }else
                count++;
            n = n/2;
        }
        
        if (count > maxOne.get(1))
                    maxOne.put(1, count);
        
        System.out.println(maxOne.get(1));
    }
}