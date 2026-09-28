class Solution {
    int m,n;
    int[][] dp;

    public int uniquePaths(int m, int n) {
        this.m=m;
        this.n=n;
        this.dp=new int[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                dp[i][j] = -1;
            }
        }

        return paths(0,0);
    }

    public int paths(int i,int j ) {
        if(i==m-1 && j==n-1) {
            return 1;
        }

        if(i>=m || j>=n) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int tmp = paths(i+1,j) + paths(i,j+1);
        dp[i][j] = tmp;

        return tmp;
    }
}