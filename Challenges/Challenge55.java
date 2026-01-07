//Create a program to calculate the absolute value of a given integer.


package challenges;

import java.util.Scanner;

public class Challenge55 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Calculate the absolute of the Intege\nr");

    System.out.print("Enter any number: ");
    int num = input.nextInt();

    int result = num >= 0 ? num : -num;
    System.out.println("The absolute Value of the Given Number is " + result);

    input.close();
  }
}
