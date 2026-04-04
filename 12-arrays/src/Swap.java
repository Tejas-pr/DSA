import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7};
        swapArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
