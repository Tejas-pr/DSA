public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {3, 4, 34, 6, 7};
        System.out.println(max(arr));
        System.out.println(max(arr, 2, 4));
    }

    private static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    private static int max(int[] arr, int index1, int index2) {
        int maxVal = arr[0];
        for (int i = index1; i < index2; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
