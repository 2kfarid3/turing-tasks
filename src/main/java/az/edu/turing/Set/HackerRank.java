package az.edu.turing.Set;

import java.util.HashSet;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = Integer.parseInt(in.nextLine());
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextLine();
        }

        HashSet<String> names = new HashSet<>();
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (!names.contains(arr[i])) {
                names.add(arr[i]);
                count++;
            }
            System.out.println(count);
        }
    }
}
