//Brendan O'Shaughnessy
//Creating Two Triangles Patterns

public class Triangles3 { //Class name is Triangles
    public static void main(String[] args) {
        int rows = 5; //How many rows I want
        for(int x = 1; x <= rows; ++x) { // x = 1; rows = x; Increase x by 1
           for(int y = 1; y <= x; ++y) { // y = 1; x = y; Increase y by 1
               System.out.print("#"); // Print the character '#'
           }
               System.out.println();

       }

         triangles2();   // call the other method
  }


 public static void triangles2() {    // this is not a main method
	 System.out.println();
	 System.out.print(" "); // indent the 2nd triangle
   // public static void main(String[] args) {
        int rows = 5;
        for(int x = 1; x <= rows; ++x) {
            for(int y = 1; y <= x; ++y) {
                System.out.print("#");
            }
            System.out.println();
            System.out.print(" ");
        }
    }
}
