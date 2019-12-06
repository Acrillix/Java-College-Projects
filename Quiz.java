//Brendan
//Bonus points for reversing the subtraction with a negative number
//10-25-19

import java.util.*;

public class Quiz {
   public static void main(String [] args) {
   
   int defaultNum1 = (int)(Math.random() * 9);
   int defaultNum2 = (int)(Math.random() * 9);
   
   Scanner userInput = new Scanner(System.in);
   
   System.out.println("Your numbers are: " + defaultNum1 + " and " + defaultNum2);
   
   int sum = defaultNum1 + defaultNum2;
   
   System.out.println("What is " + defaultNum1 + " + " + defaultNum2 + "?");
   int userAnswer1 = userInput.nextInt();
   
   if(userAnswer1 == sum) {
      System.out.println("You are correct!");
   } else {
      System.out.println("You are incorrect. The correct answer is: " + sum);
   }      
   
   int subtr = defaultNum1 - defaultNum2;
   if(defaultNum1 < defaultNum2) {
      subtr = defaultNum2 - defaultNum1;
   }   
   
   System.out.println("What is " + defaultNum1 + " - " + defaultNum2 + "?");
   int userAnswer2 = userInput.nextInt();
   
   if(userAnswer2 == subtr) {
      System.out.println("You are correct!");
   } else {
      System.out.println("You are incorrect. The correct answer is: " + subtr);
   }
   
         
   
   }
}   
