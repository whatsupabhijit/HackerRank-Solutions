import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        while(scan.hasNext()) {
            long n = scan.nextLong();
            sum = sum + n;
            if (min > n) 
                min = n;
            if (max < n) 
                max = n;
        }
        scan.close();
        System.out.println((sum - max) + " " + (sum - min));
    }
}