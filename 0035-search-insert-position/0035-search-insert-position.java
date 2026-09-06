class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int start=0;
        int end=len-1;
        int ans=len;
        while(start<=end){
            int mid=(start)+(end-start)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;   
    }
}