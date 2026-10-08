class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
    int preffix_sum=0;
    int count=0;
    for(int i=0;i<nums.length;i++){
        preffix_sum+=nums[i];
        if(map.containsKey(preffix_sum-k)){
            count+=map.get(preffix_sum-k);

        }
        map.put(preffix_sum,map.getOrDefault(preffix_sum,0)+1);
        
    }
       return count;
    }
    
}
