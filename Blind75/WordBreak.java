import java.util.List;

class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        Boolean[] memo = new Boolean[s.length()];
        System.out.println(breaker(0, s, wordDict, memo));
    }

    // this is not good solution need to use the DP.
    public static boolean breaker(int start, String s, List<String> wordDict) {
        if (start == s.length()) {
            return true;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String current = s.substring(start, end);

            if (wordDict.contains(current)) {
                if (breaker(end, s, wordDict)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean breaker(int start, String s, List<String> wordDict, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }

        if (memo[start] != null) {
            return memo[start];
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String current = s.substring(start, end);

            if (wordDict.contains(current)) {
                if (breaker(end, s, wordDict, memo)) {
                    memo[start] = true;
                    return true;
                }
            }
        }
        memo[start] = false;
        return false;
    }
}
