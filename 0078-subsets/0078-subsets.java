class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       
        List<Integer> current=new ArrayList<>();
        generatesubsequence(0,nums,current);
        return ans; 
    }
    private void  generatesubsequence(int index,int[]nums,List<Integer> current){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return ;
        }

        
        current.add(nums[index]);
        generatesubsequence(index+1,nums,current);
        current.remove(current.size()-1);
        generatesubsequence(index+1,nums,current);
        

    }
}