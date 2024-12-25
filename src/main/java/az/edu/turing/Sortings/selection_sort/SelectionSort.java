package az.edu.turing.Sortings.selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {99, 13, 8, 25, 7};
        int temp, key;

        for (int i = 0; i < arr.length - 1; i++) {
            key = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[key] > arr[j]) {
                    key = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }

        for (int iterate : arr) {
            System.out.print(iterate + " ");
        }
    }
}
