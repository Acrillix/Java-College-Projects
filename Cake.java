/* Fix the comments below, they should explain what this program does
 This program calculates the unit price of cupcakes when the user enters
 the cost of the cupcakes and the amount of cupcakes
 written by Brown (Brendan O'Shaughnessy)
 Oct  2019 */

import java.util.Scanner;

public class Cake {
  public static void main(String args[]) {

	 // insert a line to define a Scanner named input, here
       Scanner input = new Scanner(System.in); 
          
    // insert 2 lines,  first,  prompt the user then read in the total cost of the cupcakes, store in a double named totAmount
       System.out.print("Enter the total cost of the cupcakes: ");
       double totAmount = input.nextDouble();
    // insert 2 lines, first prompt the user then read in the number of cupcakes, store in a double named numCupcakes
       System.out.print("Enter the number of cupcakes: ");
       double numCupcakes = input.nextDouble();
    // modify the next line (correct all logic errors in it, it must produce the correct answer)   
   
    double totAmountc = (totAmount/numCupcakes);
   
   // modify the next line so that the cost of each cupcake is rounded to the nearest cent
   
    System.out.println("The cost of each cupcake is  $" + totAmountc) ;
    
    // close the scanner
       input.close();
  }
}