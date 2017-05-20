import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Solution {

    public static boolean isPrime(int number){
        boolean isItPrime = true;
        
        // if the number is 2 or any even number don't go for loop --- O(1). Also note 1 is not prime.
        if( number == 2 )
            return isItPrime;
        else if( number == 1 || (number & 1) == 0)
            return false;

        int sqrt = (int) Math.sqrt(number);  // store this so that its not calculated in each iteration which will take less time.
        for(int i = 3; i <= sqrt; i += 2){
            if( number % i == 0 ){ 
                isItPrime = false;
                break;
            }
        }      
        return isItPrime;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalInputs = scanner.nextInt();
        for (int i = 0; i < totalInputs; i++){
            boolean isItPrime = isPrime(scanner.nextInt());
            if (isItPrime)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        
    }
}