package az.edu.turing.Sortings.insertion_sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }

        Arrays.sort(arr);

        System.out.print("Sorted Array: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();
        boolean repeated = false;
        Set<Integer> printedNumbers = new HashSet<>();

        System.out.print("Repeated numbers: ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !printedNumbers.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                printedNumbers.add(arr[i]);
                repeated = true;
            }
        }

        System.out.println();

        if (!repeated) {
            System.out.print("No repeated number has!");
        }
    }
}
