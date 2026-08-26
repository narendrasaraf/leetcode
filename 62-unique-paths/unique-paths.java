class Solution {
    // Tabulation
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if(i==0 && j==0) continue;
                int up=0;
                int down=0;
                if(i>0) up=dp[i-1][j];
                if(j>0) down=dp[i][j-1];
                dp[i][j]=up+down;
            }
        }
        return dp[m-1][n-1];
    }

    // Memoization

    // int [][]dp;
    // public int uniquePaths(int m, int n) {
    //     dp=new int [m][n];
    //     for(int[]row:dp) Arrays.fill(row,-1);
    //     return solve(m-1,n-1);
    // }
    // int solve(int i,int j) {
    //     if(i==0 && j==0) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int up=solve(i,j-1);
    //     int down=solve(i-1,j);
    //     return dp[i][j]=up+down;
    // }
}