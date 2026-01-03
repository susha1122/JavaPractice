//Find the largest palindrome made from product of two numbers

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Start Numbers: ");
    int start = input.nextInt();

    System.out.print("Enter End Numbers: ");
    int end = input.nextInt();

    largestPalindrome(start, end);

    input.close();
  }

  public static void largestPalindrome(int start, int end){
    int num = start * end;
    int i = 1;
    int large = 0;
    System.out.println(num);
    while (i <= num) {
      int sum = 0;
      int j = i;
      while (j > 0) {
        int digit = j % 10;
        sum = sum * 10 + digit;
        j /= 10;
      }
      if (sum == i) {
        if (sum > large) {
          large = sum;
        }
      }
      i++;
    }
    System.out.println(large);
  }
}
