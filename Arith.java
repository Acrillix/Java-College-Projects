/*Brendan 
Professor Brown
CSC-103
11/11/2019
A program to get 2 integers and add, subtract, multiply, and divide
This program has been edited as of 11/12/19
*/

import java.util.Scanner;

public class Arith {
      public static int sum() {                         
      	Scanner inputSum = new Scanner(System.in);        

      	System.out.println("Please enter an integer: ");

      	int intOne = inputSum.nextInt();

      	System.out.println("Please enter another integer: ");

      	int intTwo = inputSum.nextInt();

      	return (intOne + intTwo);

      }

      public static int diff() {                            
      Scanner inputDiff = new Scanner(System.in);

      System.out.println("Please enter an integer: ");

      int intThree = inputDiff.nextInt();

      System.out.println("Please enter another integer: ");

      int intFour = inputDiff.nextInt();
      
      return (intThree - intFour);

      }

      public static int prod() {
      Scanner inputProd = new Scanner(System.in);

      System.out.println("Please enter an integer: ");

      int intFive = inputProd.nextInt();

      System.out.println("Please enter another integer: ");

      int intSix =  inputProd.nextInt();

      return (intFive * intSix);

      }

      public static int quotient() {
      Scanner inputQuot = new Scanner(System.in);

      System.out.println("Please enter an integer: ");

      int intSeven = inputQuot.nextInt();

      System.out.println("Please enter another integer: ");

      int intEight = inputQuot.nextInt();

      return (intSeven / intEight);

      }

      public static void main(String [] args) {

         int ansSum = sum();                   
         System.out.println(ansSum);
         int ansDiff = diff();
         System.out.println(ansDiff);
         int ansProd = prod();
         System.out.println(ansProd);
         int ansQuot = quotient();
         System.out.println(ansQuot);
      }
}
