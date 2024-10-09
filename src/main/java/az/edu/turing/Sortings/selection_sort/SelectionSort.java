package az.edu.turing.Sortings.selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 9};

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
