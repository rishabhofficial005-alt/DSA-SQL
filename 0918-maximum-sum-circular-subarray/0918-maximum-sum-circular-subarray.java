class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int currentmaxsum=0;
        int currentminsum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int total=0;
        for(int i=0;i<nums.length;i++){
            currentmaxsum+=nums[i];
            currentminsum+=nums[i];
            maxsum=Math.max(currentmaxsum,maxsum);
            minsum=Math.min(currentminsum,minsum);
            if(currentmaxsum<0){
                currentmaxsum=0;
            }
            if(currentminsum>0){
                currentminsum=0;
            }
            total+=nums[i];
        }
        if(maxsum<0){
            return maxsum;
        }
     return Math.max(maxsum,total-minsum);
    }
}