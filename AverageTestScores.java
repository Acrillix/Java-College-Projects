  
/*Brendan 
Professor Brown
10/16/2019
A program to average test scores and determine if it is passing or not
*/

import java.util.*;

public class AverageTestScores {
   public static void main (String[] args) {
   
   Scanner in = new Scanner(System.in);
   
   System.out.println("Please enter your first test score: ");
   double test1 = in.nextDouble();
   
   System.out.println("Please enter your second test score: ");
   double test2 = in.nextDouble();
   
   System.out.println("Please enter your third test score: ");
   double test3 = in.nextDouble();
   
   System.out.println("Please enter your fourth test score: ");
   double test4 = in.nextDouble();
   
   System.out.println("Please enter your fith test score: ");
   double test5 = in.nextDouble();
   
      double sum = test1 + test2 + test3 + test4 + test5;
      
      double average = sum/5;
      
         if (average >= 64.5) { 
            System.out.println("Your average test score of " + average + " is passing.");
         } else {
            System.out.println("Your average test score of " + average + " is not passing.");
      }
   }
}
