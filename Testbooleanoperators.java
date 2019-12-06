/*Brendan 
10/24/2019
Professor Brown
Intro to Programming
A program to determine if an integer is divisible by pre-defined methods using boolean logic operators
*/


import java.util.*;

public class TestBooleanOperators {
   public static void main(String [] args) {
   
   Scanner inputNumber = new Scanner(System.in); //Calling scanner 'inputNumber'    
   
   int num1 = 2;
   int num2 = 3;
   int num3 = 5; //Setting the three divisible numbers to variables
   
   System.out.println("Please enter an integer: ");
   int numInput1 = inputNumber.nextInt(); //Setting the first input to 'numInput1' to easily distinguish
   
   if((numInput1 % num1 == 0) && (numInput1 % num2 == 0)) {
      System.out.println("This number is divisible by 2 and 3");
      } else {
         System.out.println("This number is not divisible by 2 and 3");
      } 
  
  System.out.println("Please enter an integer: ");
  int numInput2 = inputNumber.nextInt();
      
  if((numInput2 % num1 == 0) || (numInput2 % num2 ==0)) {
      System.out.println("This number is divisible by 2 or 3");
      } else {
         System.out.println("This number is not divisible by 2 or 3");
      }
   
   System.out.println("Please enter an integer: ");
   int numInput3 = inputNumber.nextInt();   
         
  if((numInput3 % num1 == 0) && (numInput3 % num2 == 0) && (numInput3 % num3 == 0)) {
      System.out.println("This number is divisible by 2 and 3 and 5");
      } else {
         System.out.println("This number is not divisible by 2 and 3 and 5");
      }   
  
  
  }
}       
