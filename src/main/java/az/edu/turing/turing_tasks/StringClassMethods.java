package az.edu.turing.turing_tasks;

import java.util.Scanner;

public class StringClassMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
        String name = getName(b);
        assert name != null;
        int nameLength = getNameLength(name);
        System.out.println(name);
        System.out.println(nameLength);
    }

    public static String getName(String input) {
        int atIndex = input.indexOf("@");
        if (atIndex != -1) {
            return input.substring(0, atIndex);
        } else {
            System.out.println("Invalid input!");
            return null;
        }
    }

    public static int getNameLength(String name) {
        return name.length();
    }
}
