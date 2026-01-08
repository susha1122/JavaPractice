//Create a program using recursion to check if a string is a palindrome using recursion.

package challenges;

import java.util.Scanner;

public class Challenge69 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Palindrome\n");

    System.out.print("Enter anything: ");
    String userInput = input.next();

    int left = 0;
    int right = userInput.length() - 1;

    boolean isPalindromes = isPalindrome(userInput, left, right);
    if (isPalindromes) {
      System.out.println("The given string is Palindrome");
    } else {
      System.out.println("The given string is not Palindrome");
    }

    input.close();
  }

  public static boolean isPalindrome (String userInput, int left, int right) {
    if (left >= right) {
      return true;
    }
    if (userInput.charAt(left) != userInput.charAt(right)){
      return false;
    }
    return isPalindrome(userInput, left+1, right-1);
  }
}
