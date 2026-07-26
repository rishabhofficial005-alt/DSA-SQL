class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        long windsum=0;
        long maxsum=0;
        for(int right=0;right<nums.length;right++){
            windsum+=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right-left+1>k){
                windsum=windsum-nums[left];
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(right-left+1==k && map.size()==k){
                maxsum=Math.max(maxsum,windsum);
            }
        }
        return maxsum;
    }
}