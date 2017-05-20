import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        scanner.nextLine(); // gets rid of newline
        Map<String, Integer> hashMap = new HashMap<>();
        
        for(int i = 0 ; i < N ; i++){
            String current = scanner.nextLine();
            Integer count = hashMap.get(current);
            if (count == null)
                hashMap.put(current, 1);                
            else
                hashMap.put(current, count + 1);
        }
        
        int Q = scanner.nextInt();
        scanner.nextLine(); // gets rid of newline        
        for (int i = 0; i < Q; i++){
            Integer queryCount = hashMap.get(scanner.nextLine());  
            System.out.println((queryCount == null) ? 0 : queryCount);
        }

    }
}