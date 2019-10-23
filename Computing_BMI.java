import java.util.Scanner;


public class Compute_BMI {

   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter weight in pounds: ");
      double weight = input.nextDouble();
      
      System.out.print("Enter heigh in inches: ");
      double height = input.nextDouble();
      
      double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
      
      System.out.println("BMI is " + bmi);
}