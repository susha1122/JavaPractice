//53. Create a program to find the minimum of two numbers.

package Challenges;

import java.util.Scanner;

public class Challenge53 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Finding the Minimum of Two Numbers\n");

    System.out.print("Enter Number 1: ");
    int num1 = input.nextInt();

    System.out.print("Enter Number 2: ");
    int num2 = input.nextInt();

    Challenge53 ternary = new Challenge53();
    int miniChecker = ternary.minimumChecker(num1, num2);
    System.out.println("The minimum number is " + miniChecker);

    input.close();
  }

  public int minimumChecker(int num1, int num2){

    return num1 < num2 ? num1: num2;

  }
}
