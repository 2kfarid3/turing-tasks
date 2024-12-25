package az.edu.turing.Sortings.insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {99, 13, 8, 25, 7};
        int key, j;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int iterate : arr) {
            System.out.print(iterate + " ");
        }
    }
}

