package az.edu.turing.demo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i > 0) {
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}
