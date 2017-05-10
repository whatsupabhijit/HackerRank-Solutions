import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0l;
        int size = scanner.nextInt();
        while (scanner.hasNext()){
            sum += scanner.nextLong();
        }
        System.out.println(sum);
    }
}