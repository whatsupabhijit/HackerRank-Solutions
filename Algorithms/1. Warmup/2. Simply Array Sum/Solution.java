import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        int i = 0, sumOfArray = 0;
        while (scanner.hasNext()){
            array[i] = scanner.nextInt();
            sumOfArray += array[i++];
        }
        System.out.println(sumOfArray);
    }
}