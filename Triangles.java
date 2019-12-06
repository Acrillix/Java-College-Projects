//Creating Two Triangles Patterns
//Issue: Calls two main methods, does not call second class Triangles2
//Does successfully print one triangle

public class Triangles { //Class name is Triangles
    public static void main(String[] args) { 
        int rows = 5; //How many rows I want 
        for(int x = 1; x <= rows; ++x) { // x = 1; rows = x; Increase x by 1
            for(int y = 1; y <= x; ++y) { // y = 1; x = y; Increase y by 1
                System.out.print("# "); // Print the character '#'
            }
            System.out.println("\n \t ");
        }
    }
}

 class Triangles2 {
    public static void main(String[] args) {
        int rows = 5;
        for(int x = 1; x <= rows; ++x) {
            for(int y = 1; y <= x; ++y) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
