//Convert binary to decimal

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Binary Number: ");
        int num = input.nextInt();

        binaryDecimal(num);

        input.close();
    }

    public static void binaryDecimal(int num){
        int i = 0;
        int decimal = 0;
        while (num > 0) {
            int digit = num % 10;
            decimal = decimal + (digit * (int)Math.pow(2, i));
            i++;
            num /= 10;
        }
        System.out.println(decimal); 
    }
}
