class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> first=new HashSet<>();
        HashSet<Integer> IntersectionSet=new HashSet<>();
        for(int value: nums1){
            first.add(value);
        }
        for(int value: nums2){
            if(first.contains(value)){
                IntersectionSet.add(value);
            }
        }
        ArrayList<Integer> list=new ArrayList<>(IntersectionSet);
        Collections.sort(list);
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
        
    }
}