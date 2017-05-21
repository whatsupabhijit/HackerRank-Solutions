import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        //int[] list = new int[N+1]; //Why N + 1 ? Check the reason for a and b below. You will have a gotcha moment!!!
        long[] list = new long[N+1];
        //int max = 0, sum = 0;
        long max =0l, sum = 0l;
        
        for(int i=0; i <= N; i++)
            list[i] = 0;
        
        //for each M operation store +k at startpoint. And -k in endpoint.<-----This changes the algo from O(nm) to O(n+m)
        //Think of this as an histogram. before startpoint to startpoint there is a rise of +k. 
        // And then that height after startpoint to endpoint(inclusive) is constant.
        // Then just after the endpoint we make the height inverted to mark that, the endpoint exists 1 left to current position.

        for(int i = 0; i < M; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            //int k = scanner.nextInt(); // long needed, as N is max 10^7 in problem. But k is max 10^9. another gotcha!!!!
            long k = scanner.nextLong(); // before I changed int to long, with same logic eveerything was failing after test case 3.
            
            //The question gives a to b in array starting with 1.
            //Since our array starts with 0, so we need to take a-1 to b-1.
            //However, for b we re-add 1 because we want to change values from a to b inclusive.
            //So now we can confirm that our endpoint where we are adding -k is at 1 to the right of endpoint inclusive b.
            list[a-1] += k;
            if (b < N)
                list[b] -= k;
        }
        
        for (int i = 0; i < N; i++){
            sum += list[i];
            max = Math.max(sum,max);
        }
            
        
        System.out.println(max);
        
        scanner.close();
    }
}