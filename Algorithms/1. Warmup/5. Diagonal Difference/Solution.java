import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int sumA = 0, sumB = 0, number = 0;
        
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                number = scanner.nextInt();
                if (row == col)
                    sumA += number;
                if ((row + col) == (n+1))
                    sumB += number;
            }
        }
        
        System.out.println(Math.abs(sumA - sumB));
    }
}