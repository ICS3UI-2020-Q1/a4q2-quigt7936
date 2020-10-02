import java.util.Scanner;
/**
 * Asks user to enter postive int to continue and a negative int to end
 * @author Thomas Quigley
 */
public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //declare users number
    int userNumber;

    do {
      // ask the user for a number
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      userNumber = input.nextInt();

      // if number is negative end, if not continue
    } while (userNumber >= 0);
   
    // tell the user the program is done
    System.out.println("All done!");
    

    
    
  }
}
