package RandomNumbersGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbersGameApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[1];
        System.out.println("Let the game begin!");
        for (int i = 0; i < 1; i++) {
            array[i] = random.nextInt(101);
        }
        int[] yourDigit = new int[15];
        int count = 0;
        int MyNumber = in.nextInt();
        for (int i = 0; i < 1; i++) {
            while (MyNumber != array[i]) {
                yourDigit[count++] = MyNumber;
                if (MyNumber < array[i]) {
                    System.out.println("Your number is too small. Please, try again.");
                } else {
                    System.out.println("Your number is too big. Please, try again.");
                }
                MyNumber = in.nextInt();
            }
        }
        System.out.print("Your numbers: ");
        Arrays.sort(yourDigit, 0, count);
        for (int i = 0; i < count; i++) {
            System.out.print(yourDigit[i] + " ");
        }
        System.out.println();
        System.out.println("Congratulations, {Farid}!");
    }
}

