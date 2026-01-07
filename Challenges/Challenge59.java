//Create a program using do-while to find password checker until a valid password is entered.

package challenges;

import java.util.Scanner;

public class Challenge59 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Password Checker");

    String password;

    do {
      System.out.print("Enter Your Password");
      password = input.next();
    } while (!isPasswordChecked(password));
    System.out.println("Your passworrd is valid");
  }

  public static boolean isPasswordChecked(String password){
    return password.length() > 6;
  }
}
