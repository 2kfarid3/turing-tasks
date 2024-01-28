package RandomNumbersGame;

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
        int[] YourDigit = new int[15];
        int count = 0;
        int MyNumber = in.nextInt();
        for (int i = 0; i < 1; i++) {
            while (MyNumber != array[i]) {
                YourDigit[count++] = MyNumber;
                if (MyNumber < array[i]) {
                    System.out.println("Your number is too small. Please, try again.");
                    MyNumber = in.nextInt();
                } else {
                    System.out.println("Your number is too big. Please, try again.");
                    MyNumber = in.nextInt();
                }
            }
        }
        System.out.print("Your numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(YourDigit[i] + " ");
        }
        System.out.println();
        System.out.println("Congratulations, {Farid}!");
    }
}

