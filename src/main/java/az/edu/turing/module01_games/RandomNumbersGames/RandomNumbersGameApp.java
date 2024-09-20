package az.edu.turing.module01_games.RandomNumbersGames;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbersGameApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(101);
        System.out.println(randomNumber);

        int[] yourDigit = new int[100];
        int count = 0;
        System.out.println("Let the game begin!...Pls enter a number only between 1 and 100");
        int MyNumber;

        while (true) {
            try {
                int temp = in.nextInt();
                if (temp < 1 || temp > 100) {
                    System.out.println("Please enter a valid number!");
                } else {
                    MyNumber = temp;
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                in.next();
            }
        }

        while (MyNumber != randomNumber) {
            try {
                yourDigit[count++] = MyNumber;
                if (MyNumber < randomNumber) {
                    System.out.println("Your number is too small. Please, try again.");
                } else {
                    System.out.println("Your number is too big. Please, try again.");
                }
                MyNumber = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                in.next();
                MyNumber = in.nextInt();
            }
        }

        System.out.println("You win!...Right number is " + MyNumber);
        System.out.print("Your numbers: ");
        Arrays.sort(yourDigit, 0, count);

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(yourDigit[i] + " ");
        }

        System.out.println();
        System.out.println("Congratulations, {Farid}!");
    }
}

