class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max_area=Integer.MIN_VALUE;
        while(start<end){
            int height_of_container=Math.min(height[start],height[end]);
            int width=end-start;
            int area=height_of_container*width;
            max_area=Math.max(max_area,area);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max_area;
    }
}