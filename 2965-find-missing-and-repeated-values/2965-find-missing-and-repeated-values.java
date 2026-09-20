class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int repeated_element=0;
        HashSet<Integer> set=new HashSet<>();
        int total_sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    repeated_element=grid[i][j];
                }
                set.add(grid[i][j]);
                total_sum+=grid[i][j];

            }
        }
        int k=m*m ;
        long actual_sum=(k*(k+1))/2;
        int missing_element=(int) actual_sum-(total_sum-repeated_element);
        return new int[] {repeated_element,missing_element};
    }
}