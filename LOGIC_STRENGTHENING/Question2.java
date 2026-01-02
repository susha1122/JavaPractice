//Find the sum of factorials of digits of a number

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = input.nextInt();

        isFactorial(num);

        input.close();
    }

    public static void isFactorial(int num){
        int sum = num;
        while (num > 1) {
            sum = sum * (--num);
        }

        int sumOfFactrial = 0;
        while (sum > 0) {
            sumOfFactrial = sumOfFactrial + (sum % 10);
            sum /= 10;
        }

        System.out.println(sumOfFactrial);
    }
}

//4 = 4*3*2*1 = 24