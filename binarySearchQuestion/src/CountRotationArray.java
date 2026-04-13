public class CountRotationArray {
    public static void main(String[] args) {
        int[] arr = { 88, 99, 3, 4, 5, 6, 7, 8, 9, 11 };
        System.out.println(CountRotation(arr));
    }

    // coountRotation.
    static int CountRotation(int[] arr) {
        int pivot = getPivot(arr);
        return pivot + 1;
    }
    // find the pivot
    static int getPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
