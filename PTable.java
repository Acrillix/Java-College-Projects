//Brendan O'Shaughnessy
//Professor Brown
//10-13-19
//A program to show a Number, the Power, and the Output

public class PTable {
    
  public static void main(String[] args) {
  

      int x =  (int) 3f;
      int y =  (int) 2f;
                     
      System.out.println("Enter the number you wish to raise to the power: 3");
      System.out.println("Enter the power: (for example, enter 2 if you wish to square a number)\n");
      System.out.println("--------------------------------------");
      System.out.println("number | power | pow(number, power)");
      System.out.println(" 3 \t \t" + " 2 \t \t" +  Math.pow((int) x, (int) y));
      System.out.println("--------------------------------------");


      }
}