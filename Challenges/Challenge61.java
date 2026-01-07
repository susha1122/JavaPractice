//Create a program using for loop multiplication table for a number.

package challenges;

import java.util.Scanner;

public class Challenge61 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Multiplication table of a Number");

    System.out.print("Enter any Number: ");
    int num = input.nextInt();

    multiplyTable(num);

    input.close();
  }

  public static void multiplyTable(int num){
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = i * num;
      System.out.printf("%d * %d = %d\n", i, num, sum);
    }
  }
}
