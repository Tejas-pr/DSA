import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/pacific-atlantic-water-flow/?envType=problem-list-v2&envId=oizxjoit

public class pacificAtlanticWaterFlow_417 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = heights.length; // row
        int n = heights[0].length; // col

        boolean[][] pacific = new boolean[m][n];      
        boolean[][] atlantic = new boolean[m][n];

        // DFS
        for(int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0);
            dfs(heights, atlantic, i, n-1);
        }

        for(int c = 0; c < n; c++) {
            dfs(heights, pacific, 0, c);
            dfs(heights, atlantic, m - 1, c);
        }

        for(int r = 0; r < m; r++) {
            for(int c = 0; c < n; c++) {
                if(pacific[r][c] && atlantic[r][c]) {
                    ans.add(Arrays.asList(r, c));
                }
            }
        }
        return ans;     
    }
    public void dfs(int[][] heights, boolean[][] visited, int r, int c) {
        if(visited[r][c]) return;
        visited[r][c] = true;

        int col = heights[0].length; // col
        int row = heights.length; // row

        int currentHeight = heights[r][c];

        // right
        if(c + 1 < col && heights[r][c + 1] >= currentHeight) {
            dfs(heights, visited, r, c + 1);
        }
        // left
        if(c - 1 >= 0 && heights[r][c - 1] >= currentHeight) {
            dfs(heights, visited, r, c - 1);
        }
        // up
        if(r - 1 >= 0 && heights[r - 1][c] >= currentHeight) {
            dfs(heights, visited, r - 1, c);
        }
        // down
        if(r + 1 < row && heights[r + 1][c] >= currentHeight) {
            dfs(heights, visited, r + 1, c);
        }
    }
}