//Brendan O'Shaughnessy
//10-2-2019
//Professor Brown
//A program to calculate the area, circumference, and then round the area

import java.util.Scanner;

   public class Circles {
      public static void main(String[] args) {
      runScannerDemonstration();
}
      public static void runScannerDemonstration() {
      Scanner scanner = new Scanner(System.in);
      
         System.out.println("RADIUS: ");
         double radius = scanner.nextDouble();
         double area = Math.PI * (radius * radius);
         System.out.println("AREA: " + area);
         double circumference = Math.PI * 2*radius;
         System.out.println("CIRCUMFERENCE: " + circumference);
         area = (double)Math.round(area);
         int roundedArea = (int) area;
         System.out.println("ROUNDED AREA: " + area);
     }
}                  