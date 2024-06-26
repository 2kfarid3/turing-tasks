package az.edu.turing.turing_tasks;

public class BubbleSort {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(int[] arr) {
        System.out.print("Sorted Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1, 5};
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        bs.printArray(arr);
    }
}

