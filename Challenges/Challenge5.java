//Create a program to input name of the person and respond with "Welcome NAME to KG Coding"

package challenges;

import java.util.Scanner;

public class Challenge5 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter your name: ");
        String name = input.next();
        System.out.printf("%s, Welcome to KG Coding", name);
    }
}
