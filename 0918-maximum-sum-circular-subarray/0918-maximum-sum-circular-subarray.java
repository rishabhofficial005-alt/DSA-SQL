class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        int total_sum=0;
        int current_sum_1=0;
        int current_sum_2=0;
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];

        }
        for(int i=0;i<nums.length;i++){
            current_sum_1+=nums[i];
            current_sum_2+=nums[i];
            max_sum=Math.max(max_sum,current_sum_1);
            min_sum=Math.min(min_sum,current_sum_2);
            if(current_sum_1<0){
                current_sum_1=0;
            }
            if(current_sum_2>0){
                current_sum_2=0;
            }
        }
        if (max_sum < 0) {
            return max_sum;
        }
        return Math.max(max_sum,total_sum-min_sum);
        
    }
}