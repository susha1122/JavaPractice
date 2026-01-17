//28.Develop a program that prints the multiplication table for a given number.

package challenges;

import java.util.Scanner;

public class Challenge28 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication Table of the given Number.....");
        System.out.print("Enter a Number: ");
        int a = input.nextInt();
        table();
        input.close();
    }
    public static void table(){ //this method is for Multiplication Table of the given Number
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication Table of the given Number.....");
        System.out.print("Enter a Number: ");
        int a = input.nextInt();
        int i = 0;
        while (i <= 20) {
            int result = a * i;
            System.out.println(a + "x" + i + "=" + result);
            i++;
        }
        input.close();
    }

}
