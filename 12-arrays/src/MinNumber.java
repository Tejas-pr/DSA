public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {44, 55, 2, 5, 10, 1, -17};
        int ans = minMuber(arr);
        System.out.println(ans);
    }

    static int minMuber(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
