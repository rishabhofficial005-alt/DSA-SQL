class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int possum=0;
        int negsum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            possum+=nums[i];
            negsum+=nums[i];
            maxsum=Math.max(possum,maxsum);
            minsum=Math.min(negsum,minsum);
            if(possum<0){
                possum=0;
            }
            if(negsum>0){
                negsum=0;
            }
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}