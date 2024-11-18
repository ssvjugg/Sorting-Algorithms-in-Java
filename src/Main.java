import java.util.*;

public class Main {
    public static void main(String[] args) {

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
}