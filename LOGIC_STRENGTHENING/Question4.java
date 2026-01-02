//Convert a decimal number to binary (without built-in methods)

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = input.nextInt();

        decimalBinary(num);

        input.close();
    }

    public static void decimalBinary(int num){
        int binary = 0;
        int place = 1;
        while (num > 0) {
            int rem = num % 2; 
            binary = rem * place + binary;
            place *= 10;
            num /= 2; 
        }

        System.out.println(binary);
    }
}
