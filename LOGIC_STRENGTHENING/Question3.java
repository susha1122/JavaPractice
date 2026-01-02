//Find digital root of a number

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = input.nextInt();

        digitRoot(num);

        input.close();
    }

    public static void digitRoot(int num){
        System.out.println("Without using Loop (O(1) Constant Time)");
        if (num == 0) {
            System.out.println(0);
        } else {
            // The formula: 1 + (n - 1) % 9
            System.out.println(1 + (num - 1) % 9);
        }

        System.out.println("Using Loop");
        while (num >= 10) { 
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; 
        }
        System.out.println(num);
    }
}

//12345 = num
//1+2+3+4+5=15
//1+5=6 (The digital root)
//n < 10 - exit