class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        return countpath(m-1,n-1,dp);
        
    }
    private int countpath(int row, int col , int [][]dp){
        if(row==0 || col==0){
            return 1;
        }
        else if(dp[row][col]!=0){
            return dp[row][col];
        }
        dp[row][col]=countpath(row-1,col,dp)+countpath(row,col-1,dp);
        return dp[row][col];
    }
}