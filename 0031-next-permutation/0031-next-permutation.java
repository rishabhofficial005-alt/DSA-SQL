class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;

        if(n<=1){
            return;
        }

        int pivot=n-2;

        // Find pivot
        while(pivot>=0 && nums[pivot]>=nums[pivot+1]){
            pivot--;
        }

        // No greater permutation
        if(pivot==-1){
            Arrays.sort(nums);
            return;
        }

        // Find successor
        int succesor=pivot+1;

        for(int index=pivot+1;index<n;index++){
            if(nums[index]>nums[pivot] && nums[index]<=nums[succesor]){
                succesor=index;
            }
        }

        // Swap pivot and successor
        int temp=nums[succesor];
        nums[succesor]=nums[pivot];
        nums[pivot]=temp;

        // Sort suffix
        Arrays.sort(nums,pivot+1,n);
    }
}