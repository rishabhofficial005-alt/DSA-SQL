class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count_1=0;
        int max_count=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count_1=0;
            }
            else{
                count_1++;
            }
            max_count=Math.max(max_count,count_1);

        }
        return max_count;
    }
}