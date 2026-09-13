class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int total_sum=0;
        int min_sum=Integer.MAX_VALUE;
        int max_sum=Integer.MIN_VALUE;
        int cuurent_1=0;
        int cuurent_2=0;
        for(int i=0;i<nums.length;i++){
            cuurent_1+=nums[i];
            cuurent_2+=nums[i];
            max_sum=Math.max(max_sum,cuurent_1);
            min_sum=Math.min(min_sum,cuurent_2);
            if(cuurent_1<0){
                cuurent_1=0;
            }
            if(cuurent_2>0){
                cuurent_2=0;
            }

        }
        return Math.max(Math.abs(max_sum),Math.abs(min_sum));
    }
}