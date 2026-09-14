class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive_index=0;
        int negative_index=1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[positive_index]=nums[i];
                positive_index+=2;
            }
            else{
                ans[negative_index]=nums[i];
                negative_index+=2;

            }
        }
        return ans;
    }
}