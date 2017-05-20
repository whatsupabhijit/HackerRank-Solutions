import java.io.*;
import java.util.*;

public class Solution {

    
    public static void add(int[] heap, int value, int size){     

        int i = size;
        //System.out.println ("--" + i);
        
        heap[i] = value;
        while (i >= 0 && heap[i] < heap[(i-1)/2]){
            int temp = heap[i];
            heap[i] = heap[(i-1)/2];
            heap[(i-1)/2] = temp;
            
            i = (i - 1) / 2;
        }

    }
    
    public static void min(int[] heap){
        System.out.println(heap[0]);
        
        //for(int a: heap)
        //    System.out.print(a + " ");
        //System.out.println();
        
    }
    
    public static int find(int[] heap, int value, int size){
        for (int i = 0; i < size; i++){
            if (heap[i] == value)
                return i;
        }
        
        return -1;
    }
    
    public static void percolateDown(int[] heap, int i, int size){
        int min;
        int left = left(i, size);
        int right = right(i, size);

        if ((left != -1) && (heap[left] < heap[i]) && (left < size))
            min = left;
        else
            min = i;
        
        if ((right != -1) && (heap[right] < heap[min]) && (right < size))
            min = right;
        
        //System.out.println(" -- min =" + min + " i=" + i);
        
        if (min != i){
            int temp = heap[min];
            heap[min] = heap[i];
            heap[i]=temp;
        }else
            return;
        
        percolateDown(heap,min,size);
    }
     
    public static int left(int i, int size){
        int left = 2 * i + 1;
        if (left> size )
            return -1;
        else 
            return left;
    }
    
    public static int right(int i, int size){
        int right = 2 * i + 2;
        if (right > size)
            return -1;
        else
            return right;
    }
    
    public static int[] resizeHeap(int[] heap, int capacity, int size){
        int[] oldArray = new int [capacity];
        System.arraycopy(heap, 0, oldArray, 0, size- 1);
        
        heap = new int[capacity * 2];
        if (heap == null)
            System.out.println("Memory Error");
        
        for (int i=0; i < size; i++)
            heap[i] = oldArray[i];
            
        
        capacity *= 2;
        oldArray = null;
        return heap;
    }
   
    public static void main(String[] args) {

        //Heap Data Structure
        int capacity = 100000;   // There is something wrong with the resizeHeap para. Fix it if you can.Thats why took this value so large.
								 // but actually since resizeHeap() is never getting called so this works fine any input less than 100,000 items in heap.
								 // PLEASE FIX THIS.
        int size = 0;
        int[] heap = new int[capacity];   
        
        
        //Take input
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        int value = 0;
                
        //Take choices and perform necessary functions.
        for (int i=0; i < queries; i++){
            int choice = scanner.nextInt();
            if (choice == 1 || choice == 2)
                value = scanner.nextInt();
            
            //Adds an element in the heap
            if (choice == 1){     
                if (size != 0 && size == capacity) {       
                    heap = resizeHeap(heap, capacity, size); 
                    capacity *= 2;
                }
                add(heap, value, size);
                size++;
                
            }
            
            //First find, replace with the last element and then percolate down an element from the heap
            else if(choice == 2){  
                int x = find(heap, value, size);
                //System.out.println("Found at index:" + x);
                if (x == -1)
                    System.out.println("Value not found in heap");
                else{
                    heap[x] = heap[size - 1];
                    heap[size - 1] = 0;
                    size--;
                    percolateDown(heap,x,size);   
                }
            }
            
            //print the minimum element from the heap
            else{
                min(heap);
            }
        }
    }
}