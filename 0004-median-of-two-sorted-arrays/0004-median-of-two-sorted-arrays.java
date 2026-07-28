class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int left=0;
        int prev=0;
        int current=0;
        int right=0;
        for(int i=0;i<=(m+n)/2;i++){
            prev=current;
            if(left<m && right<n){
                if(nums1[left]<nums2[right]){
                    current=nums1[left++];
                }
                else{
                    current=nums2[right++];
                }
            }
            else if (left<m){
                current=nums1[left++];
            }
            else{
                current=nums2[right++];
            }
        }
        if((m+n)%2==0){
          return (current+prev)/2.0;
        }
        else{
            return current;
        }
       
        
    }
}