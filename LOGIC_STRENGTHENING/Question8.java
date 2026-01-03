//Print all palindromic numbers in a given range

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start Number: ");
        int num = input.nextInt();

        System.out.print("Enter end Number: ");
        int end = input.nextInt();

        palindromicNumber(num, end);

        input.close();
    }

    public static void palindromicNumber(int num, int end){
        int i = num;
        while (i <= end) {
            int sum = 0;
            int j = i;
            while (j > 0) {
                int digit = j % 10;
                sum = sum * 10 + digit;
                j /= 10;
            }
            if (i == sum) {
                System.out.println("Palindrome - " + sum);
            }
            i++;
        }
    }
}

//start = 100
//end = 200
//  int sum = 0;
//  i = 100;
//while(i < end){
//  int j = i;
//  while(100 > 0)
//  int digit = num % 10;
//  sum = sum * 10 + digit;
//  j /= 10;
//}