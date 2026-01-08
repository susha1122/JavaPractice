//Create a program using continue to print only even numbers using continue for odd numbers.

package challenges;

import java.util.Scanner;

public class Challenge67 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Only Even Numbers.\n");

    int sum = 0;

    while (sum < 100) {
      System.out.print("Enter any Even Number: ");
      int num = input.nextInt();

      if (num % 2 != 0) {
        continue;
      } else {
        sum += num;
        System.out.println("Sum of Entered Even Number " + sum);
      }
    }

    input.close();
  }
}
