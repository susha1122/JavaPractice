//Check whether a number is a Harshad (Niven) Number

package LOGIC_STRENGTHENING;

import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = input.nextInt();

        boolean isHarshad = isHarshad(num);
        if (isHarshad) {
            System.out.println("The given number is Harshad Number.");
        } else {
            System.out.println("The given number is Not Harshad Number.");
        }

        input.close();
    }

    public static boolean isHarshad(int num){
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum = sum + (temp % 10);
            temp /= 10;
        }

        if (num % sum == 0){
            return true;
        } else {
            return false;
        }
    }
}