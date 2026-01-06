//Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations 
// like addition, subtraction, multiplication, and division.

package Challenges;

import java.util.Scanner;

public class Challenge58 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Simple Calculator\n");

    System.out.print("Enter any Number: ");
    int num1 = input.nextInt();

    System.out.print("Enter any Number: ");
    int num2 = input.nextInt();

    System.out.print("Enter the Operation (+ , - , * , /): ");
    String operator = input.next();

    int result = switch (operator) {
      case "+" -> num1 + num2;
      case "-" -> num1 - num2;
      case "*" -> num1 * num2;
      case "/" ->  num1 / num2;
      default -> 0;
    };

    System.out.println("The result of the given Calculation is " + result);

    input.close();
  }
}
