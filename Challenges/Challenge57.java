//Create a program to print the month of the year based on a number (1-12) input by the user.


package Challenges;

import java.util.Scanner;

public class Challenge57 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Printing Month of the Year Based On the Number\n");

    System.out.print("Enter the Month of the Number: ");
    int num = input.nextInt();

    String month = switch (num) {
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";
      default -> "Invalid";
    };

    System.out.println("The month of the year based on a number is " + month);

    input.close();
  }
}
