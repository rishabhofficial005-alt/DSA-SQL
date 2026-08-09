class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int preffixsum[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                preffixsum[i][j]=mat[i-1][j-1]+
                                 preffixsum[i-1][j]+
                                 preffixsum[i][j-1]-
                                 preffixsum[i-1][j-1];
            }
        }
        int answer[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int r1=Math.max(0,i-k);
                int c1=Math.max(0,j-k);
                int r2=Math.min(m-1,i+k);
                int c2=Math.min(n-1,j+k);
                r1++;
                c1++;
                r2++;
                c2++;
                answer[i][j]=preffixsum[r2][c2]-
                             preffixsum[r1-1][c2]
                             -preffixsum[r2][c1-1]
                             +preffixsum[r1-1][c1-1];
            }
        }
        return answer;
    }
}