package az.edu.turing.AddRandomNumbers;

import java.util.Arrays;
import java.util.Random;

public class AddRandomNumbersApp {
    public static void main(String[] args) {
        Random random = new Random();
        int[] yourDigits = new int[10];
        int count = 10;

        for (int i = 0; i < 10; i++) {
            int MyNumber = random.nextInt(101);
            yourDigits[i] = MyNumber;
            System.out.print(yourDigits[i] + " ");
        }

        System.out.println();

        System.out.print("Your numbers: ");
        Arrays.sort(yourDigits, 0, count);
        for (int i = 0; i < count; i++) {
            System.out.print(yourDigits[i] + " ");
        }
        System.out.println();
    }
}
