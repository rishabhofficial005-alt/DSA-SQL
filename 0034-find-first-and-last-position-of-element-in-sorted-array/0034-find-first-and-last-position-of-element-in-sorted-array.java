class Solution {
    public int LeftSearch(int []nums, int target){
        int ans=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left)+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    } 
    public int RightSearch(int []nums, int target){
        int ans=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left)+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {

        int leftindex=LeftSearch(nums,target);
        int rightindex=RightSearch(nums,target);
        return new int[] {leftindex,rightindex};
    }
}