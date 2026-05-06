import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        
    }
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLenght = 0;

        for(int right=0;right<s.length();right++) {
            char currentChart = s.charAt(right);
            if(map.containsKey(currentChart)) {
                left = Math.max(left, map.get(currentChart) + 1);
            }
            map.put(currentChart, right);
            maxLenght = Math.max(maxLenght, right - left + 1);
        }

        return maxLenght;
    }
    public int lengthOfLongestSubstring2(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right=0;right<s.length()-1;right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
