package az.edu.turing.turing_tasks;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Pls enter a valid password!");
            String test = in.next();

            if (test.length() > 7 && test.matches("[a-zA-Z0-9]+") && minContain(test)) {
                System.out.println("Password is valid: " + test);
                break;
            } else {
                System.out.println("Password is not valid. Pls enter a valid password!");
            }
        }
    }

    public static boolean minContain(String test) {
        int count = 0;
        for (char c : test.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        if (count < 2) {
            System.out.println("Password must contain at least 2 digits!");
            return false;
        }

        return true;
    }
}
