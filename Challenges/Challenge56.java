//Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator 
// (e.g., High for scores > 80, Moderate for 50-80, Low for < 50).

package Challenges;

import java.util.Scanner;

public class Challenge56 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Calculate the Students Score\n");

    System.out.print("Enter Your Score: ");
    int score = input.nextInt();

    String result = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");
    System.out.println("The category of the given score is " + result);

    input.close();
  }
}
