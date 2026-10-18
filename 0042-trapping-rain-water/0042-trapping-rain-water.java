class Solution {
    public int trap(int[] height) {
        if(height.length<3){
            return 0;
        }
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int total_water=0;
        while(left<right){
            if(height[left] < height[right]){
                 if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    total_water+=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    total_water+=rightmax-height[right];
                }
                right--;
            }
           

        }
        return total_water;

        
    }
}