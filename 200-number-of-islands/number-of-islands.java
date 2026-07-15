class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(i, j, grid, visited);
                    ans++;
                }
            }
        }
        return ans;
    }
    void dfs(int row, int col, char[][] grid, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (row < 0 || row >= rows || col < 0 || col >= cols ||grid[row][col] == '0' ||visited[row][col]) return;
        visited[row][col] = true;
        dfs(row - 1, col, grid, visited);
        dfs(row + 1, col, grid, visited);
        dfs(row, col - 1, grid, visited);
        dfs(row, col + 1, grid, visited);
    }
}