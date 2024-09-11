package az.edu.turing.turing_tasks;

import java.util.Random;

public class MiddleCharacter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();

        System.out.println("Random number -> " + number);

        String middleCharacter = Integer.toString(Math.abs(number));

        if (middleCharacter.length() == 1) {
            System.out.println("Single digit number -> " + middleCharacter);
        } else {
            while (middleCharacter.length() > 2) {
                middleCharacter = middleCharacter.substring(1, middleCharacter.length() - 1);
            }

            if (middleCharacter.length() == 2) {
                System.out.println("Middle characters -> " + middleCharacter);
            } else {
                System.out.println("Middle character -> " + middleCharacter);
            }
        }
    }
}
