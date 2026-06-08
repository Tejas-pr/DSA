import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack();
    }

    class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(candidates, 0, target, path, answer);
        return answer;
    }
    private void backtrack(int[] candidates, int index, int remaining, List<Integer> path, List<List<Integer>> answer) {
        if(remaining < 0) {
            return;
        }
        if(index == candidates.length) {
            return;
        }
        if(remaining == 0) {
            answer.add(new ArrayList<>(path));
            return;
        }
        path.add(candidates[index]);
        backtrack(candidates, index, remaining - candidates[index], path, answer);
        path.remove(path.size() - 1);
        backtrack(candidates, index + 1, remaining, path, answer);
    }
}
}