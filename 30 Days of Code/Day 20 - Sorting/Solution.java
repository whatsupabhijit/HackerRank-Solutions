import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static int bubbleSort(int[] a, int n){
        int noOfSwap = 0;
        
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n - i - 1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    noOfSwap++;
                }
            }
            if (noOfSwap == 0) break;
        }
        
        return noOfSwap;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++)
            a[i] = in.nextInt();

        // Write Your Code Here
        System.out.println("Array is sorted in " + bubbleSort(a, n) + " swaps.\n" + 
                           "First Element: " + a[0] + "\n" +
                           "Last Element: "  + a[n-1]);
        in.close();
    }
}