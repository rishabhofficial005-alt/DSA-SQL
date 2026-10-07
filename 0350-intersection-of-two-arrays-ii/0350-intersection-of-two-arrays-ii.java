class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int nums: nums1){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        for(int nums: nums2){
            if(map.containsKey(nums) && map.get(nums)>0){
                list.add(nums);
                map.put(nums,map.get(nums)-1);
            }
        }
        Collections.sort(list);
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
        
        
    }
}