
// https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=oizxjoit

public class MissingNumber_268 {
    public static void main(String[] args) {
        
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int acutalSum = 0;
        for(int i=0;i<nums.length;i++) {
            acutalSum += nums[i];
        }
        return (n * (n + 1) / 2) - acutalSum;
    }
}
