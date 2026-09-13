class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int one_count=0;
        int n=nums.length;
        int max_count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                one_count=0;
            }
            else{
                one_count++;
            }
            max_count=Math.max(max_count,one_count);
        }
        return max_count;
        
    }
}