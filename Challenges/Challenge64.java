//Create a program using for-each to the occurrences of a specific element in an array.

package challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge64 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Occurences of a specific eleement\n");
    
    System.out.print("Enter the length of numbers: ");
    int size = input.nextInt();

    int[] element = new int[size];

    for (int i = 0; i < element.length; i++) {
      System.out.printf("Enter %d element: ", i+1);
      element[i] = input.nextInt();
    }

    System.out.println(Arrays.toString(element));

    System.out.print("which Number you want search occurrence? : ");
    int target = input.nextInt();

    int count = 0;

    for (int occur : element) {
      if (occur == target) {
        count++;
      };
    }

    System.out.println("The count of the number is " + count);

    input.close();
  }
}
