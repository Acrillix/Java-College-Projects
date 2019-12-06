//Professor Brown
//9-26-2019
//A program to compute the BMI based on weight and height rounded to the hundreth decimal place

import java.util.Scanner;


public class Exercise2_14 {

   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter weight in pounds: ");
      double weight = input.nextDouble();
      
      System.out.print("Enter heigh in inches: ");
      double height = input.nextDouble();
      
      double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
      
      System.out.print("BMI is ");
      System.out.printf("'%5.2f'%n", + bmi);
      
}
}
