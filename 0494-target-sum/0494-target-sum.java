class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int ans=possiblesubset(0,0,nums,target);
        return ans;
        
    }
    private int possiblesubset(int index,int sum,int[] nums,int target){
        if(index==nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        int pick=possiblesubset(index+1,sum+nums[index],nums,target);
        int notpick=possiblesubset(index+1,sum-nums[index],nums,target);
        return pick+notpick;
        
    }
}