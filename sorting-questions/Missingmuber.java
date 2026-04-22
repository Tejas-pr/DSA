public class Missingmuber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
