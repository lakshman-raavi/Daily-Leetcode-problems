class Solution {
    public int backtrack(int i, int j, int[][] grid,
                         int n, int m, boolean[][] visited) {

        if (i < 0 || j < 0 || i >= n || j >= m ||
            grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;

        int gold = grid[i][j];

        int up = backtrack(i - 1, j, grid, n, m, visited);
        int left = backtrack(i, j - 1, grid, n, m, visited);
        int right = backtrack(i, j + 1, grid, n, m, visited);
        int bottom = backtrack(i + 1, j, grid, n, m, visited);

        visited[i][j] = false;

        return gold + Math.max(Math.max(up, left),
                               Math.max(right, bottom));
    }

    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max,
                        backtrack(i, j, grid, n, m, visited));
                }
            }
        }

        return max;
    }
}
