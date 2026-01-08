//Create a program using recursion to display the Fibonacci series upto a certain number.

package challenges;

import java.util.Scanner;

public class Challenge68 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Fibonacci Series\n");

    System.out.print("Enter any Number: ");
    long num = input.nextLong();

    for (int i = 0; i < num; i++){
      System.out.print(fibonacciSeries(i) + " ");
    }

    input.close();
  }

  public static long fibonacciSeries(long num){
    if (num == 0) return 0;
    if (num == 1) return 1;
    return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
  }
}
