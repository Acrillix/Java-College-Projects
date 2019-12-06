/*Brendan 
CSC-115
Professor  Brown
11/25/2019
A program to tell you if you guessed the number and how many tries it took
*/


import java.util.*;

public class GuessNumber {
   public static void main (String [] args) {

      
      int number = (int) (Math.random() *101);
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Guess a magic number between 0 and 100");
      
      int guess = -1;
      int c = 0;
      
      while (guess != number) {
      
         System.out.println("\n Enter your guess: ");
         guess = input.nextInt();
         
         if (guess == number) {
            c++;
            System.out.println("Yes, the number is " + number);
            System.out.println("It took you " + c + " guess to get this correct!");
         } else if (guess > number) {
            c++;
            System.out.println("Your guess is too high");
         } else {
            System.out.println("Your guess is too low");
            c++;
         }   
       }
   }
} 
