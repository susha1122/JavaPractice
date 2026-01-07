//60. Create a program using do-while to implement a number guessing game.

package challenges;

import java.util.Random;
import java.util.Scanner;

public class Challenge60 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Number Guessing Game\n");

    Random random = new Random();

    int randomNumber = random.nextInt(100);

    int guess;

    do {
      System.out.print("Enter guessed Number: ");
      guess = input.nextInt();

      if (guess > randomNumber) {
        System.out.println("lower");
      } else {
        System.out.println("higher");
      }
    } while (guess != randomNumber);

    System.out.println("completed, matched");
  }
}
