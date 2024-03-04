package az.edu.turing.turing_tasks;

import java.util.Scanner;

public class DoubleLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(word.length() * 2);
    }
}
