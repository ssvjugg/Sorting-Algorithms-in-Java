import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 1, 6, 9, 7, 8, 3, 2, 0};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Bubble Sort
     * - Time complexity:
     *   - Best case: O(n) — when the array is already sorted.
     *   - Average and worst cases: O(n^2) — when the array is sorted in reverse order or random order.
     * - Spatial complexity: O(1) — sorting is performed in-place, that is, it does not require additional time resources.
     * @param arr Integer Array
     */
    public static void bubbleSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            boolean isSorted = true;
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    /**
     * Selection Sort
     * @param arr Integer Array
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}