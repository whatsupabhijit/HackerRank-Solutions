import java.io.*;
import java.util.*;

public class Solution {

    public static int getHourGlassSum(int[][] array, int glassRowStart, int glassWidth, int glassColStart){
        //System.out.println("entering-- row=" + glassRowStart + " col=" + glassColStart);
        int sum = 0;
        int glassRowEnd = glassRowStart + glassWidth;
        int glassColEnd = glassColStart + glassWidth;
    
        for (int i = glassRowStart; i < glassRowEnd; i++){
            for (int j = glassColStart; j < glassColEnd; j++){  
                sum += array[i][j]; 
                if (i == glassRowStart + 1 && (j == glassColStart || j == glassColEnd - 1))
                    sum -= array[i][j];
                //System.out.println(" -- array[" + i + "][" + j + "] =" + array[i][j] + " & sum=" + sum);                
            }   
            //System.out.println();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int row = 6, col = 6, glassWidth = 3;
        
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[row][col];
        
        for(int i = 0 ; i < row; i++)
            for(int j=0; j < col; j++)
                array[i][j] = scanner.nextInt();
                      
        int[] sums = new int[16];
        
        int k = 0;
        for (int i = 0; i <= glassWidth; i++){
            for(int j=0; j <= glassWidth; j++)
                sums[k++] = getHourGlassSum(array, i, glassWidth, j);
        }
        
        Arrays.sort(sums);
        System.out.println(sums[sums.length - 1]);
            
        
    }
}