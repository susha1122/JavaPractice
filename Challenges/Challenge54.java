//Create a program to find if the given number is even or odd
package challenges;

import java.util.Scanner;

public class Challenge54 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Finding the given number is Odd or Even\n");

    System.out.print("Enter any number: ");
    int num = input.nextInt();

    String oddEven = num % 2 == 0 ? "Even" : "Odd";
    
    System.out.println("The given number is " + oddEven);

    input.close();
  }
}
