class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int current_sum1=0;
        int current_sum2=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            current_sum1+=nums[i];
            current_sum2+=nums[i];
            max_sum=Math.max(current_sum1,max_sum);
            min_sum=Math.min(current_sum2,min_sum);
            if(current_sum1<0) current_sum1=0;
            if(current_sum2>0) current_sum2=0;
            

        }
        return Math.max(Math.abs(max_sum),Math.abs(min_sum));
    }
}