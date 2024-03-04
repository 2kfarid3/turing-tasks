package az.edu.turing.turing_tasks;

import java.util.Scanner;

public class SimpleDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print("Simple Divisors: ");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //Simple Divisors
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Complex Divisors
   /* public static boolean isComplex(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }*/
}

