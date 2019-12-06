//10-2-19
//Professor Brown
//A program that uses user input to output a line of text

import java.util.Scanner;

   public class MadLibs {
      public static void main(String[] args) {
      runScannerDemonstration();
}
      public static void runScannerDemonstration() {
      Scanner scanner = new Scanner(System.in);
      
         System.out.println("Please enter you name: ");
         String name = scanner.nextLine();
               
         System.out.println("Please enter your profession: ");
         String profession = scanner.nextLine();
         
         System.out.println("Please enter your employer: ");
         String employer = scanner.nextLine();  
         
         System.out.println("Please enter your favorite hobby");
         String hobby = scanner.nextLine();
         
          System.out.println("Please enter your age: ");
         int age = scanner.nextInt();

         
         System.out.println("Hi my name is " + name + " and I am " + age + " years old." + " I am a " + profession + " at " + employer + "." + " I really enjoy " + hobby + 
        ".");
     }    
}         
