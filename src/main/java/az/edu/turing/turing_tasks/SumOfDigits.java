package az.edu.turing.turing_tasks;

import java.util.Random;

public class SumOfDigits {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(1001);

        if (a == 0) {
            System.out.println("Sum of digit is " + a);
        }

        int sum = 0;
        int temp;

        System.out.println("Your random number is " + a);
        while (a != 0) {
            temp = a % 10;
            sum += temp;
            a /= 10;
        }

        System.out.println("Sum of digits are " + sum);
    }
}
