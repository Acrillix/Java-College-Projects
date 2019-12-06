/*Brendan
10-24-2019
Professor Brown
A program to give the user the month when provided the number of the month
*/

import java.util.*;

public class Months {
   public static void main (String [] args) {
   
   Scanner monthInput = new Scanner(System.in);
   
   System.out.println("Please enter the number of the month: ");
   
   int monthNum = monthInput.nextInt();
   String monthName = "";
   
   switch (monthNum) {
      
      case 1:  monthName = "January";
               break;
               
      case 2:  monthName = "February";
               break;
               
      case 3:  monthName = "March";
               break;
               
      case 4:  monthName = "April";
               break;
               
      case 5:  monthName = "May";
               break;
               
      case 6:  monthName = "June";
               break;
               
      case 7:  monthName = "July";
               break;
               
      case 8:  monthName = "August";
               break;
               
      case 9:  monthName = "September";
               break;
               
      case 10: monthName = "October";
               break;
               
      case 11: monthName = "November";
               break;
               
      case 12: monthName = "December";
               break;        
      }
      
      if((monthNum < 0) || (monthNum > 12)) {
         System.out.println("Your month is invalid");
      } else {
         System.out.println("Your month is: " + monthName);
      }
  }
}         
        
