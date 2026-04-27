import java.util.HashSet;

public class LongestConsigativeSequence_128 {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLenght = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLenght = Math.max(maxLenght, currentLength);
            }
        }

        return maxLenght;
    }
}
