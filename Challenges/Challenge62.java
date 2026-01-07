//Create a program using for to display if a number is prime or not.

package challenges;

import java.util.Scanner;

public class Challenge62 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Prime Number Checker \n");

    System.out.print("Enter any Number ");
    int num = input.nextInt();

    boolean isPrimeNumber = isPrime(num);

    if (isPrimeNumber) {
      System.out.println("Your Number is a Prime Number...");
    } else {
      System.out.println("Your Number is not a Prime Number...");
    }

    input.close();
  }

  public static boolean isPrime(int num){
    if (num <= 1) return false;

    if (num <= 3) return true;

    if (num %2 == 0 || num %3 == 0) {
      return true;
    }

    for (int i = 5; i * i <= num; i += 6){
      if (num % i == 0 || num % (i+2) == 0){
        return false;
      }
    }
    return true;
  }
}
