//Brendan O'Shaughnessy
//10-4-2019
//Professor Brown
//A program to figure out how many boxes you need depending on amount of rocks

import java.util.Scanner;

   public class BoxRocks {
      public static void main(String[] args) {
      runScannerDemonstration();
}
      public static void runScannerDemonstration() {
      Scanner scanner = new Scanner(System.in);

         System.out.println( "How many rocks?" );
         int rocks = scanner.nextInt(); 
         int boxesNeeded = rocks/12;
         int remainderRocks = rocks%12;
                                
         System.out.print("You will completely fill ");              
         System.out.print( boxesNeeded + " boxes, ");
         System.out.print("with " + remainderRocks);
         System.out.print(" rocks leftover.");
         scanner.close(); 
}
}
