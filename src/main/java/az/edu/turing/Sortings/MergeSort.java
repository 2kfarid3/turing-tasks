package az.edu.turing.Sortings;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sol yarıyı sıralar
            mergeSort(arr, left, mid);
            // Sağ yarıyı sıralar
            mergeSort(arr, mid + 1, right);

            // İki yarıyı birleştir
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        System.out.println("Birleştiriliyor: ");
        System.out.print("Sol: ");
        for (int i : leftArray) {
            System.out.print(i + " ");
        }
        System.out.print(" | Sağ: ");
        for (int j : rightArray) {
            System.out.print(j + " ");
        }
        System.out.println();

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        System.out.print("Birleştirilmiş dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {99, 13, 8, 25, 7};

        System.out.println("Sıralamadan önce:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sıralamadan sonra:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

