import java.io.*;
import java.util.*;
import java.time.*;

public class Solution {
  
    //LocalDate is THE class for most date related problems.
    // of(yy, mm , dd) --- returns the date format
    // isEqual(LocalDate e)  ---- checks if two dates are equal
    // isBefore(LolcaDate e) ---- checks if one date is before another
    // getYear(), getMonth(), getDate() --- returns the year, month and date
    // getDayOfMonth() -- Gets the day-of-month field.
    // getMonthValue() -- Gets the month-of-year field from 1 to 12.
    // for more read https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
    
    public static LocalDate getInDateFormat(Scanner scanner){  
        int date = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        return LocalDate.of(year, month, date);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate submittedDate = getInDateFormat(scanner);
        LocalDate expectedDate  = getInDateFormat(scanner);
       
        int fine = 0; 
        if (submittedDate.isEqual(expectedDate) || submittedDate.isBefore(expectedDate))
            fine = 0;
        else if (submittedDate.getMonth() == expectedDate.getMonth()  && submittedDate.getYear()  == expectedDate.getYear())
            fine = 15 * (submittedDate.getDayOfMonth() - expectedDate.getDayOfMonth());
        else if (submittedDate.getYear() == expectedDate.getYear())
            fine = 500 * (submittedDate.getMonthValue() - expectedDate.getMonthValue());
        else
            fine = 10000;
            
        System.out.println(fine);
    }
}