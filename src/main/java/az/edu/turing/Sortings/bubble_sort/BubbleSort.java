package az.edu.turing.Sortings.bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {99, 13, 8, 25, 7};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int iterate : arr) {
            System.out.print(iterate + " ");
        }
    }
}

