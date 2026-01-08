//Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.

package challenges;

import java.util.Scanner;

public class Challenge66 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Positive Numbers Only\n");

    int sum = 0;

    while (sum < 100) {
      System.out.print("Enter any Positive Numbers: ");
      int num = input.nextInt();
      if (num < 0) {
        continue;
      } else {
        sum += num;
        System.out.println("Your Entered Number is " + sum);
      }
    }

    input.close();
  }
}
