import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[] buildArray(int[] array, Scanner scanner, int n){        
        for (int i=0; i < n; i++ )
            array[i] = scanner.nextInt();
        return array;
    }

    public static int[] reverseArray(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        
        return array;
    }
    
    public static void printArray(int[] array){
        for(int anItem : array)    
            System.out.print(anItem + " ");
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        array = buildArray(array, scanner, n);
        array = reverseArray(array);
        printArray(array);
    }
}