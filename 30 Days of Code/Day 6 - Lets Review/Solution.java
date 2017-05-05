import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner ( System.in);
        String oddString = "";
        String evenString = "";
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 1; i<= n; i++){
            String s = scanner.nextLine();
            evenString = "";
            oddString = "";
            for (int j=0; j < s.length(); j++){
                if (j%2 == 0){
                    evenString += s.charAt(j);
                }else{
                    oddString += s.charAt(j);
                }
            }
            System.out.println(evenString + " " + oddString);
        }
        scanner.close();
    }
}