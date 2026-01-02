//Count trailing zeros in a factorial

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = input.nextInt();

        trailingCount(num);

        input.close();
    }

    public static void trailingCount(int num){
        long factorial = num;
        while (num > 1) {
            factorial = factorial * --num;
        }
        System.out.println(factorial);
        int trailing = 0;
        while (factorial > 0) {
            long digit = factorial % 10;
            
            if (digit == 0) {
                trailing += 1;
            } else {
                break;
            }
            factorial /= 10;
        }
        System.out.println(trailing);
    }
}

//5! = 5 × 4 × 3 × 2 × 1 = 120