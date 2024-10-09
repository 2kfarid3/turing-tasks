package az.edu.turing.Sortings.bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 7, 9, 1, 0, 6};

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

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

