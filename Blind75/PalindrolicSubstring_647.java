
public class PalindrolicSubstring_647 {
    public static void main(String[] args) {
        
    }
    public int countSubstrings(String s) {
        int finalCount = 0;
        for(int i=0; i < s.length(); i++) {
            int oddCount = expand(s, i, i);
            int evenCount = expand(s, i, i+ 1);
            finalCount += (oddCount + evenCount);
        }
        return finalCount;
    }
    int expand(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}