import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] result = new int[2];
        if (a0 > b0){
            result[0]++;
        }
        if (a1 > b1){
            result[0]++;
        }
        
        if (a2 > b2){
            result[0]++;
        }
        
        if (a0 < b0){
            result[1]++;
        }
        if (a1 < b1){
            result[1]++;
        }
        
        if (a2 < b2){
            result[1]++;
        }
        
       return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        String separator = "", delimiter = " ";
        for (Integer value : result) {
            System.out.print(separator + value);
            separator = delimiter;
        }
        System.out.println("");
        

    }
}
