import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans = "";
        
        if (input.substring(8,10).equalsIgnoreCase("PM")){
            int hour = Integer.parseInt(input.substring(0,2)) + 12;
            if (input.substring(0,2).equalsIgnoreCase("12"))
                hour = hour - 12;
            ans = hour + ":" + input.substring(3,8);    
        }else{
            if (input.substring(0,2).equalsIgnoreCase("12"))
                ans = "00" + input.substring(2,8);
            else
                ans = input.substring(0,8);
        }
        System.out.println(ans);
    }
}