package MenuApp;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int number = 5; // Örnek olarak 5'in faktöriyelini hesaplayalım
        long factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }

    public static long factorial(long n) {
        long constant = 1;
        long number = 1;
        for (long i = n; i >= 1; i--) {
            n = n * (n-constant);
            n = number;
        }

        return number;
    }

}
