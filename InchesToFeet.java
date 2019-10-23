public class InchesToFeet {
	public static void main(String[] args) {

		convert(); // convert feet to inches and output

	}

	// This method generate a random number of total inches.
	// It then converts to feet and inches and outputs the answer.
	public static void convert() {

		// randomly picks a number between 1-200
	    int totalInches = (int)(Math.random()*200 + 1);

	    // Convert to feet and inches.
	    // ex. if totalInches is 38, the output would be: 38 inches is 3 feet, and 2 inches
	    // ADD CODE BELOW
      System.out.println(totalInches + " inches is " + (int) (totalInches / 12) + " feet, and " + totalInches % 12 + " inches");
      //Basically to get the conversion you divide the inches by 12 THEN take the leftover and multiply it by .12 (12%)
      //I used "string" + equation + String + Equation + String to get the format to be "X inches is y feet and Z inches"




	}

}