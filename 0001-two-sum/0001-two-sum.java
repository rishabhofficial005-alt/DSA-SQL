class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n2=target-nums[i];
            if(map.containsKey(n2)){
                return new int []{i,map.get(n2)};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}