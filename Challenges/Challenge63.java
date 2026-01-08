//Create a program using for-each to find the maximum value in an integer array.

package challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge63 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Maximum Value\n");

    System.out.print("Enter the length of numbers: ");
    int size = input.nextInt();

    int[] element = new int[size];

    for (int i = 0; i < element.length; i++) {
      System.out.printf("Enter %d element: ", i+1);
      element[i] = input.nextInt();
    }

    System.out.println(Arrays.toString(element));

    maximumValue(element);

    input.close();
  }

  public static void maximumValue(int[] element){
    int maximum = 0;
    for (int i = 0; i < element.length; i++){
      if (maximum < element[i]) {
        maximum = element[i];
      }
    }
    System.out.println(maximum);
  }
}
