class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int c=cols-1;
        int r=0;
        while(r<rows && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return false;

    }
}