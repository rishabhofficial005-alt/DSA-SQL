class Solution {
    public int diagonalSum(int[][] mat) {
        int total_sum=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    total_sum+=mat[i][j];
                }
                else if(j==n-i-1){
                    total_sum+=mat[i][j];
                }
            }
        }
        return total_sum;
    }
}