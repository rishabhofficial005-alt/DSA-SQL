class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        return countpaths(m-1,n-1,dp);
    }
    public int countpaths(int rows,int cols,int [][]dp){
        if(rows==0 || cols==0){
            return 1;
        }
        else if(dp[rows][cols]!=0){
            return dp[rows][cols];
        }
        dp[rows][cols]=countpaths(rows-1,cols,dp)+ countpaths(rows,cols-1,dp);
        return dp[rows][cols];

    }
}