public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {2,4,5,6, 55, 66, 78, 99}
        int[] arr = {99, 89, 78, 69, 55, 45,37, 27, 19, 9, 0};
        int target = 19;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        boolean isAsc = arr[s] < arr[e];

        while(s <= e) {
            int mid = s + (e - s) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return -1;
    }
}
