import java.io.*;
import java.util.*;

public class Solution {
    
    public static int factorial(int n){
        return (n > 1) ? n * factorial(n - 1) : 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorialOfN = factorial(n);
        System.out.println(factorialOfN);
    }
}