class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) return image; //base case
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    private void dfs(int[][] image, int row, int col,int originalColor, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        if (row < 0 || row >= rows ||col < 0 || col >= cols ||image[row][col] != originalColor) return;
        image[row][col] = newColor;
        dfs(image, row - 1, col, originalColor, newColor);
        dfs(image, row + 1, col, originalColor, newColor);
        dfs(image, row, col - 1, originalColor, newColor);
        dfs(image, row, col + 1, originalColor, newColor);
    }
}