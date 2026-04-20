import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    // TC: worst - O(N^2), best - O(N^2)
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxEle = getMaxIndex(arr, 0, end);
            // get the max and swap to the last index.
            swap(arr, maxEle, end);
        }
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
