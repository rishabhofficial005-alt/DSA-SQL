class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int preffix_sum=0;
        for(int i=0;i<nums.length;i++){
            preffix_sum+=nums[i];
            int remainder=preffix_sum%k;
            if(map.containsKey(remainder)){
                if(i-map.get(remainder)>=2){
                    return true;
                }
            }
            else{
                map.put(remainder,i);
            }
            
        }
        return false;
    }
}