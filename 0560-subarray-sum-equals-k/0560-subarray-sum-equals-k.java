class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int preffix_sum=0;
        for(int i=0;i<n;i++){
            preffix_sum+=nums[i];
            if(map.containsKey(preffix_sum-k)){
                count+=map.get(preffix_sum-k);
            }
            map.put(preffix_sum,map.getOrDefault(preffix_sum,0)+1);
        }
        return count;
    }
}