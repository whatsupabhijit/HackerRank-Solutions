import java.io.*;
import java.util.*;

public class UsingJava8Solution {
    public static void main(String[] args) {

        //Heap Data Structure
        Queue<Integer> pq = new PriorityQueue<>(); 
        
        //Take input
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        int value = 0;
                
        //Take choices and perform necessary functions.
        for (int i=0; i < queries; i++){
            int choice = scanner.nextInt();
            
            //Adds an element in the heap
            if (choice == 1){
                value = scanner.nextInt();
                pq.add(value);
                
            }
            
            //First find, replace with the last element and then percolate down an element from the heap
            else if(choice == 2){  
                value = scanner.nextInt();
                pq.remove(value);
            }
            
            //print the minimum element from the heap
            else
                System.out.println(pq.peek());
            
        }
    }
}