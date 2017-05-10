import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        
        for (int row = 1; row <= n; row++){
            for (int col = 1; col<=n ; col++ ){
                if (col > (n-row)){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}