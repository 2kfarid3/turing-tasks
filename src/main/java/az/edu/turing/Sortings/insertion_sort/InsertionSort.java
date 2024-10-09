package az.edu.turing.Sortings.insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 9};

        int temp;
        for (int i = 1; i < arr.length; i++) {
            int key = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[key] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[key];
                    arr[key] = temp;
                }
            }
        }
    }
}
