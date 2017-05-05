import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int hourGlassSum(int startingRow, int startingColumn, int[][] arr){
        int sum = 0;
        for(int i=startingRow; i < startingRow + 3; i++){
            for(int j=startingColumn; j < startingColumn + 3; j++){
                //System.out.print(arr[i][j] + " ");
                sum += ((i == startingRow + 1) && (j == startingColumn || j == startingColumn + 3 - 1)) ? 0: arr[i][j];
            }
        }
        //System.out.println(sum);
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;                                
        for(int i=0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int currentSum = hourGlassSum(i,j,arr);
                maxSum = (maxSum < currentSum) ? currentSum : maxSum;
            }
        }
        System.out.println(maxSum);
    }
}