//create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.

package challenges;

import java.util.Scanner;

public class Challenge65 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Exist to exist from the Loop");

    String keyWord = "Exist";
    
    while (true) {
      System.out.print("Type anything (Except Exist): ");
      String userInput = input.next();
      if (userInput.equals(keyWord)) {
        break;
      }
    }
    

    input.close();
  }
}
