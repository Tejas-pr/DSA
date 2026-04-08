public class CielingNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 55, 66, 78, 99 };
        int target = 7;
        int ans = cielingNumber(arr, target);
        System.out.println(ans);
    }

    static int cielingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
