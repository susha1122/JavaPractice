//Create a program that shows use of left shift operator.

package challenges;

import java.util.Scanner;

public class Challenge25 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise Left Shift Operator\n");

        //input
        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();

        //logic
        int result = a << b;

        //print statement
        System.out.println("The Result is: " + result);

        input.close();
    }
}
