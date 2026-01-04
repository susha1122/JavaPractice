//Find count of numbers with unique digits in a range

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter start Number: ");
    int start = input.nextInt();

    System.out.print("Enter end Number: ");
    int end = input.nextInt();

    uniqueDigits(start, end);

    input.close();
  }

  public static void uniqueDigits(int start, int end){
    int i = start;
    int count = 0;
    while (i <= end) {
      int j = i;
      int First = 0;
      int Second = 0;
      while (j > 0) {
        int digit = j % 10;
        First = digit;
        if (First != Second) {
          Second = First;
        } else {
          Second = First;
        }
        j /= 10;
      }
      i++;
    }
    System.out.println(count);
  }
}
