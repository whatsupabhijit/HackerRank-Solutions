import java.io.*;
import java.util.*;

public class OnlyPrintSolution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) 
            array[i] = scanner.nextInt();
        scanner.close();
        
        /* If only printing is required then no need to reverse it */
        for (int i = n - 1; i >= 0; i--) 
            System.out.print(array[i] + " ");
    }
}