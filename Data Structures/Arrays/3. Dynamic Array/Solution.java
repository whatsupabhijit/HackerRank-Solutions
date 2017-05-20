import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in) ;
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        int lastAns = 0;
        
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < N; i++) 
            lists.add(new ArrayList<Integer>());
        
        for (int i=0; i < Q; i++){
            int choice = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            ArrayList<Integer> seq = lists.get((x ^ lastAns) % N);
            
            switch(choice){
                case 1: 
                    seq.add(y);
                    break;
                case 2:
                    lastAns = seq.get(y%seq.size());
                    System.out.println(lastAns);
                    break;
            }
        }  
    }
}