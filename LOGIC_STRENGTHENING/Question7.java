//Check if a number can be expressed as sum of two primes

package LOGIC_STRENGTHENING;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = input.nextInt();

        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        isSumPrime(num);

        input.close();
    }

    public static void isSumPrime(int num){
        int i = 2;
        while (i <= num/2) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                int half = num - i;
                if (isPrime(half)) {
                    System.out.println("The number can be expressed as sum of two primes");
                    return;
                }
            }
            i++;
        }
        System.out.println("The number can not be expressed as sum of two primes");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i = i + 6;
        }
        return true;
    }
}

//7 = 2 + 5
//7 = 5 + 2
//7-2 = 5
//