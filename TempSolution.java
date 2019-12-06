
/*
Brendan 
CSC-115
Professor Brown
11/25/2019
Not quite there...Close
	This program will read in temperature entered by user, determine whether water is a solid liquid or gas at the temperature entered.
	11/2018
   Follow directions in the comments, and get this to run correctly!
This assignment did not work and received a 3/5
*/

import java.util.Scanner;

public class TempSolution
{
	public static void printTemp (double temperature)   // this is the method I will call, it can appear here, or after the main method it is
	                                                 // void, because it does not return anything, it needs an input parameter, replace the xxxxxxx here
	{
		if (temperature <= 32.0)
		{
			System.out.print("solid at ");
		}

		else if (temperature >= 212.0)
		{
			System.out.print("gas at ");
		}

		else
			System.out.print("liquid at ");

	}
	public static void printMess ()              //this is a void, non returning method, no input parameter needed
	{
	     System.out.print("Water is ");
	 }

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Please enter the temperature (enter 999 to stop): ");

            int tt = input.nextInt();
            double temperature = tt;

            if (tt != 999) {
                break;
            }

        printMess ();                              // call the method that displays the beginning of the message (replace the xxxxxxxxx)

        printTemp(temperature);                // call the method which needs 1 parameter, temperature
                                                    // fill in the ---------- and xxxxxxxxxxxx here
        System.out.println(tt + " degrees.");        }

        System.out.println("\nEnd of execution! Thanks for running my program!");
    }
    
}
