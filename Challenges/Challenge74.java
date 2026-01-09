//Create a number guessing game where the program selects a random number, and the user has to guess it.

package challenges;

import java.util.Scanner;

public class Challenge74 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int userGuess;

    int guessing = (int)(Math.random() * 100) + 1;

    do {
      System.out.print("Enter the Number (1 to 100): ");
      userGuess = input.nextInt();
      if (userGuess > guessing) {
        System.out.println("Too High");
      } else if (userGuess == guessing) {
        System.out.println("Yes! You got it.");
      } else if (userGuess < guessing) {
        System.out.println("Too Low");
      }
    } while (userGuess != guessing);

    input.close();
  }
}
